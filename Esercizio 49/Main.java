public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", "978-0261102385");
        Libro libro2 = new Libro("1984", "George Orwell", "978-0451524935");
        Libro libro3 = new Libro("Il Grande Gatsby", "F. Scott Fitzgerald", "978-0743273565");

        Libro[] libreria = {libro1, libro2, libro3};

        for (Libro libro : libreria) {
            
            if (libro.getISBN().equals("978-0451524935") || libro.getAutore().equals("J.R.R. Tolkien") || libro.getTitolo().equals("Il Grande Gatsby")) {
                System.out.println("Libro trovato: " + libro.toString());
            } else {
                System.out.println("Libro non trovato: " + libro.toString());
            }
        }

    }
}

class Libro {

    private String titolo;
    private String autore;
    private String ISBN;

    public Libro(String titolo, String autore, String ISBN) {
        this.titolo = titolo;
        this.autore = autore;
        this.ISBN = ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Titolo: " + titolo + ", Autore: " + autore + ", ISBN: " + ISBN;
    }


}