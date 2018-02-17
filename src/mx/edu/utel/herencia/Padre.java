package mx.edu.utel.herencia;

public class Padre extends Abuelo {
    
    public String nombre;
    
    private void metodoBase() {
        System.out.println("Estoy haciendo algo...");
    }
    
    protected void imprimeAlgo() {
        metodoBase();
    }
    
}