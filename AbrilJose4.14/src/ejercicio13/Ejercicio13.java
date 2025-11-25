/*
 * Descripción: calculo de descuento
 * Autor: José Abril
 * Fecha: 21/11/25
 */
package ejercicio13;

public class Ejercicio13 {

	 public static void main(String[] args) {
	        java.util.Scanner teclado = new java.util.Scanner(System.in);

	        System.out.print("Precio sin descuento: ");
	        double sin = teclado.nextDouble();

	        System.out.print("Precio con descuento: ");
	        double con = teclado.nextDouble();

	        double descuentos= descuento(sin, con);
	    }

	    public static double descuento(double sin, double con) {
	        double descuento = (1 - (con / sin)) * 100;
	        System.out.println("Su desceunto es del " + descuento + " por ciento.");
	    	return descuento;
	    }
	    
	    
	}