/*
 * Descripción: tablas multiplicar
 * Autor: José Abril
 * Fecha: 20/11/25
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        System.out.print("Número: ");
        int num = teclado.nextInt();

        tabla(num);
    }

    public static void tabla(int num) {
        for (int numtabla = 1; numtabla <= 10; numtabla++)
            System.out.println(num + " x " + numtabla + " = " + (num * numtabla));
    }
}