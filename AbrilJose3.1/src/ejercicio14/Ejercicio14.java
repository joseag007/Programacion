/*
 * Descripción: secuencia 1,2,2,3,3,3...
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int total = 0;
        for (int num = 1; num <= 10; num++) {
            total += num;
        }

        int[] secuencia = new int[total];
        int indice = 0;

        for (int valor = 1; valor <= 10; valor++) {
            for (int rep = 0; rep < valor; rep++) {
                secuencia[indice] = valor;
                indice++;
            }
        }

        System.out.println("Secuencia generada:");
        for (int pos = 0; pos < secuencia.length; pos++) {
            System.out.print(secuencia[pos] + " ");
        }
        
        
	}
}