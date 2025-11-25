/*
 * Descripción: menor de entre tres
 * Autor: José Abril
 * Fecha: 20/11/25
 */
package ejercicio9;

public class Ejercicio9 {

	 public static void main(String[] args) {
	        java.util.Scanner sc = new java.util.Scanner(System.in);

	        System.out.print("Valor 1: ");
	        int a = sc.nextInt();

	        System.out.print("Valor 2: ");
	        int b = sc.nextInt();

	        System.out.print("Valor 3: ");
	        int c = sc.nextInt();

	        int minimo = min(min(a, b), c); 
	        // Comprubo si es menor a o b y lugo el menor entre a y b con c

	        System.out.println("El menor es: " + minimo);
	    }

	    public static int min(int x, int y) {
	        return x < y ? x : y;
	    }
	}