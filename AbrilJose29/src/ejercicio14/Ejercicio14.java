/*
 * Descripción: clasificar billetes
 * Autor: José Abril
 * Fecha: 28/10/25
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int euros; // cantidad introducida

		System.out.print("Introduce una cantidad en euros (múltiplo de 5): ");
		euros = sc.nextInt();

		if (euros % 5 != 0) {
			System.out.println("La cantidad debe ser múltiplo de 5.");
		} else {
			int billete500 = 0, billete200 = 0, billete100 = 0;
			int billete50 = 0, billete20 = 0, billete10 = 0, billete5 = 0;

			while (euros >= 500) {
				billete500++;
				euros -= 500;
			}

			while (euros >= 200) {
				billete200++;
		                euros -= 200;
			}

			while (euros >= 100) {
				billete100++;
				euros -= 100;
			}

			while (euros >= 50) {
				billete50++;
		                euros -= 50;
			}

			while (euros >= 20) {
				billete20++;
				euros -= 20;
			}

			while (euros >= 10) {
				billete10++;
				euros -= 10;
			}

			while (euros >= 5) {
				billete5++;
				euros -= 5;
			}

			System.out.println("Desglose de billetes:");
			if (billete500 > 0) System.out.println(billete500 + " billete(s) de 500 €");
			if (billete200 > 0) System.out.println(billete200 + " billete(s) de 200 €");
			if (billete100 > 0) System.out.println(billete100 + " billete(s) de 100 €");
			if (billete50 > 0) System.out.println(billete50 + " billete(s) de 50 €");
			if (billete20 > 0) System.out.println(billete20 + " billete(s) de 20 €");
			if (billete10 > 0) System.out.println(billete10 + " billete(s) de 10 €");
			if (billete5 > 0) System.out.println(billete5 + " billete(s) de 5 €");
		}


	}

}
