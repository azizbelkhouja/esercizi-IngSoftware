class Cliente {

    private String nome;
    private String email;
    private String password;

    public Cliente(String n, String e, String p) {
        this.nome = n;
        this.email = e;
        this.password = p;
    }

    public String getNome() {
        return this.nome;
    }
}

class Piatto {
    private String nome;
    private double prezzo;

    public Piatto(String n, double p) {
        this.nome = n;
        this.prezzo = p;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPrezzo() {
        return this.prezzo;
    }
}

class Ordine {

    private Piatto[] piatti = new Piatto[10];
    private int count = 0;
    private String stato = "In preparazione";
    private String metodoPagamento;

    public void aggiungiPiatto(Piatto p) {
        if (count < piatti.length) {
            piatti[count] = p;
            count++;
        }
    }

    public double calcolaTotale() {
        double totale = 0;
        for (int i = 0; i < count; i++) {
            totale = totale + piatti[i].getPrezzo();
        }
        return totale;
    }

    public void setMetodoPagamento(String metodo) {
        this.metodoPagamento = metodo;
    }

    public void aggiornaStato(String nuovoStato) {
        this.stato = nuovoStato;
        inviaNotifica();
    }

    private void inviaNotifica() {
        System.out.println("Notifica: stato ordine cambiato a " + stato);
    }

    public String getStato() {
        return this.stato;
    }
}

class MenuRistorante {
    
    private Piatto[] piatti = new Piatto[10];
    private int count = 0;

    public void aggiungiPiatto(Piatto p) {
        if (count < piatti.length) {
            piatti[count] = p;
            count++;
        }
    }

    public void modificaPiatto(String nome, double nuovoPrezzo) {
        for (int i = 0; i < count; i++) {
            if (piatti[i].getNome().equals(nome)) {
                piatti[i] = new Piatto(nome, nuovoPrezzo);
            }
        }
    }

    public void rimuoviPiatto(String nome) {
        for (int i = 0; i < count; i++) {
            if (piatti[i].getNome().equals(nome)) {
                for (int j = i; j < count - 1; j++) {
                    piatti[j] = piatti[j + 1];
                }
                piatti[count - 1] = null;
                count--;
                break;
            }
        }
    }

    public void visualizzaMenu() {
        for (int i = 0; i < count; i++) {
            System.out.println(piatti[i].getNome() + " - €" + piatti[i].getPrezzo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MenuRistorante menu = new MenuRistorante();
        menu.aggiungiPiatto(new Piatto("Pizza Margherita", 7.5));
        menu.aggiungiPiatto(new Piatto("Spaghetti Carbonara", 8.5));

        System.out.println("--- MENU ---");
        menu.visualizzaMenu();

        Cliente cliente = new Cliente("Anna Rossi", "anna@example.com", "1234");
        Ordine ordine = new Ordine();

        ordine.aggiungiPiatto(new Piatto("Pizza Margherita", 7.5));
        ordine.aggiungiPiatto(new Piatto("Spaghetti Carbonara", 8.5));

        ordine.setMetodoPagamento("Carta di Credito");

        System.out.println("Totale ordine: €" + ordine.calcolaTotale());
        ordine.aggiornaStato("Pronto per la consegna");
    }
}