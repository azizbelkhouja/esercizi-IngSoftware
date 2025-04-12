import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Squadra> squadre = new ArrayList<>();

        squadre.add(new Squadra("Tigers", 30));
        squadre.add(new Squadra("Wolves", 42));
        squadre.add(new Squadra("Lions", 37));
        squadre.add(new Squadra("Eagles", 25));

        // Ordina per punti in ordine decrescente
        Collections.sort(squadre, new Comparator<Squadra>() {
            @Override
            public int compare(Squadra s1, Squadra s2) {
                return Integer.compare(s2.getPunti(), s1.getPunti());
            }
        });

        System.out.println("Classifica:");
        for (Squadra s : squadre) {
            System.out.println(s);
        }
    }
}
