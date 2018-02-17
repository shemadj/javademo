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
public class Padre implements Familiar {
    
    protected String nombre;

    public Padre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("Nombre del padre: %s", nombre);
    }

    @Override
    public void relacion() {
        System.out.println("Este objeto es un Padre.");
    }
    
    
    
}
