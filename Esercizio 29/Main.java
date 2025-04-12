public class Main {

    public static class Macchina {

        public void avvia() {
            System.out.println("La macchina è avviata.");
        }
    }

    public static class Auto extends Macchina {

        @Override
        public void avvia() {
            System.out.println("La auto è avviata.");
        }
    }

    public static class Moto extends Macchina {

        @Override
        public void avvia() {
            System.out.println("La moto è avviata.");
        }
    }

    public static void main(String[] args) {

        Auto auto = new Auto();
        Moto moto = new Moto();

        auto.avvia();
        moto.avvia();

    }
}