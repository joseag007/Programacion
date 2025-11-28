/*
 * Descripción: array relleno de numeros aleatorios
 * Autor: José Abril
 * Fecha: 21/11/25
 */
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void rellena(int[] num){
        for(int i = 0; i < num.length; i++)
            num[i] = (int)(Math.random() * 100);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Tamaño del array: ");
        int tamaño = teclado.nextInt();

        int[] num = new int[tamaño];
        rellena(num);

        for(int x : num)
            System.out.print(x + " ");
    }
}