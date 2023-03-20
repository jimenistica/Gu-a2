/*
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java..

 */
package Guía1;

import java.util.Scanner;

/**
 *
 * @author jimen
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase =leer.nextLine();
        // Convertir a LowerCase     
        System.out.println(frase.toLowerCase());
        // Convertir a UpperCase    
        System.out.println(frase.toUpperCase());
    }
    
}
