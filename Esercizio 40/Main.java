import java.util.Scanner;

abstract class Operazione {
    double num1, num2;

    public Operazione(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract double calcola();
}

class Somma extends Operazione {

    public Somma(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calcola() {
        return num1 + num2;
    }
}

class Sottrazione extends Operazione {

    public Sottrazione(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calcola() {
        return num1 - num2;
    }
}

class Moltiplicazione extends Operazione {

    public Moltiplicazione(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calcola() {
        return num1 * num2;
    }
}

class Divisione extends Operazione {

    public Divisione(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calcola() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Errore: divisione per zero!");
            return 0;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Inserisci il secondo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nScegli un'operazione:");
        System.out.println("1. Somma");
        System.out.println("2. Sottrazione");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");
        System.out.print("Scegli un'operazione (1/2/3/4): ");
        int scelta = scanner.nextInt();

        Operazione operazione = null;

        switch (scelta) {
            case 1:
                operazione = new Somma(num1, num2);
                break;
            case 2:
                operazione = new Sottrazione(num1, num2);
                break;
            case 3:
                operazione = new Moltiplicazione(num1, num2);
                break;
            case 4:
                operazione = new Divisione(num1, num2);
                break;
            default:
                System.out.println("Operazione non valida.");
                return;
        }

        double risultato = operazione.calcola();
        System.out.println("Risultato: " + risultato);
        scanner.close();
    }
}
