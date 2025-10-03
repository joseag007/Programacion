/*
* Descripción: Calculo de salario
* Autor: José
* Fecha: 30/09/2025
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double euros1;
		System.out.print("Introduzca una cantidad en euros: ");
		euros1 = teclado.nextDouble(); // petición de cantidad de euros
		
		double pesetas1 = euros1 * 166.386; // cambio de euros a pesetas
		
		System.out.println(euros1+ " euros son " + pesetas1 +" pesetas.");
		
		Scanner raton = new Scanner(System.in);
		
		double pesetas2;
		System.out.print("Introduzca una cantidad en pesetas: ");
		pesetas2 = raton.nextDouble(); // petición de cantidad de pesetas
		
		double euros2 = pesetas2 / 166.386;// cambio de pesetas a euros
		
		System.out.println(pesetas2+ " euros son " + euros2 +" pesetas.");	
		

	}

}
