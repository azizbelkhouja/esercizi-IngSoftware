import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nessuna parola fornita.");
            return;
        }

        Arrays.sort(args);

        System.out.println("Parole ordinate alfabeticamente:");
        for (String parola : args) {
            System.out.println(parola);
        }
    }
}
