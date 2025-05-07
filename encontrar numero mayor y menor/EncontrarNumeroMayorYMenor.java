/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encontrar.numero.mayor.y.menor;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class EncontrarNumeroMayorYMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        int[] numeros = new int[8]; 

        System.out.println("Ingresa 8 numeros enteros:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt(); 
        }

        
        int mayor = numeros[0];
        int menor = numeros[0];

        
        for (int i = 1; i < 8; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i]; 
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
   
    }
    
}
