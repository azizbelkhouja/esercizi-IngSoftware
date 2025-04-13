public class Main {

    public static void main(String[] args) {

    }
}

class Canzone {

    private String titolo;
    private String artista;
    private int durata;

    public Canzone(String titolo, String artista, int durata) {
        this.titolo = titolo;
        this.artista = artista;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "Canzone{" +
                "titolo='" + titolo + '\'' +
                ", artista='" + artista + '\'' +
                ", durata=" + durata +
                '}';
    }

}