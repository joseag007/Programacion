/*
 * Descripción: contador de vocales
 * Autor: José Abril
 * Fecha: 19/11/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int a = 0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		
		 System.out.println("Introduce una cadena de texto: ");
	        String cadena = teclado.nextLine();

	        cadena = cadena.toLowerCase();

	        for (int idx = 0; idx < cadena.length(); idx++) {
	            char letra = cadena.charAt(idx);

	            switch (letra) {
	                case 'a': a++; break;
	                case 'e': e++; break;
	                case 'i': i++; break;
	                case 'o': o++; break;
	                case 'u': u++; break;
	            }
	        }

	        System.out.println("Nº de A's: " + a);
	        System.out.println("Nº de E's: " + e);
	        System.out.println("Nº de I's: " + i);
	        System.out.println("Nº de O's: " + o);
	        System.out.println("Nº de U's: " + u);
		
	}
}
