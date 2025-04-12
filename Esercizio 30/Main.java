public class Main {

    public static void main(String[] args) {
        
        for (String arg : args) {

            if (arg.length() > 4) {
                System.out.println(arg + " è lungo più di 5 caratteri.");
            }
        }
    }
}