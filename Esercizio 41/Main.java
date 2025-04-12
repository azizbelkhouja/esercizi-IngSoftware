
import java.util.ArrayList;

public class Main {

    public static void main(String[] args ) {

        Studente studente = new Studente("Mario", "Rossi", 20);
        Insegnante insegnante = new Insegnante("Giovanni", "Verdi", 40);
        ArrayList<Persona> persone = new ArrayList<>();

        persone.add(studente);
        persone.add(insegnante);
        persone.add(new Studente("Luca", "Bianchi", 24));

        for (Persona persona : persone) {
            System.out.println("Nome: " + persona.getNome() + ", Cognome: " + persona.getCognome() + ", Eta: " + persona.getEta());
        }

    }
}

class Persona {

    private String nome;
    private String cognome;
    private int eta;

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

}

class Studente extends Persona {

    public Studente(String nome, String cognome, int eta) {
        super(nome, cognome, eta);
    }
}

class Insegnante extends Persona {

    public Insegnante(String nome, String cognome, int eta) {
        super(nome, cognome, eta);
    }

}

