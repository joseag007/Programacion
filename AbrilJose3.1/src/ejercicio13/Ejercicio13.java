/*
 * Descripción: incremento array
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Valor inicial (V): ");
        int valorInicial = sc.nextInt();

        System.out.print("Incremento (I): ");
        int incremento = sc.nextInt();

        System.out.print("Número de valores (N): ");
        int numValores = sc.nextInt();

        int[] secuencia = new int[numValores];

        for (int indice = 0; indice < secuencia.length; indice++) {
            secuencia[indice] = valorInicial + (incremento * indice);
        }

        System.out.println("Secuencia aritmética generada:");
        for (int indice = 0; indice < secuencia.length; indice++) {
            System.out.print(secuencia[indice] + " ");
        }
		
        
	}
}