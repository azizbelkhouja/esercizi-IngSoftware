import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static class VoceDiario {
        
        private String testo;
        private LocalDate data;

        public VoceDiario(String testo, LocalDate data) {
            this.testo = testo;
            this.data = data;
        }

        public String getTesto() {
            return testo;
        }

        public LocalDate getData() {
            return data;
        }

        @Override
        public String toString() {
            return "Data: " + data + " - " + testo;
        }
    }

    public static void main(String[] args) {
        ArrayList<VoceDiario> diario = new ArrayList<>();

        // Aggiungiamo alcune voci al diario
        diario.add(new VoceDiario("Oggi ho studiato Java.", LocalDate.now()));
        diario.add(new VoceDiario("Ho fatto una passeggiata al parco.", LocalDate.now().minusDays(1)));
        diario.add(new VoceDiario("Ho visto un film.", LocalDate.now().minusDays(2)));
        diario.add(new VoceDiario("Sono andato a fare la spesa.", LocalDate.now().minusDays(3)));
        diario.add(new VoceDiario("Ho cucinato una torta.", LocalDate.now().minusDays(4)));
        diario.add(new VoceDiario("Oggi ho lavorato al progetto.", LocalDate.now().minusDays(5)));
        diario.add(new VoceDiario("Ho incontrato degli amici.", LocalDate.now().minusDays(6)));
        diario.add(new VoceDiario("Ho letto un libro.", LocalDate.now().minusDays(7)));

        LocalDate limite = LocalDate.now().minusDays(7);

        System.out.println("Voci degli ultimi 7 giorni:");
        for (VoceDiario voce : diario) {
            if (!voce.getData().isBefore(limite)) {
                System.out.println(voce);
            }
        }
    }
}
