/*
 * Descripción: media + - y número de ceros
 * Autor: José Abril
 * Fecha: 16/10/25
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // inicializaciones de variables
        
        int sumaPositivos = 0;
        int contadorPositivos = 0;
        int sumaNegativos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        int contadorTotal = 0;

        do {
            System.out.print("Introduce un número: ");
            int num = teclado.nextInt(); // petición de número

            if (num > 0) { // número positivo
                sumaPositivos = sumaPositivos +  num;
                contadorPositivos++;
            } else if (num < 0) { // número negativo
                sumaNegativos = sumaNegativos + num;
                contadorNegativos++;
            } else { // cantidad de ceros
                contadorCeros++;
            }

            contadorTotal++;

        } while (contadorTotal < 10);

        // mostrar resultados
        
            System.out.println("Media de los positivos: " + sumaPositivos / contadorPositivos);
        
            System.out.println("Media de los negativos: " + sumaNegativos / contadorNegativos);
        
        System.out.println("Cantidad de ceros introducidos: " + contadorCeros);
    }
}