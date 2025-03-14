import java.util.ArrayList;
import java.util.List;

// 1.
interface Pagabile {
    void effettuaPagamento(double importo) throws SaldoInsufficienteException;
}

class SaldoInsufficienteException extends Exception {
    public SaldoInsufficienteException(String messaggio) {
        super(messaggio);
    }
}

// 2.
abstract class MetodoPagamento implements Pagabile {
    protected double saldoDisponibile;

    public MetodoPagamento(double saldoDisponibile) {
        this.saldoDisponibile = saldoDisponibile;
    }

    public double getSaldoDisponibile() {
        return saldoDisponibile;
    }
}

// 3.
class CartaDiCredito extends MetodoPagamento {
    private String numeroCarta;

    public CartaDiCredito(double saldoDisponibile, String numeroCarta) {
        super(saldoDisponibile);
        this.numeroCarta = numeroCarta;
    }

    @Override
    public void effettuaPagamento(double importo) throws SaldoInsufficienteException {
        if (importo > saldoDisponibile) {
            throw new SaldoInsufficienteException("Saldo insufficiente sulla carta di credito.");
        }
        saldoDisponibile -= importo;
        System.out.println("Pagamento di " + importo + " effettuato con Carta di Credito " + numeroCarta);
    }
}

class PayPal extends MetodoPagamento {
    private String email;

    public PayPal(double saldoDisponibile, String email) {
        super(saldoDisponibile);
        this.email = email;
    }

    @Override
    public void effettuaPagamento(double importo) throws SaldoInsufficienteException {
        if (importo > saldoDisponibile) {
            throw new SaldoInsufficienteException("Saldo insufficiente su PayPal.");
        }
        saldoDisponibile -= importo;
        System.out.println("Pagamento di " + importo + " effettuato con PayPal (" + email + ")");
    }
}

// 4.
class SistemaPagamenti {
    private List<MetodoPagamento> metodiPagamento;

    public SistemaPagamenti() {
        metodiPagamento = new ArrayList<>();
    }

    public void aggiungiMetodoPagamento(MetodoPagamento metodo) {
        metodiPagamento.add(metodo);
    }

    public void effettuaPagamentoConMetodo(int indice, double importo) {
        if (indice < 0 || indice >= metodiPagamento.size()) {
            System.out.println("Metodo di pagamento non valido.");
            return;
        }
        try {
            metodiPagamento.get(indice).effettuaPagamento(importo);
        } catch (SaldoInsufficienteException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}

// 5.
public class pagamenti {
    public static void main(String[] args) {
        SistemaPagamenti sistema = new SistemaPagamenti();
        
        CartaDiCredito carta = new CartaDiCredito(1000, "1234-5678-9012-3456");
        PayPal paypal = new PayPal(500, "aziz@gmail.com");
        
        sistema.aggiungiMetodoPagamento(carta);
        sistema.aggiungiMetodoPagamento(paypal);
        
        sistema.effettuaPagamentoConMetodo(0, 200);
        sistema.effettuaPagamentoConMetodo(1, 600);
    }
}