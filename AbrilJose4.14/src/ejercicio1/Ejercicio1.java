/*
 * Descripción: double multiplica(double a, double b)
 * Autor: José Abril
 * Fecha: 19/11/25
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	 public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        System.out.println("Introduce el primer número:");
	        double num1 = teclado.nextDouble();
	        System.out.println("Introduce el segundo número:");
	        double num2 = teclado.nextDouble();

	        double resultado = multiplica(num1, num2);
	        System.out.println("El resultado de multiplicar " + num1 + " y " + num2 + " es: " + resultado);
	    }
	 
	    public static double multiplica(double a, double b) {
	        return a * b;
	    }
	}