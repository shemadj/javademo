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
public class Programa {
    
    public static void main(String[] args) {
        Hijo h = new Hijo("John");
        Padre p = new Padre("Paul");
        
        System.out.println(p);
        p.relacion();
        System.out.println(h);
        h.relacion();
        h.raza();
        
        
        
        
        
    }
    
    
}
