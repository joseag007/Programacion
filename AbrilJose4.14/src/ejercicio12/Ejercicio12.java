/*
 * Descripción: kilometros a millas
 * Autor: José Abril
 * Fecha: 21/11/25
 */
package ejercicio12;

public class Ejercicio12 {

	public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        System.out.print("Kilómetros: ");
        double km = teclado.nextDouble();

        double millas = kmAMillas(km);
    }

    public static double kmAMillas(double km) {
       double cambio = km/1.60934;
       System.out.println(km + " kilometros son " + cambio + " millas");
    	return cambio;
    }
}