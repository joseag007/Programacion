/*
* Descripción: que número es mayor
* Autor: José
* Fecha: 03/10/2025
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		System.out.print("Introduzca su nombre: ");
		nombre = teclado.nextLine();
		
		byte edad;
		System.out.print("Introduzca su edad: ");
		edad = teclado.nextByte();
		
		int nota;
		System.out.println("Introduzca su nota académica: ");
		nota = teclado.nextInt();
		
		if (nota < 0 || nota > 10) { // compruebo que la nota sea valida
            System.out.println("La nota introducida no es válida.");
        } else {
            if (edad >= 18 && nota >= 7) {
                System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas.");
            } else {
                System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos.");
            }
        }
		
		
	}

}
