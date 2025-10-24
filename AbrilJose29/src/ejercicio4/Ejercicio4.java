/*
 * Descripción: numero de 1 a X
 * Autor: José Abril
 * Fecha: 22/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num = 1;
		int contador = 1;
		System.out.println("Introduzca el valor final: ");
        int fin = teclado.nextInt();
		
		while (contador <= fin) {
			System.out.println(num);
			num ++;
			contador ++;
		}
		
	}
}