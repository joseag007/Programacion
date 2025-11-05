/*
 * Descripción: array incremental 1,2,2,3,3,3..., con arrays.fill
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio16;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		int tamañoTotal = 0;
        for (int numero = 1; numero <= 10; numero++) {
            tamañoTotal += numero;
        }

        int[] listaNumeros = new int[tamañoTotal];
        int posicionInicio = 0;

        for (int numero = 1; numero <= 10; numero++) {
            Arrays.fill(listaNumeros, posicionInicio, posicionInicio + numero, numero);
            posicionInicio += numero;
        }

        System.out.println("Secuencia generada: " + Arrays.toString(listaNumeros));
    
		
	}
}
