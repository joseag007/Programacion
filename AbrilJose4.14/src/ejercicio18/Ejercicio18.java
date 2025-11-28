/*
 * Descripción: calcular letra DNI
 * Autor: José Abril
 * Fecha: 21/11/25
 */
package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {
	
	public static char letraDNI(int dni){
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letras[dni % 23];
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce DNI: ");
        int dni = teclado.nextInt();
        System.out.println("La letra es: " + letraDNI(dni));
    }
}