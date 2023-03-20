/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package Guía1;

import java.util.Scanner;

/**
 *
 * @author jimen
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre =leer.next();
        System.out.println("Su nombre es "+nombre);
            
    }
    
}
