/*
 * Descripción: piramide, solicitar caracter y lineas
 * Autor: José Abril
 * Fecha: 21/11/25
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void triangulo(char caracter, int lineas){
        for(int alto = 1; alto <= lineas; alto++){

            // Espacios para centrar
            for(int e = 0; e < lineas - alto; e++){
                System.out.print(" ");
            }

            
            for(int ancho = 1; ancho <= (alto * 2 - 1); ancho++){
                System.out.print(caracter);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedir el carácter
        System.out.print("Introduce el carácter a mostrar: ");
        char caracter = teclado.next().charAt(0);

        // Pedir número de filas
        System.out.print("Introduce número de líneas: ");
        int lineas = teclado.nextInt();

        
        triangulo(caracter, lineas);
    }
    
}