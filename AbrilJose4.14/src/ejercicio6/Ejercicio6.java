/*
 * Descripción: iva a precios
 * Autor: José Abril
 * Fecha: 20/11/25
 */
package ejercicio6;

public class Ejercicio6 {

		 public static void main(String[] args) {
		        java.util.Scanner teclado = new java.util.Scanner(System.in);

		        for (int i = 1; i <= 5; i++) {
		            System.out.print("Precio " + i + ": ");
		            double precio = teclado.nextDouble();
		            System.out.println("Precio con IVA: " + precioConIVA(precio));
		        }
		    }

		    public static double precioConIVA(double precio) {
		        return precio * 1.21;
		    }
		}