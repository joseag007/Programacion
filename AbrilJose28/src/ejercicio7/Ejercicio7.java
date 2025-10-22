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

		        int respuesta = (int) (Math.random() * 50);
		        
		        int intento = -1; // variable para el número del usuario
		        int intentos = 0; // contador de intentos
		        
		        System.out.println("Intenta adivinar el número entre 1 y 50 incluidos");
		        
		        while (intento != respuesta) {
		            System.out.print("Introduce un número: ");
		            intento = teclado.nextInt();
		            intentos++;
		            
		            if (intento < respuesta) {
		                System.out.println("MAYOR");
		            } else if (intento > respuesta) {
		                System.out.println("MENOR");
		            } else {
		                System.out.println("¡Correcto! El número era: " + respuesta );
		                System.out.println("Has necesitado " + intentos + " intentos.");
		            }
		        }
		        
		
	}

}
