/*
 * Descripción: leer números con array y suma
 * Autor: José Abril
 * Fecha: 28/10/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double[] nums = new double[10]; // Array para guardar los números
        int contador = 0;

        // Pedir los 10 números al usuario
        while (contador < nums.length) {
            System.out.print("Introduce número " + (contador + 1) + ": ");
            nums[contador] = teclado.nextDouble();
            contador++;
        }

        // Inicializamos máximo y mínimo con el primer valor del array
        double max = nums[0];
        double min = nums[0];

        // Recorremos el array para encontrar el mayor y el menor
        contador = 1;
        while (contador < nums.length) {
            if (nums[contador] > max) {
                max = nums[contador];
            }
            if (nums[contador] < min) {
                min = nums[contador];
            }
            contador++;
        }

        
        System.out.println("El número máximo es: " + max);
        System.out.println("El número mínimo es: " + min);
        
		
	}

}
