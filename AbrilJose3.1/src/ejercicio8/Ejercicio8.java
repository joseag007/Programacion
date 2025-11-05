/*
 * Descripción: valores superiores o iguales que R array 0.0-1.0
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) { 
		
		 double[] nums = new double[100];
	        Scanner sc = new Scanner(System.in);
	        for (int contador = 0; contador < nums.length; contador++) {
	            nums[contador] = Math.random();
	        }
	        
	        System.out.print("Valor mínimo: ");
	        double minimo = sc.nextDouble();
	        int may = 0;
	        
	        for (int contador = 0; contador < nums.length; contador++) {
	            if (nums[contador] >= minimo) may++;
	        }
	        System.out.println("Mayores o iguales que " + minimo + ": " + may);


	    }
	}