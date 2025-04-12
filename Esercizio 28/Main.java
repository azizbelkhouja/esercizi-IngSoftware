public class Main {

    public static void main(String[] args) {

        int[][] presenze = {
            {1, 1, 1, 1, 0, 1, 1}, // Studente 1
            {1, 0, 1, 0, 1, 1, 0}, // Studente 2
            {1, 1, 1, 1, 1, 1, 1}, // Studente 3
            {0, 1, 1, 0, 1, 1, 1}, // Studente 4
            {1, 1, 1, 1, 1, 0, 0}  // Studente 5
        };

        for (int i = 0; i < presenze.length; i++) {
            int totalePresenze = 0;
            for (int j = 0; j < presenze[i].length; j++) {
                totalePresenze += presenze[i][j];
            }
            System.out.println("Studente " + (i + 1) + " ha " + totalePresenze + " presenze totali.");
        }
    }
}
