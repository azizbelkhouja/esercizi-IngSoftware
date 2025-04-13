
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Appuntamento appuntamento1 = new Appuntamento("2023-10-01", "10:00", "Colloquio di lavoro");
        Appuntamento appuntamento2 = new Appuntamento("2023-10-02", "14:00", "Visita medica");
        Appuntamento appuntamento3 = new Appuntamento("2023-10-03", "16:00", "Lezione di yoga");

        Appuntamento agenda = new Appuntamento("", "", "");
        agenda.aggiungiAppuntamento(appuntamento1);
        agenda.aggiungiAppuntamento(appuntamento2);
        agenda.aggiungiAppuntamento(appuntamento3);

        System.out.println("Appuntamenti:");
        agenda.visualizzaAppuntamenti();
    }
}

class Appuntamento {

    private String data;
    private String ora;
    private String descrizione;

    public Appuntamento(String data, String ora, String descrizione) {

        this.data = data;
        this.ora = ora;
        this.descrizione = descrizione;
    }

    ArrayList<Appuntamento> appuntamenti = new ArrayList<>();

    public void aggiungiAppuntamento(Appuntamento appuntamento) {
        appuntamenti.add(appuntamento);
    }

    public void visualizzaAppuntamenti() {
        for (Appuntamento appuntamento : appuntamenti) {
            System.out.println("Data: " + appuntamento.data + ", Ora: " + appuntamento.ora + ", Descrizione: " + appuntamento.descrizione);
        }
    }
}