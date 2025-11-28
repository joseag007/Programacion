/*
 * Descripción: media aritmetica  alumnos hasta ingresar fin
 * Autor: José Abril
 * Fecha: 26/11/25
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
		
		String nombre = "";
		int contador=1;
		int nota = 0;
		int suma = 0;
		
		double[] notas = new double[100]; 
		int resultado = 0;
		String[] nombres = new String [100];
        
		while (true) {
			if (nombre == "fin") {
				 while (contador < nombres.length) {
			System.out.println("Las medias aritmeticas son:");
	        contador = 0;}
	        while (contador < notas.length) {
	            System.out.println(" La nota aritmetica de "  + nombres[contador] +  "es : " + notas[contador]);
	            contador++;}
	        } else {
			
			System.out.println("Introduzca un nombre");
			nombre = teclado.next();
			nombres [contador] = nombre;
		while (contador <= 4) {
			
			System.out.println("Introduzca la nota de la " + contador + "ª evaluación");
			nota = teclado.nextInt();
			
			if (nota <= 10 && nota >= 0) {
				suma = nota + suma;
				contador++;
			}else {
				System.out.println(" La nota introducida no es valida.");
				
			}
			resultado = suma/4;
			notas [contador] = resultado ;
		}
				}
			}
		}
	}
