/*
 * Descripción: que número es menor int minimo
 * Autor: José Abril
 * Fecha: 20/11/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = teclado.nextInt();

        minimo(num1, num2);
    }

    public static int minimo(int a, int b) {
        if (a > b) {
            System.out.println(b + " es menor que " + a);
        } else {
            System.out.println(a + " es menor que " + b);
        }
        return b;
    }
}