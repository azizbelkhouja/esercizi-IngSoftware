import java.util.ArrayList;

public class Main {

    static class Inventario<T> {
        ArrayList<T> oggetti = new ArrayList<>();
        ArrayList<Integer> quantita = new ArrayList<>();

        void aggiungi(T oggetto, int q) {
            for (int i = 0; i < oggetti.size(); i++) {
                if (oggetti.get(i).equals(oggetto)) {
                    quantita.set(i, quantita.get(i) + q);
                    return;
                }
            }
            oggetti.add(oggetto);
            quantita.add(q);
        }

        void rimuovi(T oggetto) {
            for (int i = 0; i < oggetti.size(); i++) {
                if (oggetti.get(i).equals(oggetto)) {
                    oggetti.remove(i);
                    quantita.remove(i);
                    return;
                }
            }
        }

        int cerca(T oggetto) {
            for (int i = 0; i < oggetti.size(); i++) {
                if (oggetti.get(i).equals(oggetto)) {
                    return quantita.get(i);
                }
            }
            return -1;
        }

        void stampa() {
            for (int i = 0; i < oggetti.size(); i++) {
                System.out.println(oggetti.get(i) + " - Quantità: " + quantita.get(i));
            }
        }
    }

    static class Prodotto {
        String nome;

        Prodotto(String nome) {
            this.nome = nome;
        }

        public String toString() {
            return nome;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Prodotto) {
                return this.nome.equals(((Prodotto) obj).nome);
            }
            return false;
        }
    }

    static class Strumento {
        String nome;

        Strumento(String nome) {
            this.nome = nome;
        }

        public String toString() {
            return nome;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Strumento) {
                return this.nome.equals(((Strumento) obj).nome);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Inventario<Prodotto> inventarioProdotti = new Inventario<>();
        inventarioProdotti.aggiungi(new Prodotto("Pasta"), 10);
        inventarioProdotti.aggiungi(new Prodotto("Vino"), 5);
        inventarioProdotti.aggiungi(new Prodotto("Pasta"), 3);
        inventarioProdotti.rimuovi(new Prodotto("Vino"));
        inventarioProdotti.stampa();

        System.out.println();

        Inventario<Strumento> inventarioStrumenti = new Inventario<>();
        inventarioStrumenti.aggiungi(new Strumento("Cacciavite"), 7);
        inventarioStrumenti.aggiungi(new Strumento("Martello"), 4);
        inventarioStrumenti.stampa();
    }
}
