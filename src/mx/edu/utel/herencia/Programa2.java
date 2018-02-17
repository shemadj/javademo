package mx.edu.utel.herencia;

public class Programa2 {
    public static void main(String[] args) {
        Perro pe = new Perro();
        pe.nombre = "Fido";
        pe.andar();
        pe.ladrar();
        
        Pajaro pa = new Pajaro();
        pa.nombre = "Piolín";
        pa.andar();
        
        Mascota ma = new Perro();
        ma.nombre = "Scooby";
        ma.andar();
        // Casting obligatorio para acceder a los atributos de la clase Perro
        Perro e = (Perro) ma;
        e.ladrar();
        
        // CREANDO UNA CLASE ANONIMA
        Mascota mx = new Mascota() {
            @Override
            public void andar() {
                System.out.println("Esta mascota está andando");
            }
        };
        mx.andar();
        
    }
}
