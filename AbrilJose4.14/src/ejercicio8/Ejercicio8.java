/*
 * Descripción: sumatorio, productorio y intermedio de 1 a N
 * Autor: José Abril
 * Fecha: 20/11/25
 */
package ejercicio8;

public class Ejercicio8 {

		 public static void main(String[] args) {
		        java.util.Scanner teclado = new java.util.Scanner(System.in);

		        System.out.print("Introduce N: ");
		        int n = teclado.nextInt();
		        
		        suma(n);
		        producto(n);
		        intermedio(n);
		    }

		    public static int suma(int n) {
		        int suma = 0;
		        for (int i = 1; i <= n; i++) suma += i;
		        System.out.println("El sumatorio de 1 a N es " + suma);
		        return suma;
		    }

		    public static int producto(int n) {
		        int producto = 1;
		        for (int i = 1; i <= n; i++) producto *= i;
		        System.out.println("El productorio de 1 a N es " + producto);
		        return producto;
		    }

		    public static double intermedio(int n) {
		        double intermedio = (1 + n) / 2.0;
		        System.out.println("El número intermedio es " + intermedio);
		    return intermedio;
		    }
		}