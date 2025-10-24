/*
 * Descripción: leer notas (-1 para)
 * Autor: José Abril
 * Fecha: 24/10/25
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num;
        int positivos = 0;

        System.out.println("Introduzca -1 para terminar");
        
        System.out.print("Introduce una nota: ");
        num = teclado.nextInt();

        while (num != -1) {
            if (num >= 0 && num <= 10) {
                System.out.println("La nota introducida es: " + num);
                if (num == 10) {
                    positivos++;
                }
            }

            System.out.print("Introduce otra nota: ");
            num = teclado.nextInt();
        }

        if (positivos > 0) {
            System.out.println("Ha introducido " + positivos + " nota(s) equivalente(s) a diez.");
        } else {
            System.out.println("No se ha introducido ninguna nota equivalente a diez.");
        }


    }
}