public class Main {

    public static void main(String[] args) {
        
        int[] voti = { 8, 7, 9, 6, 10, 5, 8, 7, 9, 6 };
        Votazione v = new Votazione(voti);

        System.out.println("Voto massimo: " + v.VotoMax());
        System.out.println("Voto minimo: " + v.VotoMin());
        System.out.println("Media voti: " + v.MediaVoti());
    }
}

class Votazione {

    private int[] voti = new int[10];

    public Votazione(int[] voti) {
        this.voti = voti;
    }

    public int getVoto(int i) {
        return voti[i];
    }

    public double MediaVoti() {
        double somma = 0;
        for (int i = 0; i < voti.length; i++) {
            somma += voti[i];
        }
        return somma / voti.length;
    }

    public int VotoMax() {
        int max = voti[0];
        for (int i = 1; i < voti.length; i++) {
            if (voti[i] > max) {
                max = voti[i];
            }
        }
        return max;
    }

    public int VotoMin() {
        int min = voti[0];
        for (int i = 1; i < voti.length; i++) {
            if (voti[i] < min) {
                min = voti[i];
            }
        }
        return min;
    }

}