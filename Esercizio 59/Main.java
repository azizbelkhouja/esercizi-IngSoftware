import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static class Cliente {
        String nome;
        String email;
        List<Interazione> interazioni;

        public Cliente(String nome, String email) {
            this.nome = nome;
            this.email = email;
            this.interazioni = new ArrayList<>();
        }

        public void aggiungiInterazione(Interazione interazione) {
            interazioni.add(interazione);
        }

        @Override
        public String toString() {
            return "Cliente: " + nome + " (" + email + ")";
        }
    }

    static class Interazione {
        String tipo;
        String descrizione;
        LocalDateTime dataOra;
        Appuntamento appuntamento;

        public Interazione(String tipo, String descrizione, LocalDateTime dataOra) {
            this.tipo = tipo;
            this.descrizione = descrizione;
            this.dataOra = dataOra;
        }

        public void setAppuntamento(Appuntamento appuntamento) {
            this.appuntamento = appuntamento;
        }

        @Override
        public String toString() {
            String info = "Interazione: " + tipo + " - " + descrizione + " (" + dataOra + ")";
            if (appuntamento != null) {
                info += "\n    ↳ " + appuntamento;
            }
            return info;
        }
    }

    static class Appuntamento {
        String luogo;
        LocalDateTime dataOra;

        public Appuntamento(String luogo, LocalDateTime dataOra) {
            this.luogo = luogo;
            this.dataOra = dataOra;
        }

        @Override
        public String toString() {
            return "Appuntamento presso " + luogo + " il " + dataOra;
        }
    }

    public static void main(String[] args) {
        List<Cliente> clienti = new ArrayList<>();

        Cliente cliente1 = new Cliente("Mario Rossi", "mario.rossi@email.it");

        Interazione inter1 = new Interazione("Telefonata", "Ha chiesto info sui prodotti", LocalDateTime.now());
        Appuntamento app1 = new Appuntamento("Ufficio Roma", LocalDateTime.of(2025, 4, 15, 10, 0));
        inter1.setAppuntamento(app1);

        cliente1.aggiungiInterazione(inter1);

        Cliente cliente2 = new Cliente("Laura Bianchi", "laura.bianchi@email.it");

        Interazione inter2 = new Interazione("Email", "Richiesta preventivo", LocalDateTime.now().minusDays(1));
        cliente2.aggiungiInterazione(inter2);

        clienti.add(cliente1);
        clienti.add(cliente2);

        for (Cliente c : clienti) {
            System.out.println(c);
            for (Interazione i : c.interazioni) {
                System.out.println("  - " + i);
            }
            System.out.println();
        }
    }
}
