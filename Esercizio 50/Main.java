import java.util.ArrayList;

public class Main {

    static class Prodotto {
        String nome;
        double prezzo;

        Prodotto(String nome, double prezzo) {
            this.nome = nome;
            this.prezzo = prezzo;
        }
    }

    static class Fattura {
        String cliente;
        ArrayList<Prodotto> prodotti;
        double iva;

        Fattura(String cliente, double iva) {
            this.cliente = cliente;
            this.iva = iva;
            this.prodotti = new ArrayList<>();
        }

        void aggiungiProdotto(Prodotto p) {
            prodotti.add(p);
        }

        double calcolaTotale() {
            double totale = 0;
            for (Prodotto p : prodotti) {
                totale += p.prezzo;
            }
            return totale + (totale * iva / 100);
        }

        void stampa() {
            System.out.println("Fattura per: " + cliente);
            for (Prodotto p : prodotti) {
                System.out.println("- " + p.nome + ": " + p.prezzo + " €");
            }
            System.out.println("Totale con IVA (" + iva + "%): " + calcolaTotale() + " €");
        }
    }

    public static void main(String[] args) {
        Prodotto p1 = new Prodotto("Pasta", 3.5);
        Prodotto p2 = new Prodotto("Vino", 12.0);
        Prodotto p3 = new Prodotto("Formaggio", 7.8);

        Fattura f1 = new Fattura("Mario Rossi", 22);
        f1.aggiungiProdotto(p1);
        f1.aggiungiProdotto(p2);
        f1.aggiungiProdotto(p3);
        f1.stampa();

        Fattura f2 = new Fattura("Luigi Bianchi", 10);
        f2.aggiungiProdotto(p1);
        f2.aggiungiProdotto(p3);
        f2.stampa();
    }
}
