public class Main {
    public static void main(String[] args) {
       
        int somma = 0;

        for (String arg : args) {
            somma = somma + Integer.parseInt(arg);
        }

        System.out.println("Somma totale: " + somma);

    }                               
}
