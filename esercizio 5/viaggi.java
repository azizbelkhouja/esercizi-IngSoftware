import java.util.ArrayList;
import java.util.List;

// 1.
interface Prenotabile {
    void prenota() throws Exception;
}

// 2.
abstract class Viaggio implements Prenotabile {

    protected String destinazione;
    protected double prezzo;
    protected boolean prenotato;

    public Viaggio(String destinazione, double prezzo) {
        this.destinazione = destinazione;
        this.prezzo = prezzo;
        this.prenotato = false;
    }

    public abstract String descrizione();

    public boolean isPrenotato() {
        return prenotato;
    }
}

// 3.
class ViaggioAereo extends Viaggio {
    private String compagniaAerea;

    public ViaggioAereo(String destinazione, double prezzo, String compagniaAerea) {
        super(destinazione, prezzo);
        this.compagniaAerea = compagniaAerea;
    }

    @Override
    public String descrizione() {
        return "Viaggio aereo per " + destinazione + " con " + compagniaAerea + " al prezzo di " + prezzo + " euro.";
    }

    @Override
    public void prenota() throws Exception {
        if (prenotato) {
            throw new Exception("Il viaggio per " + destinazione + " è già prenotato!");
        }
        prenotato = true;
        System.out.println("Prenotazione confermata per il viaggio aereo con " + compagniaAerea + ".");
    }
}

class ViaggioTreno extends Viaggio {
    private int numeroPosto;

    public ViaggioTreno(String destinazione, double prezzo, int numeroPosto) {
        super(destinazione, prezzo);
        this.numeroPosto = numeroPosto;
    }

    @Override
    public String descrizione() {
        return "Viaggio in treno per " + destinazione + " posto n. " + numeroPosto + " al prezzo di " + prezzo + " euro.";
    }

    @Override
    public void prenota() throws Exception {
        if (prenotato) {
            throw new Exception("Il viaggio per " + destinazione + " è già prenotato!");
        }
        prenotato = true;
        System.out.println("Prenotazione confermata per il viaggio in treno, posto " + numeroPosto + ".");
    }
}

// 4.
class SistemaPrenotazioni {
    private List<Viaggio> viaggi;

    public SistemaPrenotazioni() {
        viaggi = new ArrayList<>();
    }

    public void aggiungiViaggio(Viaggio viaggio) {
        viaggi.add(viaggio);
    }

    public void mostraViaggi() {
        for (Viaggio v : viaggi) {
            System.out.println(v.descrizione() + (v.isPrenotato() ? " (Prenotato)" : " (Disponibile)"));
        }
    }

    public void prenotaViaggio(Viaggio viaggio) {
        try {
            viaggio.prenota();
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}

// 5.
public class viaggi {
    public static void main(String[] args) {
        SistemaPrenotazioni sistema = new SistemaPrenotazioni();
        
        Viaggio v1 = new ViaggioAereo("Parigi", 250, "Air France");
        Viaggio v2 = new ViaggioTreno("Roma", 100, 12);
        
        sistema.aggiungiViaggio(v1);
        sistema.aggiungiViaggio(v2);
        
        sistema.mostraViaggi();
        
        sistema.prenotaViaggio(v1);
        sistema.prenotaViaggio(v1); // Tentativo di doppia prenotazione
        
        sistema.mostraViaggi();
    }
}
