/*
* Descripción: calculadora básica
* Autor: José
* Fecha: 010/10/2025
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el valor 1: ");
        double num1 = teclado.nextDouble();

        System.out.print("Introduzca el valor 2: ");
        double num2 = teclado.nextDouble();

        // Mostrar el menú de operaciones
        System.out.println("\nIndique la operación que quiere realizar (Inserte un número):");
        System.out.println("(1) Suma");
        System.out.println("(2) Resta");
        System.out.println("(3) Multiplicación");
        System.out.println("(4) División");

        System.out.print("Opción: ");
        int opcion = teclado.nextInt();

        double resultado;

        // Evaluar la opción seleccionada
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;
           }
		
	}
}
