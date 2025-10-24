/*
 * Descripción: leer números no nulos
 * Autor: José Abril
 * Fecha: 22/10/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
        int num = teclado.nextInt();
		int contador = 0;
		boolean negativo = false;
		
		while (contador < 100) {
			
			if ( num != 0) {
				System.out.println(num);
				System.out.print("Introduce otro número: ");
	            num = teclado.nextInt();
				contador ++;
				if (num < 0) {
				    negativo = true;
				}
			}else {
				System.out.print("Introduce otro número: ");
	            num = teclado.nextInt();
			}
			
			
			
		}
		
		if (negativo) {
		    System.out.println("Se ha generado al menos un número negativo.");
		} else {
		    System.out.println("No se ha generado ningún número negativo.");
		}
		
	}
}
