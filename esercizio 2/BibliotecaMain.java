import java.util.ArrayList;
import java.util.List;

// 1.
abstract class MaterialeBibliotecario {
    protected String titolo;
    protected int annoPubblicazione;

    public MaterialeBibliotecario(String titolo, int annoPubblicazione) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
    }

    public abstract void mostraDettagli();
}

// 2.
class Libro extends MaterialeBibliotecario {
    private String autore;

    public Libro(String titolo, int annoPubblicazione, String autore) {
        super(titolo, annoPubblicazione);
        this.autore = autore;
    }

    @Override
    public void mostraDettagli() {
        System.out.println("Libro: " + titolo + ", Autore: " + autore + ", Anno: " + annoPubblicazione);
    }
}

class Rivista extends MaterialeBibliotecario {
    private int numeroEdizione;

    public Rivista(String titolo, int annoPubblicazione, int numeroEdizione) {
        super(titolo, annoPubblicazione);
        this.numeroEdizione = numeroEdizione;
    }

    @Override
    public void mostraDettagli() {
        System.out.println("Rivista: " + titolo + ", Edizione: " + numeroEdizione + ", Anno: " + annoPubblicazione);
    }
}

// 3.
class Biblioteca {
    private List<MaterialeBibliotecario> materiali;

    public Biblioteca() {
        this.materiali = new ArrayList<>();
    }

    public void aggiungiMateriale(MaterialeBibliotecario materiale) {
        materiali.add(materiale);
        System.out.println("Materiale aggiunto: " + materiale.titolo);
    }

    public void rimuoviMateriale(String titolo) {
        materiali.removeIf(materiale -> materiale.titolo.equalsIgnoreCase(titolo));
        System.out.println("Materiale rimosso: " + titolo);
    }

    public void visualizzaMateriali() {
        if (materiali.isEmpty()) {
            System.out.println("La biblioteca è vuota.");
        } else {
            for (MaterialeBibliotecario materiale : materiali) {
                materiale.mostraDettagli();
            }
        }
    }
}

// 4.
public class BibliotecaMain {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        Libro libro1 = new Libro("Il Signore degli Anelli", 1954, "J.R.R. Tolkien");
        Rivista rivista1 = new Rivista("National Geographic", 2023, 5);
        
        biblioteca.aggiungiMateriale(libro1);
        biblioteca.aggiungiMateriale(rivista1);
        
        System.out.println("Materiali in biblioteca:");
        biblioteca.visualizzaMateriali();
        
        biblioteca.rimuoviMateriale("National Geographic");
        System.out.println("Dopo la rimozione:");
        biblioteca.visualizzaMateriali();
    }
}
