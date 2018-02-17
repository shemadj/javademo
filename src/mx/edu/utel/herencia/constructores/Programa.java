package mx.edu.utel.herencia.constructores;

public class Programa {
    public static void main(String[] args) {
//        Padre pa1 = new Padre();
//        pa1.nombre = "Juan";
//        pa1.edad = 38;
//        
//        Padre pa2 = new Hijo();
//        pa2.nombre = "Jorge";
//        pa2.edad = 42;
//        
//        pa1.imprimeDetalles();
//        pa2.imprimeDetalles();
        
        Padre pa3 = new Padre("Pablo", 36);
        Hijo h1 = new Hijo("Reicardo", 32);
        
        pa3.imprimeDetalles();
        h1.imprimeDetalles();
        
        
        
    }
}
