/*
 * Descripción: leer números con array
 * Autor: José Abril
 * Fecha: 28/10/25
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
		        double[] nums = new double[10]; // Array para almacenar 10 números reales
		        int contador = 0;

		        // Pedir números al usuario
		        while (contador < nums.length) {
		            System.out.print("Introduce número " + (contador + 1) + ": ");
		            nums[contador] = teclado.nextDouble();
		            contador++;
		        }

		        // Mostrar los números introducidos
		        System.out.println("Los números introducidos son:");
		        contador = 0;
		        while (contador < nums.length) {
		            System.out.println("Número " + (contador + 1) + ": " + nums[contador]);
		            contador++;
		        }


	}

}
