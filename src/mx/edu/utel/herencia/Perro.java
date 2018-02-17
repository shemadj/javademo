package mx.edu.utel.herencia;

public class Perro extends Mascota {
   
    @Override
    public void andar() {
        System.out.printf("El perro %s está caminando\n", nombre);
    }
    
    public void ladrar() {
        System.out.printf("El perro %s está ladrando\n", nombre);
    }
    
}
