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


