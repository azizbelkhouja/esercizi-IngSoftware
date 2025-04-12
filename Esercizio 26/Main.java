
public class Main {

    public static void main(String[] args) {

        double num1 = Double.parseDouble(args[0]);
        String operazione = args[1];
        double num2 = Double.parseDouble(args[2]);
        double risultato;

        switch (operazione) {
            case "+":
                risultato = num1 + num2;
                break;
            case "-":
                risultato = num1 - num2;
                break;
            case "*":
                risultato = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Errore: divisione per zero.");
                    return;
                }
                risultato = num1 / num2;
                break;
            default:
                System.out.println("Operazione non riconosciuta. Usa +, -, * o /");
                return;
        }

        System.out.println("Risultato: " + risultato);
    }
}