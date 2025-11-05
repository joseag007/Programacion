/*
 * Descripción: media numeros reales array
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int[] nums = new int[100];
        Scanner sc = new Scanner(System.in);

        for (int contador = 0; contador < nums.length; contador++) {
            nums[contador] = (int) (1 + Math.random() * 10);
        }

        System.out.print("Número a buscar: ");
        int numBuscar = sc.nextInt();

        System.out.print("El número aparece en las posiciones: ");
        for (int contador = 0; contador < nums.length; contador++) {
            if (nums[contador] == numBuscar) {
                System.out.print(contador + " ");
            }
        }



    }
}