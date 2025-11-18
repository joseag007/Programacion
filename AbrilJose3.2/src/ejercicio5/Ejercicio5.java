/*
 * Descripción: calculo media salarios y brecha salarial
 * Autor: José Abril
 * Fecha: 6/11/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Número de personas: ");
	        int numPersonas = sc.nextInt();

	        double[][] datos = new double[numPersonas][2]; 
	        // Columna 0: género (0 = hombre, 1 = mujer)
	        // Columna 1: sueldo

	        for (int persona = 0; persona < numPersonas; persona++) {
	            System.out.print("Género (0=Hombre, 1=Mujer) de la persona " + (persona + 1) + ": ");
	            datos[persona][0] = sc.nextInt();

	            System.out.print("Sueldo de la persona " + (persona + 1) + ": ");
	            datos[persona][1] = sc.nextDouble();
	        }

	        double sumaHombres = 0, sumaMujeres = 0;
	        int contHombres = 0, contMujeres = 0;

	        for (int persona = 0; persona < numPersonas; persona++) {
	            if (datos[persona][0] == 0) {
	                sumaHombres += datos[persona][1];
	                contHombres++;
	            } else if (datos[persona][0] == 1) {
	                sumaMujeres += datos[persona][1];
	                contMujeres++;
	            }
	        }

	        double mediaHombres = contHombres > 0 ? sumaHombres / contHombres : 0;
	        double mediaMujeres = contMujeres > 0 ? sumaMujeres / contMujeres : 0;

	        System.out.println("\nSueldo medio de los hombres: " + mediaHombres);
	        System.out.println("Sueldo medio de las mujeres: " + mediaMujeres);

	        if (mediaHombres > mediaMujeres) {
	            System.out.println("Existe brecha salarial a favor de los hombres.");
	        } else if (mediaMujeres > mediaHombres) {
	            System.out.println("Existe brecha salarial a favor de las mujeres.");
	        } else {
	            System.out.println("No existe brecha salarial.");
	        }

		
	}

}
