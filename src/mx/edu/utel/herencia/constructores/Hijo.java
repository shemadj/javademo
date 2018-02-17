package mx.edu.utel.herencia.constructores;

public class Hijo extends Padre {

    public Hijo() {
    }
    
    public Hijo(String nombre, int edad) {
        super(nombre, edad);
        System.out.println(">>> En el constructor de Hijo");
    }

    @Override
    public void imprimeDetalles() {
        System.out.printf("### HIJO Nombre: %s, Edad: %d\n", nombre, edad);
    }
    
    
    
}
