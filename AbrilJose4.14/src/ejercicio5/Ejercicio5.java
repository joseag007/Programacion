/*
 * Descripción: millas a kilometros
 * Autor: José Abril
 * Fecha: 20/11/25
 */
package ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        System.out.print("Introduce millas: ");
        int millas = teclado.nextInt();

        System.out.println("Kilómetros: " + millas_a_kilometros(millas));
    }

    public static double millas_a_kilometros(int millas) {
        return millas * 1.60934;
    }
}