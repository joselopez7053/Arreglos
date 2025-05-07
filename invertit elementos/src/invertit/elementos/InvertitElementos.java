/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertit.elementos;

/**
 *
 * @author DELL
 */import java.util.Scanner; 
public class InvertitElementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        int[] numeros = new int[6]; 

        System.out.println("Ingresa 6 numeros enteros:");

        
        for (int i = 0; i < 6; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        
        System.out.println("Los numeros en orden invertido son:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
    
}
