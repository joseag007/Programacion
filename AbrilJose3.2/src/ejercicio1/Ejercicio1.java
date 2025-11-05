/*
 * Descripción: matriz 5*5 numeros 1-25
 * Autor: José Abril
 * Fecha: 4/11/25
 */
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[5][5];
        int numero = 1;

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                matriz[fila][columna] = numero;
                numero++;
            }
        }

        System.out.println("Matriz 5x5:");
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }
		
		
	}
}
