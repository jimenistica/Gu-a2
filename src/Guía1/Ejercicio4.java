/*
 * Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package Guía1;

import java.util.Scanner;

/**
 *
 * @author jimen
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double cel;
        double fahr;
        System.out.println("Ingrese la cantidad de grados celcius a convertir");
        Scanner leer = new Scanner(System.in);
        cel= leer.nextDouble();
        fahr= 32 + (9 * cel/5);
        System.out.println(cel + " °C, equivalen a " + fahr + " grados Fahrenheit");
                
    }
    
}
