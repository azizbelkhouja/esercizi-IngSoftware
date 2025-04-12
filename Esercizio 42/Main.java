public class Main {
    public static void main(String[] args) {
        
    }
}

interface Prenotabile {
    void prenota();
    void cancella();
}

class volo implements Prenotabile {
    
    private String destinazione;
    private boolean prenotato;

    public Volo(String destinazione) {
        this.destinazione = destinazione;
        this.prenotato = false;
    }

    public void prenota() {
        if (!prenotato) {
            prenotato = true;
        }
    }

    public void cancella() {
        if (prenotato) {
            prenotato = false;
        }
    }
}

class Hotel implements Prenotabile {
        
    private String nome;
    private boolean prenotato;

    public Hotel(String nome) {
        this.nome = nome;
        this.prenotato = false;
    }

    public void prenota() {
        if (!prenotato) {
            prenotato = true;
        }
    }

    public void cancella() {
        if (prenotato) {
            prenotato = false;
        }
    }
}