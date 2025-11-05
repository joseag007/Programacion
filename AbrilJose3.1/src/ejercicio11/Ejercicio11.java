/*
 * Descripción: array y array invertido
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {

		int[] listaA = new int[100];
        int[] listaB = new int[100];

        for (int indice = 0; indice < listaA.length; indice++) {
            listaA[indice] = indice + 1;
        }

        for (int indice = 0; indice < listaB.length; indice++) {
            listaB[indice] = listaA[listaA.length - 1 - indice];
        }

        System.out.println("Array original:");
        for (int indice = 0; indice < listaA.length; indice++) {
            System.out.print(listaA[indice] + " ");
        }

        System.out.println("\nArray invertido:");
        for (int indice = 0; indice < listaB.length; indice++) {
            System.out.print(listaB[indice] + " ");
        }
		
        
	}
}
