import java.util.ArrayList;

public class Main {

    public static class Prodotto {
        private String nome;
        private String codice;
        private double prezzo;

        public Prodotto(String nome, String codice, double prezzo) {
            this.nome = nome;
            this.codice = codice;
            this.prezzo = prezzo;
        }

        public String getNome() {
            return nome;
        }

        public String getCodice() {
            return codice;
        }

        public double getPrezzo() {
            return prezzo;
        }

        @Override
        public String toString() {
            return "Prodotto: " + nome + ", Codice: " + codice + ", Prezzo: " + prezzo;
        }
    }

    public static void main(String[] args) {
        // Creazione di alcuni prodotti
        ArrayList<Prodotto> prodotti = new ArrayList<>();
        prodotti.add(new Prodotto("Pizza Margherita", "P001", 8.5));
        prodotti.add(new Prodotto("Pasta Carbonara", "P002", 10.0));
        prodotti.add(new Prodotto("Vino Rosso", "P003", 12.5));

        String codiceDaCercare = "P002";

        Prodotto prodottoTrovato = null;
        for (Prodotto p : prodotti) {
            if (p.getCodice().equals(codiceDaCercare)) {
                prodottoTrovato = p;
                break;
            }
        }

        if (prodottoTrovato != null) {
            System.out.println("Prodotto trovato: " + prodottoTrovato);
        } else {
            System.out.println("Prodotto con codice " + codiceDaCercare + " non trovato.");
        }
    }
}
