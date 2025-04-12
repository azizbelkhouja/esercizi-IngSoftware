import java.util.ArrayList;

public class Studente {
    
    private String nome;
    private String matricola;
    private int[] voti;

    public Studente(String nome, String matricola, int[] voti) {
        this.nome = nome;
        this.matricola = matricola;
        this.voti = voti;
    }

    public double calcolaMedia() {
        int somma = 0;
        for (int voto : voti) {
            somma += voto;
        }
        return (double) somma / voti.length;
    }
    
}
