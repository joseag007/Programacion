/*
 * Descripción: numero mayor, menor o igua a cero
 * Autor: José Abril
 * Fecha: 20/11/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = teclado.nextInt();
		
        int respuesta = dimeSigno(num);
	}
	public static int dimeSigno(int a) {
		if (a<0) {
			System.out.println(a + " es menor que cero.");
		} else if (a == 0) {
			System.out.println(a + " vale cero.");
		} else {
			System.out.println(a + " es mayor que cero.");
		}
		return a;
		
	}

}
