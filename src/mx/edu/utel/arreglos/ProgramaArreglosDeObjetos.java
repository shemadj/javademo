
package mx.edu.utel.arreglos;


public class ProgramaArreglosDeObjetos {
    
    private void crearArreglo() {
        Punto[] arreglo = {
          new Punto(2,3),
          new Punto(1,8),
          new Punto(12,3),
          new Punto(8,9)
        };
        for (Punto p : arreglo) {
            System.out.println(p);
        }
    }
    
    public static void main(String[] args) {
        ProgramaArreglosDeObjetos pa = new ProgramaArreglosDeObjetos();
        pa.crearArreglo();
    }
    
    
}
