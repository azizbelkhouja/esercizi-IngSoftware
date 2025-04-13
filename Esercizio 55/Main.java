import java.util.*;

public class Main {

    interface Domanda {
        void rispondi(String risposta);
        void stampaStatistiche();
    }

    static class DomandaSiNo implements Domanda {
        String testo;
        int si = 0;
        int no = 0;

        DomandaSiNo(String testo) {
            this.testo = testo;
        }

        public void rispondi(String risposta) {
            if (risposta.equalsIgnoreCase("si")) si++;
            else if (risposta.equalsIgnoreCase("no")) no++;
        }

        public void stampaStatistiche() {
            System.out.println(testo);
            System.out.println("Si: " + si);
            System.out.println("No: " + no);
        }
    }

    static class DomandaScala implements Domanda {
        String testo;
        int[] conteggi = new int[5];

        DomandaScala(String testo) {
            this.testo = testo;
        }

        public void rispondi(String risposta) {
            int valore = Integer.parseInt(risposta);
            if (valore >= 1 && valore <= 5) {
                conteggi[valore - 1]++;
            }
        }

        public void stampaStatistiche() {
            System.out.println(testo);
            for (int i = 0; i < 5; i++) {
                System.out.println((i + 1) + ": " + conteggi[i]);
            }
        }
    }

    public static void main(String[] args) {
        List<Domanda> sondaggio = new ArrayList<>();

        DomandaSiNo d1 = new DomandaSiNo("Ti piace il caffè?");
        DomandaScala d2 = new DomandaScala("Quanto sei soddisfatto (1-5)?");

        sondaggio.add(d1);
        sondaggio.add(d2);

        d1.rispondi("si");
        d1.rispondi("no");
        d1.rispondi("si");
        d1.rispondi("si");

        d2.rispondi("5");
        d2.rispondi("4");
        d2.rispondi("5");
        d2.rispondi("3");
        d2.rispondi("4");

        for (Domanda d : sondaggio) {
            d.stampaStatistiche();
        }
    }
}
