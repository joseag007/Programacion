/*
 * Descripción: area y perimetros rectángulo
 * Autor: José Abril
 * Fecha: 20/11/25
 */
package ejercicio7;

public class Ejercicio7 {

	 public static void main(String[] args) {
	        java.util.Scanner teclado = new java.util.Scanner(System.in);

	        System.out.print("Ancho: ");
	        double ancho = teclado.nextDouble();

	        System.out.print("Alto: ");
	        double alto = teclado.nextDouble();

	        System.out.println("Perímetro: " + perimetro(ancho, alto));
	        System.out.println("Área: " + area(ancho, alto));
	    }

	    public static double perimetro(double ancho, double alto) {
	        double respuesta = (int) (2 * (ancho + alto));
	        System.out.println("El perímetro del rectángulo es " + respuesta);
	        return ancho;
	    }

	    public static double area(double ancho, double alto) {
	    	 double respuesta = (int) (ancho * alto);
		        System.out.println("El área del rectángulo es " + respuesta);
		        return ancho;
	    }
	}