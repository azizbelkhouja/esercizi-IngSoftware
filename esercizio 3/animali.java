import java.util.ArrayList;
import java.util.List;

// 1.
interface Animale {
    void emettiVerso();
    void muoviti();
}

// 2.
abstract class AnimaleBase implements Animale {
    protected String nome;

    public AnimaleBase(String nome) {
        this.nome = nome;
    }
}

// 3.
class Cane extends AnimaleBase {
    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void emettiVerso() {
        System.out.println(nome + " abbaia: Bau Bau!");
    }

    @Override
    public void muoviti() {
        System.out.println(nome + " corre felice!");
    }
}

class Gatto extends AnimaleBase {
    public Gatto(String nome) {
        super(nome);
    }

    @Override
    public void emettiVerso() {
        System.out.println(nome + " miagola: Miao Miao!");
    }

    @Override
    public void muoviti() {
        System.out.println(nome + " cammina elegantemente!");
    }
}

// 4.
public class animali {
    public static void main(String[] args) {
        List<Animale> animali = new ArrayList<>();
        
        animali.add(new Cane("Fido"));
        animali.add(new Gatto("Whiskers"));
        animali.add(new Cane("Rex"));
        animali.add(new Gatto("Luna"));
        
        for (Animale animale : animali) {
            animale.emettiVerso();
            animale.muoviti();
            System.out.println();
        }
    }
}
