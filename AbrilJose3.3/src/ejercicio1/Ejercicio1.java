package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();

        // Dividir la cadena por espacios 
        String[] palabras = cadena.split(" ");// el espacio sirve para separar la cadena cada vez que encuentre un espacio

        // Mostrar cada palabra en una línea distinta
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
		        
	}
}
