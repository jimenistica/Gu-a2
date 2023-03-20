/*
 Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
package Guía1;

import java.util.Scanner;

/**
 *
 * @author jimen
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         int num1;
         int num2;
         System.out.println("Ingrese dos numeros enteros");
         num1= leer.nextInt();
         num2 = leer.nextInt();
         int suma = num1+num2;
         System.out.println("La suma de esos numeros es " + suma);
                 
         
         
    }
    
}
