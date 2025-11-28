/*
 * Descripción: tablas de multiplicar
 * Autor: José Abril
 * Fecha: 21/11/25
 */
package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {
	
	public static void tabla(int numero){
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();

        System.out.println("Tabla del " + num + ":");
        tabla(num);
    }
}