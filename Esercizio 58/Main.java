public class Main {

    interface Convertibile {
        double converti(double importo, Valuta da, Valuta a);
    }

    enum Valuta {
        EURO(1.0),
        USD(1.1),
        GBP(0.85),
        TND(3.5);

        double tassoEuro;

        Valuta(double tassoEuro) {
            this.tassoEuro = tassoEuro;
        }

        public double inEuro(double importo) {
            return importo / tassoEuro;
        }

        public double daEuro(double importoEuro) {
            return importoEuro * tassoEuro;
        }
    }

    static class Convertitore implements Convertibile {
        public double converti(double importo, Valuta da, Valuta a) {
            double inEuro = da.inEuro(importo);
            return a.daEuro(inEuro);
        }
    }

    public static void main(String[] args) {
        Convertibile c = new Convertitore();

        double importo = 100;
        Valuta da = Valuta.EURO;
        Valuta a = Valuta.TND;

        double risultato = c.converti(importo, da, a);

        System.out.println(importo + " " + da + " = " + risultato + " " + a);
    }
}
