public class Main {
    
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 22, 59, 47, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int numero : array) {

            if (numero % 2 == 0) {
                System.out.println(numero + " è pari");
            }
        }
    }
}
