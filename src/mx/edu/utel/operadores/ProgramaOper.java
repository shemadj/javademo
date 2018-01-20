package mx.edu.utel.operadores;

import java.util.Scanner;

public class ProgramaOper {
    
    public static void main(String[] args) {
        int num1, num2;
        Scanner scn = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        num1 = scn.nextInt();
        System.out.print("Escribe otro número: ");
        num2 = scn.nextInt();
        int result = num1 + num2;
        System.out.printf("El resultado de la suma es: %d \n", result);
        System.out.println("El resultado de la suma es: " + result);
    }
    
}
