public class Stampa {
    private String prefisso;

    public Stampa(String prefisso) {
        this.prefisso = prefisso;
    }

    public Stampa() {
        this.prefisso = "Testo:";
    }

    public void print(String s) {
        System.out.println(prefisso + " " + s);
    }

    public static void main(String[] args) {
        Stampa stampa1 = new Stampa("Questa classe stampa:");
        stampa1.print("CIAO");

        Stampa stampa2 = new Stampa();
        stampa2.print("CIAO");
    }
}
