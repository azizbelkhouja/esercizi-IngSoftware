import java.util.*;

enum TipoImballo { BUSTA, PACCO_PICCOLO, PACCO_MEDIO, PACCO_GRANDE, TUBO }
enum TipoServizio { PREMIUM, EXPRESS, STANDARD }
enum StatoSpedizione { RITIRATA, CONSEGNATA, GIACENZA, RESTITUITA }

class Cliente {
    private String nome;
    private String cognome;
    private String ragioneSociale;
    private String recapito;
    private String metodoPagamento; // "Carta" o "Addebito"
    private String cartaCredito;
    private String coordinateBancarie;

    public Cliente(String nome, String cognome, String recapito) {
        this.nome = nome;
        this.cognome = cognome;
        this.recapito = recapito;
    }

    public void setPagamentoCarta(String carta) {
        metodoPagamento = "Carta";
        cartaCredito = carta;
    }

    public void setPagamentoAddebito(String iban) {
        metodoPagamento = "Addebito";
        coordinateBancarie = iban;
    }

    public String getRecapito() {
        return recapito;
    }
}

class Pacco {
    private TipoImballo imballo;
    private double peso;
    private double valore;

    public Pacco(TipoImballo imballo, double peso, double valore) {
        this.imballo = imballo;
        this.peso = peso;
        this.valore = valore;
    }

    public double getPeso() {
        return peso;
    }

    public double getValore() {
        return valore;
    }
}

class Corriere {
    private String nome;

    public Corriere(String nome) {
        this.nome = nome;
    }
}

class Spedizione {
    private Cliente mittente;
    private String destinatario;
    private String indirizzoDestinatario;
    private TipoServizio servizio;
    private boolean assicurata;
    private double distanza;
    private Pacco[] pacchi;
    private int count;
    private double costo;
    private Corriere corriereRitiro;
    private Corriere corriereConsegna;
    private StatoSpedizione stato;
    private Date dataRitiro;
    private Date dataConsegna;

    public Spedizione(Cliente mittente, String destinatario, String indirizzo, TipoServizio servizio, double distanza, boolean assicurata) {
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.indirizzoDestinatario = indirizzo;
        this.servizio = servizio;
        this.distanza = distanza;
        this.assicurata = assicurata;
        this.pacchi = new Pacco[10];
        this.count = 0;
    }

    public void aggiungiPacco(Pacco p) {
        if (count < 10) {
            pacchi[count++] = p;
        }
    }

    public void ritira(Corriere c) {
        corriereRitiro = c;
        dataRitiro = new Date();
        stato = StatoSpedizione.RITIRATA;
    }

    public void consegna(Corriere c) {
        corriereConsegna = c;
        dataConsegna = new Date();
        stato = StatoSpedizione.CONSEGNATA;
    }

    public void inGiacenza() {
        stato = StatoSpedizione.GIACENZA;
    }

    public void restituisci() {
        stato = StatoSpedizione.RESTITUITA;
    }

    public double calcolaCosto() {
        double base = distanza * 0.5;
        if (servizio == TipoServizio.PREMIUM) base += 20;
        else if (servizio == TipoServizio.EXPRESS) base += 10;

        for (int i = 0; i < count; i++) {
            base += pacchi[i].getPeso() * 2;
            if (assicurata) base += pacchi[i].getValore() * 0.01;
        }

        this.costo = base;
        return base;
    }

    public void stampaInfo() {
        System.out.println("Spedizione a " + destinatario + " - Stato: " + stato);
        System.out.println("Costo: €" + costo);
        if (dataRitiro != null) System.out.println("Ritiro: " + dataRitiro);
        if (dataConsegna != null) System.out.println("Consegna: " + dataConsegna);
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mario", "Rossi", "Via Roma 1, Milano");
        cliente.setPagamentoCarta("1234-5678-9012-3456");

        Spedizione spedizione = new Spedizione(cliente, "Luca Verdi", "Via Napoli 10, Roma", TipoServizio.EXPRESS, 600, true);
        spedizione.aggiungiPacco(new Pacco(TipoImballo.PACCO_MEDIO, 3.5, 100));
        spedizione.aggiungiPacco(new Pacco(TipoImballo.BUSTA, 0.5, 20));

        spedizione.calcolaCosto();

        Corriere corriereRitiro = new Corriere("Marco Bianchi");
        spedizione.ritira(corriereRitiro);

        Corriere corriereConsegna = new Corriere("Giulia Neri");
        spedizione.consegna(corriereConsegna);

        spedizione.stampaInfo();
    }
}
