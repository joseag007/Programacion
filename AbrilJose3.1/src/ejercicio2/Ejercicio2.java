/*
 * Descripción: leer números con array y suma
 * Autor: José Abril
 * Fecha: 28/10/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        double[] nums = new double[10]; // Array para guardar los números
        double suma = 0; // Acumulador de la suma
        int contador = 0; // Contador

        // Pedir los 10 números al usuario
        while (contador < nums.length) {
            System.out.print("Introduce número " + (contador + 1) + ": ");
            nums[contador] = teclado.nextDouble();
            suma += nums[contador]; 
            contador++;
        }

        System.out.println("La suma de todos los números es: " + suma);
		
	}

}
