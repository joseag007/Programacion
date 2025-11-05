/*
 * Descripción: array tamaño n y numero M repetido
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio15;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Tamaño del array (N): ");
        int tamañoArray = sc.nextInt();

        System.out.print("Valor a repetir (M): ");
        int valorRepetido = sc.nextInt();

        int[] listaNumeros = new int[tamañoArray];
        Arrays.fill(listaNumeros, valorRepetido);

        System.out.println("Array generado: " + Arrays.toString(listaNumeros));

		
	}
}