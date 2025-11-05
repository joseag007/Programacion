/*
 * Descripción: array tamaño 1000 y numeros  0-99
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio20;

import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] listaNumeros = new int[1000];

        for (int indice = 0; indice < listaNumeros.length; indice++) {
            listaNumeros[indice] = (int) (Math.random() * 100);
        }

        System.out.print("Introduce un número (0-99): ");
        int valorBuscado = sc.nextInt();

        int contador = 0;
        for (int indice = 0; indice < listaNumeros.length; indice++) {
            if (listaNumeros[indice] == valorBuscado) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("El número " + valorBuscado + " existe en el array y aparece " + contador + " veces.");
        } else {
            System.out.println("El número " + valorBuscado + " no existe en el array.");
        }
		
        
	}
}
