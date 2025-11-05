/*
 * Descripción: ordenar numeros aleatorios
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio18;

import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		int[] listaNumeros = new int[30];

        for (int indice = 0; indice < listaNumeros.length; indice++) {
            listaNumeros[indice] = (int) (Math.random() * 10);
        }

        Arrays.sort(listaNumeros);

        System.out.println("Array ordenado: " + Arrays.toString(listaNumeros));
    
		
	}
}