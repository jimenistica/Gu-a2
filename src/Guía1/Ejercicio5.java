/*
 * Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package Guía1;

import java.util.Scanner;

/**
 *
 * @author jimen
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        n=leer.nextInt();
        System.out.println("El doble del número es " + (n*2));
        System.out.println("El triple del número es " + (n*3));
        double raiz = Math.sqrt(n);
        System.out.println("La raiz cuadrada del número es " + raiz);
    }
    
}
