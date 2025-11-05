/*
 * Descripción: array tamaño N y escrito M
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);

	        // Pedir N y M al usuario
	        System.out.print("Introduce el valor de N (tamaño del array): ");
	        int N = teclado.nextInt();

	        System.out.print("Introduce el valor de M (valor a guardar en el array): ");
	        int M = teclado.nextInt();

	        // Crear el array de tamaño N
	        int[] numeros = new int[N];

	        // Escribir M en todas las posiciones del array
	        for (int posicion = 0; posicion < numeros.length; posicion++) {
	            numeros[posicion] = M;
	        }

	        // Mostrar el contenido del array
	        System.out.println("\nContenido del array:");
	        for (int posicion = 0; posicion < numeros.length; posicion++) {
	            System.out.println("Posición " + posicion + ": " + numeros[posicion]);
	        }


	}

}
