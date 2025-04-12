public class Main {

    public interface Pagabile {
        double calcolaTotale();
    }

    public static class Fattura implements Pagabile {
        
        private double importo;
        private double IVA;

        public Fattura(double importo, double IVA) {
            this.importo = importo;
            this.IVA = IVA;
        }

        @Override
        public double calcolaTotale() {
            return importo + (importo * IVA / 100);
        }
    }

    public static class Abbonamento implements Pagabile {
        private double quotaMensile;
        private int mesi;

        public Abbonamento(double quotaMensile, int mesi) {
            this.quotaMensile = quotaMensile;
            this.mesi = mesi;
        }

        @Override
        public double calcolaTotale() {
            return quotaMensile * mesi;
        }
    }

    public static void main(String[] args) {
        Fattura fattura = new Fattura(100, 22);  // Importo: 100, IVA: 22%
        Abbonamento abbonamento = new Abbonamento(50, 12);  // Quota mensile: 50, Mesi: 12

        System.out.println("Totale da pagare per la Fattura: " + fattura.calcolaTotale());
        System.out.println("Totale da pagare per l'Abbonamento: " + abbonamento.calcolaTotale());
    }
}
