/*
 * Descripción: Diferenciar entre palindromos y nio palindromos
 * Autor: José Abril
 * Fecha: 19/11/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        // Convertir a minúsculas
        frase = frase.toLowerCase();

        // Eliminar espacios
        String fraseSinEspacios = frase.replace("", "");

        // Construir la frase invertida
        String fraseInvertida = "";
        for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
            fraseInvertida += fraseSinEspacios.charAt(i);
        }

        // Comprobar si es palíndromo
        if (fraseSinEspacios.equals(fraseInvertida)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
	
        
	}
}
