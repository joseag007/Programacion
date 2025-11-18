/*
* Descripción: números por decena y media aritmética por decena
* Autor: José
* Fecha: 12/11/2025
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
	
        int[] contador = new int[10];
        int[] suma      = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números entre 1 y 100 (Introduce un 0 para terminar)."); // petición de un valor

        while (true) {
            System.out.print("- ");
            int num = sc.nextInt();

            if (num == 0) {
// se establece la condición de cierre del programa, que es introducir el valor 0
                break;
            }

            if (num >= 1 && num <= 100) {   
// se comprueba que el número introducido pertenezca al rango delimitado
                int indice = (num - 1) / 10;      
                contador[indice]++;
                suma[indice] += num;
            } else {
// si el valor no pertenece al rango, se avisa y se vuelve a pedir un valor
                System.out.println("El valor esta fuera del rango solicitado, por favor introduzca otro valor.");
            }
        }
        System.out.println("Resultados:");
        for (int posicion = 0; posicion < 10; posicion++) {
            int decenaInicio = posicion * 10 + 1;
            int decenaFin    = (posicion == 9) ? 100 : (posicion + 1) * 10;

            System.out.printf("Decena %2d-%3d:   Cantidad = %2d   ",
                    decenaInicio, decenaFin, contador[posicion]);

            if (contador[posicion] > 0) {
                double media = (double) suma[posicion] / contador[posicion];
                System.out.printf("Media = %.2f%n", media);
            } else {
                System.out.println("Sin datos.");
            }
        }
        
        
    }
}