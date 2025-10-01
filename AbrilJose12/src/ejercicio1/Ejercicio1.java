/*
* Descripción: petición lista de datos
* Autor: José
* Fecha: 25/09/2025
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			
		String nombre;
		System.out.print("Introduzca su nombre: ");
		nombre = teclado.nextLine(); // petición del nombre
		
		String apellido;
		System.out.print("Introduzca su apellido: ");
		apellido = teclado.nextLine(); // petición de los apellidos
		
		byte edad;
		System.out.print("Introduzca su edad: ");
		edad = teclado.nextByte(); // petición de la edad
		
		teclado.nextLine();
		String direccion;
		System.out.print("Introduzca su dirección: ");
		direccion = teclado.nextLine(); // petición de la dirección
		
		double altura;
		System.out.print("Introduzca su altura: ");
		altura = teclado.nextDouble(); // petición de la altura
			
		double peso;
		System.out.print("Introduzca su peso: ");
		peso = teclado.nextDouble(); // petición del peso
		
		System.out.println("Nombre: " + nombre); 
		System.out.println("Apellido: " + apellido); 
		System.out.println("Edad: " + edad); 
		System.out.println("Direccion: " + direccion); 
		System.out.println("Altura: " + altura); 
		System.out.println("Peso: " + peso); 
		
	}

}
