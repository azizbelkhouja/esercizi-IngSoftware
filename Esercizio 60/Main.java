import java.util.ArrayList;
import java.util.List;

public class Main {

    static class Studente {
        String nome;
        double media;
        int esami;

        public Studente(String nome, double media, int esami) {
            this.nome = nome;
            this.media = media;
            this.esami = esami;
        }

        @Override
        public String toString() {
            return nome + " - Media: " + media + ", Esami: " + esami;
        }
    }

    public static void main(String[] args) {
        List<Studente> studenti = new ArrayList<>();

        studenti.add(new Studente("Mario", 28.5, 10));
        studenti.add(new Studente("Laura", 24.0, 8));
        studenti.add(new Studente("Luca", 21.3, 12));
        studenti.add(new Studente("Chiara", 29.7, 9));

        double sommaMedie = 0;
        int sopraSoglia = 0;
        int sottoSoglia = 0;
        double soglia = 25.0;

        for (Studente s : studenti) {
            sommaMedie += s.media;
            if (s.media >= soglia) {
                sopraSoglia++;
            } else {
                sottoSoglia++;
            }
        }

        double mediaGenerale = studenti.isEmpty() ? 0 : sommaMedie / studenti.size();

        System.out.println("=== Elenco Studenti ===");
        for (Studente s : studenti) {
            System.out.println(s);
        }

        System.out.println("\n=== Statistiche ===");
        System.out.println("Media generale: " + String.format("%.2f", mediaGenerale));
        System.out.println("Studenti sopra soglia (" + soglia + "): " + sopraSoglia);
        System.out.println("Studenti sotto soglia (" + soglia + "): " + sottoSoglia);
    }
}
