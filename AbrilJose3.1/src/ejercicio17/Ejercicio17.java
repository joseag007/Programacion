/*
 * Descripción: igualar arrays
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio17;

import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] primerosValores = new int[10];
        int[] ultimosValores = new int[10];
        int[] todosValores = new int[20];

        System.out.println("Introduce 20 números enteros:");
        for (int indice = 0; indice < todosValores.length; indice++) {
            System.out.print("Valor " + (indice + 1) + ": ");
            todosValores[indice] = sc.nextInt();
        }

        // Copiar los primeros 10
        for (int indice = 0; indice < 10; indice++) {
            primerosValores[indice] = todosValores[indice];
        }

        // Copiar los últimos 10
        for (int indice = 0; indice < 10; indice++) {
            ultimosValores[indice] = todosValores[indice + 10];
        }

        System.out.println("Primer array: " + Arrays.toString(primerosValores));
        System.out.println("Segundo array: " + Arrays.toString(ultimosValores));

        if (Arrays.equals(primerosValores, ultimosValores)) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays son diferentes.");
        }
		
        
	}
}