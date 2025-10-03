/*
* Descripción: ejercicio ampliación petición de nombre
* Autor: José
* Fecha: 02/10/2025
*/
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		System.out.print("Introduzca su nombre: ");
		nombre = teclado.nextLine(); // petición del dato nombre
		System.out.println("Hola " + nombre);

	}

}
