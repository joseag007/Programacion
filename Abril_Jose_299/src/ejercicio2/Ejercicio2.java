/*
* Descripción: números aleatorios menores que X y números impares entre X e Y
* Autor: José
* Fecha: 12/11/2025
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		final int TOTAL = 30;          // nº de números a generar
        final int LIMITE = 300;        // rango [0 , 300]
        final int POR_FILA = 10;       // nº de valores por fila

// generar los 30 números de manera aleatoria
        int[] numeros = new int[TOTAL];

        System.out.println("Números generados (entre 0 y 300):");
        for (int contador = 0; contador < TOTAL; contador++) {
        	int respuesta = (int) (Math.random() * 300);
            numeros[contador] = respuesta; 


            System.out.printf("%4d", numeros[contador]);

            if ((contador + 1) % POR_FILA == 0) {
// se ejecuta un contador para que al llegar a diez se finalice la línea
                System.out.println();
            }
        }

        Scanner sc = new Scanner(System.in);

// Apartado a, busco los números menores que X
        int limiteEntrada;
        do {
            System.out.print("Introduce un número entre 0 y 300: ");
            limiteEntrada = sc.nextInt();

            if (limiteEntrada < 0 || limiteEntrada > LIMITE) {
                System.out.println("Valor fuera de rango, vuelve a intentarlo.");
            }
        } while (limiteEntrada < 0 || limiteEntrada > LIMITE);

        System.out.println("Valores menores que " + limiteEntrada + ":");
        boolean encontrado = false;
        for (int contador = 0; contador < TOTAL; contador++) {
            if (numeros[contador] < limiteEntrada) {
                System.out.printf("Posición %2d -> %3d%n", contador, numeros[contador]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay valores menores que " + limiteEntrada);
        }

// apartado b, números imparesentre dos posiciones
        int pos1, pos2;
        while (true) {
            System.out.print("Introduce dos posiciones entre 0 y "
                    + (TOTAL) + " separadas por espacio: ");
            pos1 = sc.nextInt();
            pos2 = sc.nextInt();

// Comprobamos que estén dentro del rango
            if (pos1 < 0 || pos1 >= TOTAL || pos2 < 0 || pos2 >= TOTAL) {
                System.out.println("Una o ambas posiciones están fuera de rango.");
                continue;
            }

// Aseguramos que la primera posición sea mayor que la segunda posición
            if (pos1 > pos2) {
                int i = pos1;
                pos1 = pos2;
                pos2 = i;
            }
            break;
        }

        System.out.println("Valores impares entre las posiciones "
                + pos1 + " y " + pos2 + ":");
        boolean impar = false;
        for (int contador = pos1; contador <= pos2; contador++) {
            if (numeros[contador] % 2 != 0) {// comprobamos si es impar
                System.out.printf("Posición %2d -> %3d%n", contador, numeros[contador]);
                impar = true;
            }
        }
        if (!impar) {
            System.out.println("No hay valores impares entre esas posiciones.");
        }
		
        
	}
}
