import java.util.ArrayList;
import java.util.List;

// 1.
interface Veicolo {
    void avvia();
    void ferma();
    String getTipo();
}

// 2.
abstract class MezzoDiTrasporto implements Veicolo {
    protected String targa;

    public MezzoDiTrasporto(String targa) {
        this.targa = targa;
    }

    public String getTarga() {
        return targa;
    }
}

// 3.
class Auto extends MezzoDiTrasporto {
    public Auto(String targa) {
        super(targa);
    }

    @Override
    public void avvia() {
        System.out.println("L'auto con targa " + targa + " è stata avviata.");
    }

    @Override
    public void ferma() {
        System.out.println("L'auto con targa " + targa + " è stata fermata.");
    }

    @Override
    public String getTipo() {
        return "Auto";
    }
}

class Moto extends MezzoDiTrasporto {
    public Moto(String targa) {
        super(targa);
    }

    @Override
    public void avvia() {
        System.out.println("La moto con targa " + targa + " è stata avviata.");
    }

    @Override
    public void ferma() {
        System.out.println("La moto con targa " + targa + " è stata fermata.");
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}

// 4.
public class veicoli {
    public static void main(String[] args) {
        List<Veicolo> flotta = new ArrayList<>();
        
        flotta.add(new Auto("1"));
        flotta.add(new Moto("2"));
        flotta.add(new Auto("3"));
        flotta.add(new Moto("4"));
        
        System.out.println("Avvio dei veicoli:");
        for (int i = 0; i < flotta.size(); i++) {
            Veicolo v = flotta.get(i);
            v.avvia();
        }

        
        System.out.println("\nArresto dei veicoli:");
        for (int i = 0; i < flotta.size(); i++) {
            Veicolo v = flotta.get(i);
            v.ferma();
        }
    }
}
