class Persona {
    private String nome;
    private String eta;

    public Persona(String nome, String eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getEta() {
        return eta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

}

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Mario", "25");
        Persona p2 = new Persona("Luigi", "30");

        System.out.println("Nome: " + p1.getNome() + ", Eta: " + p1.getEta());
        System.out.println("Nome: " + p2.getNome() + ", Eta: " + p2.getEta());

        p1.setNome("Giovanni");
        p1.setEta("28");

        System.out.println("Nome: " + p1.getNome() + ", Eta: " + p1.getEta());
    }
}