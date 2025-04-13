import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static class Atleta implements Comparable<Atleta> {
        String nome;
        double tempo;

        Atleta(String nome, double tempo) {
            this.nome = nome;
            this.tempo = tempo;
        }


        @Override
        public int compareTo(Atleta altro) {
            return Double.compare(this.tempo, altro.tempo);
        }

        @Override
        public String toString() {
            return nome + " - Tempo: " + tempo;
        }
    }

    public static void main(String[] args) {
        ArrayList<Atleta> gara = new ArrayList<>();
        gara.add(new Atleta("Luca", 12.4));
        gara.add(new Atleta("Marco", 11.8));
        gara.add(new Atleta("Giulia", 13.1));
        gara.add(new Atleta("Sara", 11.5));

        Collections.sort(gara);

        for (int i = 0; i < gara.size(); i++) {
            System.out.println((i + 1) + "° " + gara.get(i));
        }
    }
}
