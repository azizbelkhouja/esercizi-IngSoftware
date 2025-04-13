import java.util.*;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String contenuto = Files.readString(Path.of("testo.txt"));
        contenuto = contenuto.toLowerCase().replaceAll("[^a-zàèéìòùç0-9 ]", " ");
        String[] parole = contenuto.split("\\s+");

        HashMap<String, Integer> frequenze = new HashMap<>();
        for (String parola : parole) {
            if (parola.isEmpty()) continue;
            frequenze.put(parola, frequenze.getOrDefault(parola, 0) + 1);
        }

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(frequenze.entrySet());
        lista.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> entry : lista) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
