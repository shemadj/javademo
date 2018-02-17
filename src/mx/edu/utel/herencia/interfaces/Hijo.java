/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utel.herencia.interfaces;

/**
 *
 * @author alejandro
 */
public class Hijo extends Padre implements Familiar, Persona {

    public Hijo(String nombre) {
        super(nombre);
    }

    @Override
    public void relacion() {
        System.out.println("La relación es hijo.");
    } 
    

    @Override
    public String toString() {
        return String.format("Nombre del hijo: %s", nombre);
    }

    @Override
    public void raza() {
        System.out.println("Su raza es: latino.");
    }
    
    
    
}
