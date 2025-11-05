/*
 * Descripción: array tamaño N y escrito M
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        // Pedir los valores P y Q al usuario
        System.out.print("Introduce el valor de P (inicio del rango): ");
        int P = teclado.nextInt();

        System.out.print("Introduce el valor de Q (fin del rango): ");
        int Q = teclado.nextInt();

        // Comprobar que P sea menor o igual que Q
        if (P > Q) {
            System.out.println("Error: P debe ser menor o igual que Q.");
        } else {
            // Calcular el tamaño del array
            int tamaño = Q - P + 1;

           
            int[] numeros = new int[tamaño];

            // Rellenar el array con los valores desde P hasta Q
            for (int posicion = 0; posicion < numeros.length; posicion++) {
                numeros[posicion] = P + posicion;
            }

            // Mostrar el contenido del array
            System.out.println("Contenido del array:");
            for (int posicion = 0; posicion < numeros.length; posicion++) {
                System.out.println("Posición " + posicion + ": " + numeros[posicion]);
            }
        }
		
	}

}
