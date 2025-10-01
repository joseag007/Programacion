/*
* Descripción: intercambio de valores
* Autor: José
* Fecha: 01/10/2025
*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		System.out.print("Introduzca un primer valor: ");
		num1 = teclado.nextInt(); // petición de primer valor
		
		int num2;
		System.out.print("Introduzca un segundo valor: ");
		num2 = teclado.nextInt(); // petición del segundo valor
		
		System.out.println("Intercambiamos los valores");
		
		int var1; // creo una variable para guardar el valor de num1
		var1=num1;
		
		num1=num2; // una vez guardado el valor de num1 cambio su valor por num2
		
		num2=var1; // cambio el valor de num2 por el valor guardado de num1
		
		System.out.println("Ahora el primer número vale: "+num1);
		System.out.println("Ahora el segundo número vale: "+num2);
		
	}

}
