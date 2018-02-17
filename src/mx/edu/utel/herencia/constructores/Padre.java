package mx.edu.utel.herencia.constructores;

public class Padre {

    public Padre() {
    }
    
    public Padre(String nombre, int edad) {
        System.out.println(">>> En el contructor del Padre");
        this.nombre = nombre;
        this.edad = edad;
    }
    
    protected String nombre;
    protected int edad;
    
    public void imprimeDetalles() {
        System.out.printf("### PADRE Nombre: %s, Edad: %d\n", nombre, edad);
    }
    
    
}
