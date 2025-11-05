/*
 * Descripción: array con menu
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] listaNums = new int[10];
        boolean seguir = true;

        while (seguir) {
            System.out.println("\nMenú:");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige opción: ");
            String opcion = sc.next();

            if (opcion.equals("a")) {
                System.out.println("Valores del array:");
                for (int indice = 0; indice < listaNums.length; indice++) {
                    System.out.println("Posición " + indice + ": " + listaNums[indice]);
                }
            } else if (opcion.equals("b")) {
                System.out.print("Valor a introducir: ");
                int valor = sc.nextInt();
                System.out.print("Posición (0-9): ");
                int pos = sc.nextInt();
                if (pos >= 0 && pos < listaNums.length) {
                    listaNums[pos] = valor;
                } else {
                    System.out.println("Posición no válida.");
                }
            } else if (opcion.equals("c")) {
                seguir = false;
            } else {
                System.out.println("Opción no válida.");
            }
        }
        
		
	}
}
