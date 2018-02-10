package mx.edu.utel.arreglos;

public class ProgramaVarArgs {
    
    private void imprimeArreglo(int[] enteros) {
        System.out.println("### IMPRIMIENDO ARREGLO TRADICIONAL");
        for (int entero : enteros) {
            System.out.println("Valor: " + entero);
        }
    }
    
    private void imprimeArgumentos(int ... argumentos) {
        System.out.println("### IMPRIMIENDO ARREGLO VARARGS");
        for (int entero : argumentos) {
            System.out.println("Valor: " + entero);
        }
    }
    
    
    public static void main(String ... args) {
        ProgramaVarArgs pa = new ProgramaVarArgs();
        int x = 2;
        int y = 4;
        int z = 8;
//        PRIMERA OPCION
//        int[] arreglo = new int[3];
//        arreglo[0] = x;
//        arreglo[1] = y;
//        arreglo[2] = z;
//        pa.imprimeArreglo(arreglo);

//        SEGUNDA OPCION
//        int[] arreglo = new int[]{x,y,z};
//        pa.imprimeArreglo(arreglo);
          
//        TERCERA OPCION
//        pa.imprimeArreglo(new int[]{x,y,z});
        
//        CARTA OPCION - VARARGS (JAVA 5)
          pa.imprimeArgumentos(x, y, z);
        
    }
    
    
}
