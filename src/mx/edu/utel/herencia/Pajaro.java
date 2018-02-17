package mx.edu.utel.herencia;

public class Pajaro extends Mascota {

    @Override
    public void andar() {
        System.out.printf("El pájaro %s está volando.\n", nombre);
    }
    
}
