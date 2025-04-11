public class Main {
    public static void main(String[] args) {
        
    }
}

class Cliente {
    String nome;
    String cognome;
    String dataNascita;
    String numeroTessera;
    Corso[] corsi = new Corso[10];
    Lezione[] prenotazioni = new Lezione[20];
    int corsiCount = 0;
    int prenotazioniCount = 0;

    Cliente(String nome, String cognome, String dataNascita, String numeroTessera) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.numeroTessera = numeroTessera;
    }

    void iscriviACorso(Corso corso) {
        for (int i = 0; i < corsiCount; i++) {
            if (corsi[i] == corso) return;
        }
        corsi[corsiCount++] = corso;
    }

    boolean isIscrittoAlCorso(Corso corso) {
        for (int i = 0; i < corsiCount; i++) {
            if (corsi[i] == corso) return true;
        }
        return false;
    }

    boolean prenotaLezione(Lezione lezione) {
        if (!isIscrittoAlCorso(lezione.corso)) return false;
        if (!lezione.postiDisponibili()) return false;
        if (lezione.aggiungiPartecipante(this)) {
            prenotazioni[prenotazioniCount++] = lezione;
            return true;
        }
        return false;
    }
}

class Corso {
    String nome;
    Istruttore istruttore;
    Lezione[] lezioni = new Lezione[20];
    int lezioneCount = 0;

    Corso(String nome, Istruttore istruttore) {
        this.nome = nome;
        this.istruttore = istruttore;
    }

    void aggiungiLezione(Lezione lezione) {
        lezioni[lezioneCount++] = lezione;
    }
}

class Istruttore {
    String nome;
    String areaSpecializzazione;
    String codiceID;

    Istruttore(String nome, String areaSpecializzazione, String codiceID) {
        this.nome = nome;
        this.areaSpecializzazione = areaSpecializzazione;
        this.codiceID = codiceID;
    }
}

class Lezione {
    String data;
    String orario;
    int numeroMassimoPartecipanti;
    Corso corso;
    Cliente[] partecipanti = new Cliente[50];
    int partecipantiCount = 0;

    Lezione(String data, String orario, int numeroMassimoPartecipanti, Corso corso) {
        this.data = data;
        this.orario = orario;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.corso = corso;
    }

    boolean postiDisponibili() {
        return partecipantiCount < numeroMassimoPartecipanti;
    }

    boolean aggiungiPartecipante(Cliente cliente) {
        for (int i = 0; i < partecipantiCount; i++) {
            if (partecipanti[i] == cliente) return false;
        }
        if (postiDisponibili()) {
            partecipanti[partecipantiCount++] = cliente;
            return true;
        }
        return false;
    }
}
