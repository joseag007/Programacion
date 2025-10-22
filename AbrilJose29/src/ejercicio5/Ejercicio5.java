/*
 * Descripción: cálculo factorial
 * Autor: José Abril
 * Fecha: 21/10/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
        int factorial = 1;

        System.out.print("Introduce un número positivo: ");
        int num = teclado.nextInt();

        while (num < 0) {
            System.out.println("El número debe ser positivo.");
            System.out.print("Introduce un número positivo: ");
            num = teclado.nextInt();
        }

        int contador = 1;

        while (contador <= num) {
            factorial = factorial * contador;
            contador++;
        }

        System.out.println(num + "! = " + factorial);
        
		

	}

}
