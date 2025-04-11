public class Main {

    public static void main(String[] args) {
        

    }
}

interface Lavoratore {
    public void lavora();
}

interface Pagabile {
    public double calcolaPaga();
}

abstract class Dipendente implements Lavoratore, Pagabile {

    private String nome;

    public String getNome() {
        return this.nome;
    }



}

class Manager extends Dipendente  {

    private String mobile;

}

class Sviluppatore extends Dipendente {

    private String matricola;

}