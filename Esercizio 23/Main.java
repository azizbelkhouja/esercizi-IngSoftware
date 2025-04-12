public class Main {
    public static void main(String[] args) {
        Integer[] numeri = {1, 2, 3, 4, 5};
        String[] parole = {"ciao", "mondo", "java"};

        Contatore<Integer> contatoreNumeri = new Contatore<>(numeri);
        Contatore<String> contatoreParole = new Contatore<>(parole);

        System.out.println("Numero di interi: " + contatoreNumeri.contaElementi());
        System.out.println("Numero di stringhe: " + contatoreParole.contaElementi());
    }
}
