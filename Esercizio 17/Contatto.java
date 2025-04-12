public class Contatto {

    private String nome;
    private String numTelefono;

    public Contatto(String nome, String numTelefono) {
        this.nome = nome;
        this.numTelefono = numTelefono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public String toString() {
        return "Nome: " + nome + ", Telefono: " + numTelefono;
    }

    
}
