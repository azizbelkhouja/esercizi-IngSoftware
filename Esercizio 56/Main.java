public class Main {

    public static void main(String[] args) {
        int[][] griglia = new int[5][5];
        griglia[1][2] = 1;
        griglia[2][3] = 1;
        griglia[4][0] = 1;

        int naviTotali = 3;
        int colpiti = 0;

        int[][] tiri = {
            {0, 0}, {1, 2}, {2, 3}, {3, 3}, {4, 0}
        };

        for (int i = 0; i < tiri.length && colpiti < naviTotali; i++) {
            int r = tiri[i][0];
            int c = tiri[i][1];

            if (griglia[r][c] == 1) {
                System.out.println("Colpito in " + r + "," + c);
                griglia[r][c] = 0;
                colpiti++;
            } else {
                System.out.println("Mancato in " + r + "," + c);
            }
        }

        if (colpiti == naviTotali) {
            System.out.println("Tutte le navi affondate!");
        } else {
            System.out.println("Navi rimaste.");
        }
    }
}
