package mx.edu.utel.arreglos;

import java.util.Arrays;

public class ProgramaArreglosMultiDim {
    
    private void crearArreglo() {
        int[][] xyz = new int[4][5];
//    int[][] abc = {
//        {2,4,6,8},
//        {3,4,5,6},
//        {9,8,7,6},
//        {1,2,3,4}
//    };
        for (int i = 0; i < xyz.length; i++) {
            for (int j = 0; j < xyz[i].length; j++) {
                xyz[i][j] = 2 * i + j;
            }
        }
        imprimeArreglo(xyz);
    }

    private void imprimeArreglo(int[][] xyz) {
        System.out.println("### IMPRIMENDO UTILIZANDO FOR");
        for (int i = 0; i < xyz.length; i++) {
            for (int j = 0; j < xyz[i].length; j++) {
                System.out.printf("Valor en posición[%d, %d]: %d\n", i, j, xyz[i][j]);
            }
        }
        System.out.println("### IMPRIMIENDO UTILIZANDO ARRAYS");
        System.out.println(Arrays.deepToString(xyz));
    }
    
    public static void main(String[] args) {
        ProgramaArreglosMultiDim pa = new ProgramaArreglosMultiDim();
        pa.crearArreglo();
    }
    
    
    
}
