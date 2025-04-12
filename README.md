# esercizi-IngSoftware
 A/A 2024-2025

Esercizio 1: Gestione Veicoli (Ereditarietà e Interfacce)

    Crea un programma che gestisce una flotta di veicoli.
    Definisci un'interfaccia Veicolo con metodi come avvia(), ferma(), e getTipo().
    Crea una classe astratta MezzoDiTrasporto che implementa Veicolo e ha un attributo targa.
    Implementa due classi concrete: Auto e Moto, ereditando da MezzoDiTrasporto.
    Scrivi un programma che memorizza diversi veicoli in un array o una lista e permette di avviarli o fermarli.

Esercizio 2: Gestione Biblioteca (Liste ed Ereditarietà)

    Crea un semplice sistema per gestire una biblioteca.
    Definisci una classe astratta MaterialeBibliotecario con attributi titolo e annoPubblicazione.
    Crea due classi che ereditano: Libro e Rivista. Aggiungi attributi specifici (es. autore per i libri, numeroEdizione per le riviste).
    Implementa una classe Biblioteca che usa una List<MaterialeBibliotecario> per memorizzare i materiali.
    Aggiungi metodi per aggiungere, rimuovere e visualizzare i materiali.

Esercizio 3: Gestione Animali (Ereditarietà e Interfacce)

    Crea un programma che modella diversi animali e le loro caratteristiche.
    Requisiti:
    Crea un'interfaccia Animale con i metodi emettiVerso() e muoviti().
    Crea una classe astratta AnimaleBase che implementa Animale e ha un attributo nome.
    Implementa due classi concrete Cane e Gatto, che ereditano da AnimaleBase.
    Utilizza un array o una lista per memorizzare diversi animali e farli interagire.

Esercizio 4: Gestione Dipendenti (Ereditarietà e Liste)

    Crea un sistema per gestire i dipendenti di un'azienda.
    Requisiti:
    Crea una classe astratta Dipendente con attributi nome, stipendio e un metodo astratto calcolaStipendio().
    Crea due classi Impiegato e Manager, che ereditano da Dipendente.
    Un impiegato ha uno stipendio fisso.
    Un manager ha uno stipendio fisso più un bonus.
    Implementa una classe Azienda che memorizza i dipendenti in una lista e stampa gli stipendi totali.

Esercizio 5: Sistema di Prenotazione di Viaggi (Ereditarietà, Interfacce, Liste, Eccezioni)

    Creiamo un sistema per gestire prenotazioni di diversi tipi di viaggi.
    Requisiti:
    Crea un'interfaccia Prenotabile con un metodo prenota().
    Crea una classe astratta Viaggio con attributi come destinazione, prezzo e un metodo descrizione().
    Implementa due classi ViaggioAereo e ViaggioTreno, con caratteristiche specifiche (es. compagniaAerea, numeroPosto).
    Gestisci le prenotazioni con una classe SistemaPrenotazioni che utilizza una List<Viaggio>.
    Aggiungi gestione delle eccezioni per evitare la prenotazione di un viaggio già prenotato.


Esercizio 6: Sistema di Pagamenti (Ereditarietà, Interfacce, Polimorfismo, Liste, Eccezioni)

    Creiamo un sistema che gestisce pagamenti con diversi metodi.
    Requisiti:
    Crea un'interfaccia Pagabile con un metodo effettuaPagamento(double importo).
    Crea una classe astratta MetodoPagamento con attributi saldoDisponibile.
    Implementa le classi CartaDiCredito e PayPal, con comportamenti specifici per i pagamenti.
    Aggiungi una classe SistemaPagamenti che gestisce una lista di metodi di pagamento.
    Implementa eccezioni personalizzate per gestire il saldo insufficiente.

Esercizio 7: PUNTO2D

Esercizio 8: DIP nell’esempio dell’ereditarietà e delega ( da UML a java )

Esercizio 9: Esame 21 feb 2025 

Esercizio 10: Sistema di Gestione degli Ordini per un Ristorante Online

Esercizio 11: https://drive.google.com/file/d/1SxKbTr6gsrbFnQyTuohTU-cy2KN9mVBM/view (Esercizio 1 Esercitazioni 20mag 2024)

Esercizio 12: Corriere Espresso ABC

Esercizio 13: Esercitazione Classi Statiche e construttori ( ESERCIZIO 2 )

Esercizio 14: Prodotti Musicali

Esercizio 15: Esempio d'esame proposto il 11/04/2025 (Esercizio 1 UML)

Esercizio 16: Esempio d'esame proposto il 11/04/2025 ( Esercizio Sviluppo Java (10 pt) )

**LIVELLO: FACILE**

Esercizio 17: Rubrica Telefonica (ArrayList + Incapsulamento)

    Crea una classe Contatto con nome, numero di telefono (privati) e metodi getter/setter.
    Nel main, usa un ArrayList<Contatto> per gestire l’aggiunta e la stampa dei contatti.

Esercizio 18: Somma da Input (args + array)

    Nel main(String[] args), prendi una serie di numeri interi da riga di comando e stampa
    la loro somma.

Esercizio 19: Forma Astratta (Classi astratte + ereditarietà)

    Crea una classe astratta Forma con metodo astratto double area().
    Implementa Cerchio e Rettangolo, e nel main crea un array di forme e stampa l’area di
    ciascuna.

Esercizio 20: Registro Studenti (ArrayList + Classi)

    Crea una classe Studente con nome, matricola, voti[].
    Nel main, aggiungi studenti a un ArrayList, calcola e stampa la media voti.

Esercizio 21: Filtro Numeri Pari (Array + if)

    Nel main, dichiara un array di interi. Stampa solo i numeri pari usando un ciclo.

Esercizio 22: Interfaccia Animale (Interfacce + Ereditarietà)

    Crea un'interfaccia Animale con metodo verso().
    Implementa Cane e Gatto. Nel main, chiama il verso su una lista di animali.

Esercizio 23: Contatore Generico (Generics)

    Crea una classe Contatore<T> che conta elementi di tipo T.
    Nel main, conta quanti numeri e quante stringhe ci sono in due array diversi.

Esercizio 24: Classifica Sportiva (ArrayList + Sorting)

    Crea una classe Squadra con nome e punti.
    Nel main, aggiungi squadre a una lista e ordinale in base ai punti.

Esercizio 25: Incapsulamento Base (get/set)

    Crea una classe Persona con nome e età privati.
    Nel main, crea una persona e modifica i dati con i metodi pubblici.

Esercizio 26: Calcolatrice con switch (args)

    Usa args per ricevere due numeri e un'operazione (+, -, *, /).
    Stampa il risultato.

Esercizio 27: Magazzino Prodotti (ArrayList + Ricerca)

    Crea una classe Prodotto con nome, codice, prezzo.
    Nel main, cerca un prodotto per codice tra quelli inseriti in un ArrayList.

Esercizio 28: Registro Presenze (Array 2D)

    Gestisci un array bidimensionale per tracciare le presenze di studenti in una settimana.
    Nel main, stampa le presenze totali per ogni studente.

Esercizio 29: Macchina Astratta (Classe Astratta + Overriding)

    Crea una classe astratta Macchina con metodo avvia().
    Implementa Auto e Moto. Nel main, chiama avvia() su entrambe.

Esercizio 30: Parole Lunghe (Array + Condizioni)

    Nel main, prendi da args una lista di parole.
    Stampa solo quelle più lunghe di 5 lettere.

Esercizio 31: Biblioteca (ArrayList + Oggetti)

    Crea una classe Libro con titolo, autore, anno.
    Nel main, inserisci e stampa una lista di libri in una ArrayList.



