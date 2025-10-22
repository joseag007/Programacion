/*
 * Descripción: leer números no nulos ( cuantos positivos y negativos)
 * Autor: José Abril
 * Fecha: 21/10/25
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		

Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
        int num = teclado.nextInt();
		int contador = 0;
		int positivos=0;
		int negativos=0;
		boolean negativo = false;
		
		while (contador < 100) {
			
			if ( num != 0) {
				System.out.println(num);
				System.out.print("Introduce otro número: ");
	            num = teclado.nextInt();
				contador ++;
				if (num < 0) {
				    negativo = true;
				    negativos ++;
				}
				}else {
				System.out.print("Introduce otro número: ");
	            num = teclado.nextInt();
	            positivos++;
			}
			
			
			
		}
		
		if (negativo) {
		    System.out.println("Se ha generado al menos un número negativo.");
		} else {
		    System.out.println("No se ha generado ningún número negativo.");
		}
		
		
		
		    System.out.println("Se han generado: " + positivos + " números positivos");
		    System.out.println("Se han generado: " + negativos + " números negativos");
		    

	}

}
