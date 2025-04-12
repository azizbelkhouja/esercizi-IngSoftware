import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animale> animali = new ArrayList<>();

        animali.add(new Cane());
        animali.add(new Gatto());
        animali.add(new Cane());

        for (Animale a : animali) {
            a.verso();
        }
    }
}
