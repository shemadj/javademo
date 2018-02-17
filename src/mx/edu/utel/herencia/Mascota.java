package mx.edu.utel.herencia;

public abstract class Mascota {
    
    protected String nombre;
    protected String color;
    
    public abstract void andar();
    
    public void imprimeNombre() {
        System.out.printf("Nombre: %s \n", nombre);
    }
    
    
}
