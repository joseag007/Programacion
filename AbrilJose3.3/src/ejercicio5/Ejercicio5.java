/*
 * Descripción: Diferenciar entre palíndromos y no palíndromos
 * Autor: José Abril
 * Fecha: 19/11/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String fraseOriginal = teclado.nextLine();

        boolean esPalindromo = comprobarPalindromo(fraseOriginal);

        if (esPalindromo) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }

    public static boolean comprobarPalindromo(String frase) {

        // Convertir a minúsculas
        String fraseMinusculas = frase.toLowerCase();

        // Eliminar espacios
        String fraseSinEspacios = fraseMinusculas.replace(" ", "");

        // Invertir la frase
        String fraseInvertida = "";
        for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
            fraseInvertida += fraseSinEspacios.charAt(i);
        }

        // Comparar
        return fraseSinEspacios.equals(fraseInvertida);
    }
}