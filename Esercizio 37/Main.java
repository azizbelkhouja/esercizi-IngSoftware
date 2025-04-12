import java.util.ArrayList;

public class Main {

    public static class Prodotto {

        private String nome;
        private double prezzo;

        public Prodotto(String nome, double prezzo) {
            this.nome = nome;
            this.prezzo = prezzo;
        }

        public String getNome() {
            return nome;
        }

        public double getPrezzo() {
            return prezzo;
        }

        @Override
        public String toString() {
            return nome + " - " + prezzo;
        }
    }

    public static class Ordine {

        private ArrayList<Prodotto> prodotti;

        public Ordine() {
            prodotti = new ArrayList<>();
        }

        public void aggiungiProdotto(Prodotto prodotto) {
            prodotti.add(prodotto);
        }

        public double calcolaTotale() {
            double totale = 0;
            for (Prodotto prodotto : prodotti) {
                totale += prodotto.getPrezzo();
            }
            return totale;
        }

        public void stampaOrdine() {

            System.out.println("Prodotti nell'ordine:");
            for (Prodotto prodotto : prodotti) {
                System.out.println(prodotto);
            }
            System.out.println("Totale ordine: €" + calcolaTotale());
        }
    }

    public static class Cliente {

        private String nome;
        private ArrayList<Ordine> ordini;

        public Cliente(String nome) {
            this.nome = nome;
            this.ordini = new ArrayList<>();
        }

        public String getNome() {
            return nome;
        }

        public void aggiungiOrdine(Ordine ordine) {
            ordini.add(ordine);
        }

        public void visualizzaOrdini() {
            System.out.println("Ordini di " + nome + ":");
            for (Ordine ordine : ordini) {
                ordine.stampaOrdine();
            }
        }
    }

    public static void main(String[] args) {

        Prodotto prodotto1 = new Prodotto("Laptop", 1000);
        Prodotto prodotto2 = new Prodotto("Smartphone", 700);
        Prodotto prodotto3 = new Prodotto("Cuffie", 150);

        Cliente cliente = new Cliente("Mario Rossi");

        Ordine ordine = new Ordine();
        ordine.aggiungiProdotto(prodotto1);
        ordine.aggiungiProdotto(prodotto2);
        ordine.aggiungiProdotto(prodotto3);

        cliente.aggiungiOrdine(ordine);

        cliente.visualizzaOrdini();
    }
}
