/*
 * Descripción: orden puntuacion mayor-menor
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio19;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] puntuaciones = new int[8];

        System.out.println("Introduce las puntuaciones de los 8 jugadores:");
        for (int indice = 0; indice < puntuaciones.length; indice++) {
            System.out.print("Puntuación del jugador " + (indice + 1) + ": ");
            puntuaciones[indice] = sc.nextInt();
        }

        Arrays.sort(puntuaciones);

        System.out.println("\nRanking de puntuaciones (de mayor a menor):");
        for (int indice = puntuaciones.length - 1; indice >= 0; indice--) {
            System.out.println(puntuaciones[indice]);
        }

		
	}

}
