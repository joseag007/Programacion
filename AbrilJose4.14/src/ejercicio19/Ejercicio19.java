/*
 * Descripción: comprobacion pitágoras
 * Autor: José Abril
 * Fecha: 21/11/25
 */
package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static boolean cumplePitagoras(int x, int y, int z){
        return x*x + y*y == z*z;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce x: ");
        int x = teclado.nextInt();

        System.out.print("Introduce y: ");
        int y = teclado.nextInt();

        System.out.print("Introduce z: ");
        int z = teclado.nextInt();

        boolean resultado = cumplePitagoras(x, y, z);

        if(resultado)
            System.out.println("Sí cumplen: " + x + "² + " + y + "² = " + z + "²");
        else
            System.out.println("NO cumplen la ecuación de Pitágoras.");
    }
}