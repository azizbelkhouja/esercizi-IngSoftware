import java.util.HashMap;

class Magazzino<T> {

    private HashMap<T, Integer> inventario = new HashMap<>();

    public void aggiungi(T prodotto, int quantita) {
        inventario.put(prodotto, inventario.getOrDefault(prodotto, 0) + quantita);
    }

    public void rimuovi(T prodotto, int quantita) {
        if (inventario.containsKey(prodotto)) {
            int attuale = inventario.get(prodotto);
            if (attuale <= quantita) {
                inventario.remove(prodotto);
            } else {
                inventario.put(prodotto, attuale - quantita);
            }
        }
    }

    public void stampaInventario() {
        for (T prodotto : inventario.keySet()) {
            System.out.println(prodotto + " - Quantita: " + inventario.get(prodotto));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Magazzino<String> magazzino = new Magazzino<>();

        magazzino.aggiungi("Pasta", 50);
        magazzino.aggiungi("Olio", 20);
        magazzino.aggiungi("Pane", 15);
        magazzino.rimuovi("Olio", 25);

        magazzino.stampaInventario();
    }
}
