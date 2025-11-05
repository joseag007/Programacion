/*
 * Descripción: matriz 10*10 numeros 1-100
 * Autor: José Abril
 * Fecha: 4/11/25
 */
package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int[][] tablaMultiplicar = new int[10][10];

        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                tablaMultiplicar[fila][columna] = (fila + 1) * (columna + 1);
            }
        }

        System.out.println("Tablas de multiplicar del 1 al 10:");
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                System.out.print(tablaMultiplicar[fila][columna] + "\t");
            }
            System.out.println();
        }
        
		
	}
}
