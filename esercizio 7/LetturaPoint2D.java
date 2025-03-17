import java.io.*;

public class LetturaPoint2D {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream f = new FileInputStream("esempio.bin");

        Punto2D p;
        try (ObjectInputStream is = new ObjectInputStream(f)) {
            p = (Punto2D) is.readObject();
        }
        System.out.println("x,y = " + p.ascissa() + ", " + p.ordinata());
    }
}
