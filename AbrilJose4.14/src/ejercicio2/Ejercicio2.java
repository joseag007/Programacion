/*
 * Descripción: boolean esMayorEdad(int a)
 * Autor: José Abril
 * Fecha: 19/11/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        if (mayorEdad(edad)) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
    }
    
    public static boolean mayorEdad(int edad) {
        return edad >= 18;
    }
    
}