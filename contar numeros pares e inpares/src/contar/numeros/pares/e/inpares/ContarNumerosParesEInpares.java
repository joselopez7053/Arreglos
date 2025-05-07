/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contar.numeros.pares.e.inpares;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class ContarNumerosParesEInpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        int[] numeros = new int[10]; 
        int pares = 0;    
        int impares = 0;  

       
        System.out.println("Ingresa 10 numeros enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt(); 

           
            if (numeros[i] % 2 == 0) {
                pares = pares + 1; 
            } else {
                impares = impares + 1; 
            }
        }

       
        System.out.println("Total de pares: " + pares);
        System.out.println("Total de impares: " + impares);
    

    }
    
}
