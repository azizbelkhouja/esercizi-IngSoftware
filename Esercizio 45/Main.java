import java.time.LocalDate;

class Evento {
    String nome;
    LocalDate data;
    String luogo;

    Evento(String nome, LocalDate data, String luogo) {
        this.nome = nome;
        this.data = data;
        this.luogo = luogo;
    }

    void stampa() {
        System.out.println(data + " - " + nome + " a " + luogo);
    }
}

public class Main {
    public static void main(String[] args) {
        Evento[] eventi = new Evento[4];

        eventi[0] = new Evento("Concerto", LocalDate.of(2025, 5, 18), "Ferrara");
        eventi[1] = new Evento("Fiera", LocalDate.of(2025, 4, 25), "Bologna");
        eventi[2] = new Evento("Career Day", LocalDate.of(2025, 6, 10), "Parma");
        eventi[3] = new Evento("Conferenza", LocalDate.of(2025, 4, 20), "Modena");

        for (int i = 0; i < eventi.length - 1; i++) {
            for (int j = i + 1; j < eventi.length; j++) {
                if (eventi[i].data.isAfter(eventi[j].data)) {
                    Evento temp = eventi[i];
                    eventi[i] = eventi[j];
                    eventi[j] = temp;
                }
            }
        }

        for (Evento eventi1 : eventi) {
            eventi1.stampa();
        }
    }
}
