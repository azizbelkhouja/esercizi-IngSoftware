import java.util.ArrayList;
import java.util.List;

// 1.
abstract class Dipendente {
    protected String nome;
    protected double stipendio;

    public Dipendente(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

    public abstract double calcolaStipendio();

    public String getNome() {
        return nome;
    }
}

// 2.
// Classe Impiegato
class Impiegato extends Dipendente {
    public Impiegato(String nome, double stipendio) {
        super(nome, stipendio);
    }

    @Override
    public double calcolaStipendio() {
        return stipendio;
    }
}

// Classe Manager
class Manager extends Dipendente {
    private double bonus;

    public Manager(String nome, double stipendio, double bonus) {
        super(nome, stipendio);
        this.bonus = bonus;
    }

    @Override
    public double calcolaStipendio() {
        return stipendio + bonus;
    }
}

// 3.
class Azienda {
    private List<Dipendente> dipendenti;

    public Azienda() {
        dipendenti = new ArrayList<>();
    }

    public void aggiungiDipendente(Dipendente d) {
        dipendenti.add(d);
    }

    public void stampaStipendi() {
        double totale = 0;
        for (Dipendente d : dipendenti) {
            double stipendio = d.calcolaStipendio();
            System.out.println(d.getNome() + " guadagna " + stipendio + " euro.");
            totale += stipendio;
        }
        System.out.println("Stipendio totale azienda: " + totale + " euro.");
    }
}

// Crea un sistema per gestire i dipendenti di un'azienda :
public class dipendenti {
    public static void main(String[] args) {
        Azienda azienda = new Azienda();
        
        azienda.aggiungiDipendente(new Impiegato("mohamed", 2000));
        azienda.aggiungiDipendente(new Manager("aziz", 3000, 1000));
        
        azienda.stampaStipendi();
    }
}