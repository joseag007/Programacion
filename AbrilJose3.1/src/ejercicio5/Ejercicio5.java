/*
 * Descripción: media numeros reales array
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        double[] nums = new double[20];
        int contador = 0;
        double suma = 0;

        // Pedir los 20 números al usuario
        while (contador < nums.length) {
            System.out.print("Introduce número real " + (contador + 1) + ": ");
            nums[contador] = teclado.nextDouble();
            suma += nums[contador];
            contador++;
        }

        // Calcular la media
        double media = suma / nums.length;

        
        System.out.println("La suma de los valores introducidos es: " + suma);
        System.out.println("La media de los valores introducidos es: " + media);

        teclado.close();
    }
}