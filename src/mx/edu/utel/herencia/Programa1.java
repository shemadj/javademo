
package mx.edu.utel.herencia;


public class Programa1 {
    
    public static void main(String[] args) {
        Hijo h = new Hijo();
        h.imprimeAlgo();
        h.otroMetodo();
        h.nombre = "Benito Bodoque";
        System.out.printf("Nombre: %s \n", h.nombre);
    }
    
}
