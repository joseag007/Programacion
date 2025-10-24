/*
 * Descripción: potencia
 * Autor: José Abril
 * Fecha: 24/10/25
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce la base de la potencia: ");
        int A = teclado.nextInt();
        System.out.print("Introduce el exponente de la potencia: ");
        int B = teclado.nextInt();
        int contador=1;
        int resultado =A;
        
        while ( contador< B){
        	resultado = A * resultado;
        	contador++;
        	
        }
        
        System.out.println(A + " elevado a " + B + " es igual a: " + resultado);
        
	}
}
