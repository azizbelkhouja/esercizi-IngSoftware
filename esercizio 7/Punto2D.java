public class Punto2D implements java.io.Serializable {

    double x, y;

    public Punto2D(double x, double y) {

        this.x = x; 
        this.y = y;
    }

    public Punto2D() { x = 0; y = 0; }

    public float ascissa(){ return (float) x; };
    public float ordinata(){ return (float) y; };
}