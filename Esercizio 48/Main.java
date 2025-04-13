import java.util.HashMap;

public class Main {

    static class Utente {
        String username;
        String password;

        Utente(String username, String password) {
            this.username = username;
            this.password = password;
        }

        boolean verifica(String inputPassword) {
            return this.password.equals(inputPassword);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Utente> utenti = new HashMap<>();

        utenti.put("mario", new Utente("mario", "1234"));
        utenti.put("luigi", new Utente("luigi", "verde"));
        utenti.put("peach", new Utente("peach", "rosa"));

        login("mario", "1234", utenti);
        login("luigi", "sbagliata", utenti);
        login("bowser", "fuoco", utenti);
        login("peach", "rosa", utenti);
    }

    static void login(String username, String password, HashMap<String, Utente> utenti) {
        System.out.println("\nTentativo di login per: " + username);

        if (utenti.containsKey(username)) {
            Utente utente = utenti.get(username);
            if (utente.verifica(password)) {
                System.out.println("Login riuscito per " + username);
            } else {
                System.out.println("Password errata per " + username);
            }
        } else {
            System.out.println("Utente " + username + " non trovato");
        }
    }
}
