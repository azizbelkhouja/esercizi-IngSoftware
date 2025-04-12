public class Main {

    public static void main(String[] args) {
        
        String[][] scacchiera = new String[8][8];

        scacchiera[0][0] = "Torre";
        scacchiera[0][1] = "Cavallo";
        scacchiera[0][2] = "Alfiere";
        scacchiera[0][3] = "Regina";
        scacchiera[0][4] = "Re";
        scacchiera[0][5] = "Alfiere";
        scacchiera[0][6] = "Cavallo";
        scacchiera[0][7] = "Torre";

        for (int i = 0; i < 8; i++) {
            scacchiera[1][i] = "Pedone";
        }

        for (int i = 0; i < 8; i++) {
            scacchiera[6][i] = "Pedone";
        }

        scacchiera[7][0] = "Torre";
        scacchiera[7][1] = "Cavallo";
        scacchiera[7][2] = "Alfiere";
        scacchiera[7][3] = "Regina";
        scacchiera[7][4] = "Re";
        scacchiera[7][5] = "Alfiere";
        scacchiera[7][6] = "Cavallo";
        scacchiera[7][7] = "Torre";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(scacchiera[i][j] != null ? scacchiera[i][j] : "Vuoto");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
