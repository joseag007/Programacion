/*
 * Descripción: adivina el número
 * Autor: José Abril
 * Fecha: 16/10/25
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		        int N = (int)(Math.random() * 51);
		        
		        int intento = -1; // variable para el número del usuario
		        int intentos = 0; // contador de intentos
		        
		        System.out.println("¡Bienvenido al juego de adivinar el número!");
		        System.out.println("Intenta adivinar el número entre 1 y 50 incluidos");
		        
		        while (intento != N) {
		            System.out.print("Introduce un número: ");
		            intento = teclado.nextInt();
		            intentos++;
		            
		            if (intento < N) {
		                System.out.println("MAYOR");
		            } else if (intento > N) {
		                System.out.println("MENOR");
		            } else {
		                System.out.println("¡Correcto! El número era: " + N );
		                System.out.println("Has necesitado " + intentos + " intentos.");
		            }
		        }
		        
		
	}

}
