package mx.edu.utel.arreglos;

import java.util.Arrays;

public class ProgramaArreglosFlujos {
    
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6};
        int suma = Arrays.stream(arreglo).sum();
        System.out.printf("Suma del arreglo: %d\n", suma);
        
        System.out.println("### MANEJO DEL FORACH EN FLUJOS");
        Arrays.stream(arreglo).forEach(elemento -> System.out.println(elemento));
        
        
    }
    
}
