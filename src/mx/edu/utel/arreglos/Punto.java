
package mx.edu.utel.arreglos;


public class Punto {
    
    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Punto(%d, %d)", x, y);
    }
    
    
    
}
