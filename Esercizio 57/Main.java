import java.util.*;
import java.time.*;

public class Main {

    static class Studente {
        String nome;

        Studente(String nome) {
            this.nome = nome;
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Studente studente) {
                return nome.equals(studente.nome);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return nome.hashCode();
        }
        
        @Override
        public String toString() {
            return nome;
        }
    }

    public static void main(String[] args) {
        Map<Studente, List<LocalDate>> registro = new HashMap<>();

        Studente s1 = new Studente("Luca");
        Studente s2 = new Studente("Giulia");

        registro.put(s1, new ArrayList<>());
        registro.put(s2, new ArrayList<>());

        registro.get(s1).add(LocalDate.of(2024, 4, 1));
        registro.get(s1).add(LocalDate.of(2024, 4, 3));
        registro.get(s2).add(LocalDate.of(2024, 4, 1));
        registro.get(s2).add(LocalDate.of(2024, 4, 2));
        registro.get(s2).add(LocalDate.of(2024, 4, 3));

        for (Studente s : registro.keySet()) {
            System.out.println(s + " - Presenze: " + registro.get(s).size());
            for (LocalDate d : registro.get(s)) {
                System.out.println("  " + d);
            }
        }
    }
}
