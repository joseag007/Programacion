/*
 * Descripción: generar matriz pidiendo datos
 * Autor: José Abril
 * Fecha: 4/11/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Número de filas (N): ");
        int numFilas = sc.nextInt();

        System.out.print("Número de columnas (M): ");
        int numColumnas = sc.nextInt();

        int[][] matriz = new int[numFilas][numColumnas];

        for (int fila = 0; fila < numFilas; fila++) {
            for (int columna = 0; columna < numColumnas; columna++) {
                System.out.print("Valor [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = sc.nextInt();
            }
        }

        int contMayores = 0;
        int contMenores = 0;
        int contCeros = 0;

        for (int fila = 0; fila < numFilas; fila++) {
            for (int columna = 0; columna < numColumnas; columna++) {
                int valor = matriz[fila][columna];
                if (valor > 0) contMayores++;
                else if (valor < 0) contMenores++;
                else contCeros++;
            }
        }

        System.out.println("\nMayores que cero: " + contMayores);
        System.out.println("Menores que cero: " + contMenores);
        System.out.println("Iguales a cero: " + contCeros);

		
	}
}
