package mx.edu.utel.arreglos;

import java.util.Arrays;

public class ProgramaArreglos {
    
    private void crearArreglo() {
        int[] enteros = new int[5];
//        enteros[0] = 2;
//        enteros[1] = 4;
//        enteros[2] = 8;
//        enteros[3] = 16;
//        enteros[4] = 32;
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i * 2;
        }
        imprimir(enteros);
    }
    
    private void imprimir(int[] arreglo) {
        System.out.println("### IMPRIMENDO UTILIZANDO FOR");
        for (int i : arreglo) {
            System.out.printf("Valor: %d\n", i);
        }
        System.out.println("### IMPRIMIENDO UTILIZANDO ARRAYS");
        System.out.println(Arrays.toString(arreglo));
    }
    
    
    
    public static void main(String[] args) {
        ProgramaArreglos pa = new ProgramaArreglos();
        pa.crearArreglo();
    }
    
}
