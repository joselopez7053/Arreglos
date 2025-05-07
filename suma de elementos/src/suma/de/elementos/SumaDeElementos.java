/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma.de.elementos;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class SumaDeElementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in); 

        int[] numeros = new int[5]; 
        int suma = 0; 

       
        System.out.println("Ingresa 5 numeros enteros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt(); 

            suma = suma + numeros[i]; 
        }

        
        System.out.println("La suma de los numeros es: " + suma);
    }
}
    }
    
}
