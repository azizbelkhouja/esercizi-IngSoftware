import java.util.*;

class Persona {
    protected String nome;
    protected String email;

    public Persona(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}

class Utente extends Persona {
    private List<Prenotazione> prenotazioni = new ArrayList<>();

    public Utente(String nome, String email) {
        super(nome, email);
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void aggiungiPrenotazione(Prenotazione p) {
        prenotazioni.add(p);
    }

    public void rimuoviPrenotazione(Prenotazione p) {
        prenotazioni.remove(p);
    }
}

class StaffBiblioteca extends Persona {
    public StaffBiblioteca(String nome, String email) {
        super(nome, email);
    }

    public void aggiungiLibro(Biblioteca biblio, Libro libro) {
        biblio.aggiungiLibro(libro);
    }

    public void rimuoviLibro(Biblioteca biblio, Libro libro) {
        biblio.rimuoviLibro(libro);
    }
}

class Libro {
    private String titolo;
    private String autore;
    private boolean disponibile = true;

    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }
}

class Prenotazione {
    private Utente utente;
    private Libro libro;
    private Date dataPrenotazione;

    public Prenotazione(Utente utente, Libro libro) {
        this.utente = utente;
        this.libro = libro;
        this.dataPrenotazione = new Date();
    }

    public Utente getUtente() {
        return utente;
    }

    public Libro getLibro() {
        return libro;
    }
}

class Biblioteca {
    private List<Libro> libriDisponibili = new ArrayList<>();
    private List<Prenotazione> prenotazioni = new ArrayList<>();

    public void aggiungiLibro(Libro libro) {
        libriDisponibili.add(libro);
    }

    public void rimuoviLibro(Libro libro) {
        libriDisponibili.remove(libro);
    }

    public boolean prenotaLibro(Utente utente, Libro libro) {
        if (libro.isDisponibile()) {
            Prenotazione p = new Prenotazione(utente, libro);
            prenotazioni.add(p);
            utente.aggiungiPrenotazione(p);
            libro.setDisponibile(false);
            return true;
        }
        return false;
    }

    public boolean annullaPrenotazione(Utente utente, Libro libro) {
        Prenotazione toRemove = null;
        for (Prenotazione p : prenotazioni) {
            if (p.getUtente().equals(utente) && p.getLibro().equals(libro)) {
                toRemove = p;
                break;
            }
        }
        if (toRemove != null) {
            prenotazioni.remove(toRemove);
            utente.rimuoviPrenotazione(toRemove);
            libro.setDisponibile(true);
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        StaffBiblioteca staff = new StaffBiblioteca("Mario", "mario@biblioteca.it");
        Utente utente = new Utente("Lucia", "lucia@email.com");

        Libro libro = new Libro("Il Gattopardo", "Tomasi di Lampedusa");
        staff.aggiungiLibro(biblioteca, libro);

        System.out.println("Prenotazione in corso...");
        boolean prenotato = biblioteca.prenotaLibro(utente, libro);
        System.out.println(prenotato ? "Prenotazione effettuata." : "Libro non disponibile.");

        System.out.println("Annullamento in corso...");
        boolean annullato = biblioteca.annullaPrenotazione(utente, libro);
        System.out.println(annullato ? "Prenotazione annullata." : "Prenotazione non trovata.");
    }
}
