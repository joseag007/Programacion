/*
 * Descripción: suma números positivos y negativos array
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] nums = new int[20];
        int contador = 0;
        double positivo = 0, negativo = 0;

        // Pedir los 20 números al usuario
        while (contador < nums.length) {
            System.out.print("Introduce número " + (contador + 1) + ": ");
            nums[contador] = teclado.nextInt();

            if (nums[contador] >= 0) {
                positivo = positivo + nums[contador];
            } else {
                negativo = negativo + nums[contador];
            }

            contador++;
        }

        System.out.println("La suma de los valores positivos introducidos es: " + positivo);
        System.out.println("La suma de los valores negativos introducidos es: " + negativo);


    }
}