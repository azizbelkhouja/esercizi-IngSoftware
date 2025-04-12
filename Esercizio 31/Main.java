import java.util.ArrayList;

public class Main {

    public static class Libro {

        private String titolo;
        private String autore;
        private int anno;

        public Libro(String titolo, String autore, int anno) {
            this.titolo = titolo;
            this.autore = autore;
            this.anno = anno;
        }

        @Override
        public String toString() {
            return "Titolo: " + titolo + ", Autore: " + autore + ", Anno: " + anno;
        }
    }

    public static void main(String[] args) {
        ArrayList<Libro> biblioteca = new ArrayList<>();

        biblioteca.add(new Libro("Il Piccolo Principe", "Antoine de Saint-Exupéry", 1943));
        biblioteca.add(new Libro("1984", "George Orwell", 1949));
        biblioteca.add(new Libro("Il Gattopardo", "Giuseppe Tomasi di Lampedusa", 1958));
        biblioteca.add(new Libro("La Divina Commedia", "Dante Alighieri", 1320));

        System.out.println("Lista dei libri in biblioteca:");
        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }
    }
}