/*
* Descripción: que número es mayor
* Autor: José
* Fecha: 03/10/2025
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		System.out.print("Introduzca un número: ");
		num1 = teclado.nextInt();
		
		int num2;
		System.out.print("Introduzca un número: ");
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("El número " + num1 + " es mayor"); // comprobar si num1 es mayor
		}else if (num1 == num2) {
			System.out.println("Ambos números son iguales"); // comprobar si son iguales
		}else {
			System.out.println("El número " + num2 + " es mayor"); // num2 es mayor
		}
		
	}

}
