public class Main {

    abstract static class MaterialeBibliotecario {
        private String titolo;
        private String autore;
        private boolean prestato;

        public MaterialeBibliotecario(String titolo, String autore) {
            this.titolo = titolo;
            this.autore = autore;
            this.prestato = false;
        }

        public String getTitolo() {
            return titolo;
        }

        public String getAutore() {
            return autore;
        }

        public boolean isPrestato() {
            return prestato;
        }

        public void setPrestato(boolean prestato) {
            this.prestato = prestato;
        }

        @Override
        public String toString() {
            return titolo + " di " + autore;
        }
    }

    interface Prestabile {
        void presta();
        void restituisci();
    }

    static class Libro extends MaterialeBibliotecario implements Prestabile {

        public Libro(String titolo, String autore) {
            super(titolo, autore);
        }

        @Override
        public void presta() {
            if (!isPrestato()) {
                setPrestato(true);
                System.out.println("Il libro '" + getTitolo() + "' è stato prestato.");
            } else {
                System.out.println("Il libro '" + getTitolo() + "' è già stato prestato.");
            }
        }

        @Override
        public void restituisci() {
            if (isPrestato()) {
                setPrestato(false);
                System.out.println("Il libro '" + getTitolo() + "' è stato restituito.");
            } else {
                System.out.println("Il libro '" + getTitolo() + "' non è stato preso in prestito.");
            }
        }
    }

    static class Rivista extends MaterialeBibliotecario implements Prestabile {

        public Rivista(String titolo, String autore) {
            super(titolo, autore);
        }

        @Override
        public void presta() {
            if (!isPrestato()) {
                setPrestato(true);
                System.out.println("La rivista '" + getTitolo() + "' è stata prestata.");
            } else {
                System.out.println("La rivista '" + getTitolo() + "' è già stata prestata.");
            }
        }

        @Override
        public void restituisci() {
            if (isPrestato()) {
                setPrestato(false);
                System.out.println("La rivista '" + getTitolo() + "' è stata restituita.");
            } else {
                System.out.println("La rivista '" + getTitolo() + "' non è stata presa in prestito.");
            }
        }
    }

    public static void main(String[] args) {
        MaterialeBibliotecario libro = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien");
        MaterialeBibliotecario rivista = new Rivista("National Geographic", "Various");

        System.out.println("Gestione prestito e restituzione dei materiali:\n");

        ((Prestabile) libro).presta();
        ((Prestabile) libro).presta();
        ((Prestabile) libro).restituisci();
        ((Prestabile) libro).restituisci();

        System.out.println();

        ((Prestabile) rivista).presta();
        ((Prestabile) rivista).presta();
        ((Prestabile) rivista).restituisci();
        ((Prestabile) rivista).restituisci();
    }
}
