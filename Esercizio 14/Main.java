import java.util.*;

class Persona {
    String nome;
    String cognome;
}

class Cliente extends Persona {
    String codiceCliente;
}

class Negoziante extends Persona {
    public void riceveOrdineUtente(Prodotto prodotto, int quantita, Negozio negozio) {
        if (!negozio.magazzino.verificaDispProdotto(prodotto, quantita)) {
            Ordine ordine = negozio.gestoreOrdini.creaNuovoOrdine();
            negozio.gestoreOrdini.aggiungiProdottoinOrdine(ordine, prodotto, quantita);
            ordine.inviaOrdineAlFornitore();
        }
    }
}

abstract class Prodotto {
    String codiceProdotto;
    String descrizioneProdotto;
    double prezzo;
}

class Libro extends Prodotto {
    String autore;
    String editore;
    int annoPubblicazione;
    String titolo;
}

class Rivista extends Prodotto {
    String casaEditrice;
    String titolo;
    int numero;
}

class CDMusicale extends Prodotto {
    String autore;
    String casaDiscografica;
    String titolo;
    String qualitaRegistrazione;
}

class Musicassetta extends Prodotto {
    String autore;
    String casaDiscografica;
    String titolo;
}

class ProdottoInOrdine {
    Prodotto prodotto;
    int quantita;

    public ProdottoInOrdine(Prodotto prodotto, int quantita) {
        this.prodotto = prodotto;
        this.quantita = quantita;
    }
}

class Ordine {
    String dataCreazione;
    String codiceOrdine;
    double importoTotale;
    List<ProdottoInOrdine> prodottiInOrdine = new ArrayList<>();
    Fornitore fornitore;

    public void aggiungiProdotto(ProdottoInOrdine pio) {
        prodottiInOrdine.add(pio);
    }

    public void inviaOrdineAlFornitore() {
        if (fornitore != null) {
            fornitore.riceveOrdineNegoziante(this);
        }
    }
}

abstract class Fornitore {
    String codiceFornitore;

    public abstract void riceveOrdineNegoziante(Ordine ordine);
}

class FornitoreLibri extends Fornitore {
    public void riceveOrdineLibri(Ordine ordine) {
        System.out.println("Ordine libri ricevuto");
    }

    @Override
    public void riceveOrdineNegoziante(Ordine ordine) {
        riceveOrdineLibri(ordine);
    }
}

class FornitoreRiviste extends Fornitore {
    public void riceveOrdineRiviste(Ordine ordine) {
        System.out.println("Ordine riviste ricevuto");
    }

    @Override
    public void riceveOrdineNegoziante(Ordine ordine) {
        riceveOrdineRiviste(ordine);
    }
}

class FornitoreCDMusicassette extends Fornitore {
    public void riceveOrdineCDMusicassette(Ordine ordine) {
        System.out.println("Ordine CD/Musicassette ricevuto");
    }

    @Override
    public void riceveOrdineNegoziante(Ordine ordine) {
        riceveOrdineCDMusicassette(ordine);
    }
}

class TerminaleMagazzino {
    public boolean verificaDispProdotto(Prodotto prodotto, int quantita) {
        return false;
    }
}

class GestoreOrdini {
    public Ordine creaNuovoOrdine() {
        Ordine ordine = new Ordine();
        ordine.dataCreazione = new Date().toString();
        ordine.codiceOrdine = UUID.randomUUID().toString();
        return ordine;
    }

    public void aggiungiProdottoinOrdine(Ordine ordine, Prodotto prodotto, int quantita) {
        ProdottoInOrdine pio = new ProdottoInOrdine(prodotto, quantita);
        ordine.aggiungiProdotto(pio);
    }

    public void inviaOrdine(Ordine ordine) {
        ordine.inviaOrdineAlFornitore();
    }
}

class Negozio {
    TerminaleMagazzino magazzino = new TerminaleMagazzino();
    GestoreOrdini gestoreOrdini = new GestoreOrdini();
}

public class Main {
    public static void main(String[] args) {
        Negozio negozio = new Negozio();
        Negoziante negoziante = new Negoziante();

        Libro libro = new Libro();
        libro.codiceProdotto = "L123";
        libro.descrizioneProdotto = "Corso di Java";
        libro.prezzo = 29.99;

        FornitoreLibri fornitoreLibri = new FornitoreLibri();
        Ordine ordine = negozio.gestoreOrdini.creaNuovoOrdine();
        ordine.fornitore = fornitoreLibri;

        negoziante.riceveOrdineUtente(libro, 2, negozio);
    }
}
