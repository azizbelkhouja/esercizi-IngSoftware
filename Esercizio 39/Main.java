import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static class Contatto {
        
        private String nome;
        private String numeroTelefono;
        private String email;

        public Contatto(String nome, String numeroTelefono, String email) {
            this.nome = nome;
            this.numeroTelefono = numeroTelefono;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public String getNumeroTelefono() {
            return numeroTelefono;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Telefono: " + numeroTelefono + ", Email: " + email;
        }
    }

    public static Contatto cercaContatto(ArrayList<Contatto> rubrica, String nome) {
        for (Contatto contatto : rubrica) {
            if (contatto.getNome().equalsIgnoreCase(nome)) {
                return contatto;
            }
        }
        return null;
    }

    public static boolean rimuoviContatto(ArrayList<Contatto> rubrica, String nome) {
        for (Contatto contatto : rubrica) {
            if (contatto.getNome().equalsIgnoreCase(nome)) {
                rubrica.remove(contatto);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Contatto> rubrica = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        rubrica.add(new Contatto("Mario Rossi", "123456789", "mario.rossi@email.com"));
        rubrica.add(new Contatto("Lucia Bianchi", "987654321", "lucia.bianchi@email.com"));
        rubrica.add(new Contatto("Giovanni Verdi", "543216789", "giovanni.verdi@email.com"));

        while (true) {
            System.out.println("\nRubrica Telefonica:");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Rimuovi contatto");
            System.out.println("3. Cerca contatto");
            System.out.println("4. Visualizza tutti i contatti");
            System.out.println("5. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci il numero di telefono: ");
                    String numero = scanner.nextLine();
                    System.out.print("Inserisci l'email: ");
                    String email = scanner.nextLine();
                    rubrica.add(new Contatto(nome, numero, email));
                    System.out.println("Contatto aggiunto.");
                    break;

                case 2:
                    System.out.print("Inserisci il nome del contatto da rimuovere: ");
                    String nomeDaRimuovere = scanner.nextLine();
                    if (rimuoviContatto(rubrica, nomeDaRimuovere)) {
                        System.out.println("Contatto rimosso.");
                    } else {
                        System.out.println("Contatto non trovato.");
                    }
                    break;

                case 3:
                    System.out.print("Inserisci il nome del contatto da cercare: ");
                    String nomeDaCercare = scanner.nextLine();
                    Contatto contattoTrovato = cercaContatto(rubrica, nomeDaCercare);
                    if (contattoTrovato != null) {
                        System.out.println("Contatto trovato: " + contattoTrovato);
                    } else {
                        System.out.println("Contatto non trovato.");
                    }
                    break;

                case 4:
                    System.out.println("\nElenco dei contatti:");
                    for (Contatto contatto : rubrica) {
                        System.out.println(contatto);
                    }
                    break;

                case 5:
                    System.out.println("Arrivederci!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        }
    }
}
