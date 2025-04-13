public class Main {

    public static void main(String[] args) {

        CartaDiCredito carta = new CartaDiCredito();
        PayPal paypal = new PayPal();

        MetodoPagamento metodo = carta; // Polimorfismo: assegnazione di un oggetto di una sottoclasse a una variabile di tipo padre
        metodo.paga(); // Chiamata al metodo paga() della classe CartaDiCredito

        metodo = paypal; // Cambia il riferimento a PayPal
        metodo.paga(); // Chiamata al metodo paga() della classe PayPal
    }
    
}

interface MetodoPagamento {
    void paga();
}

class CartaDiCredito implements MetodoPagamento {
    @Override
    public void paga() {
        System.out.println("Pagamento con carta di credito");
    }
}

class PayPal implements MetodoPagamento {
    @Override
    public void paga() {
        System.out.println("Pagamento con PayPal");
    }
}