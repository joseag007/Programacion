/*
* Descripción: calculo de medias
* Autor: José
* Fecha: 09/10/2025
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		

        // Solicitar notas al usuario
        System.out.print("Introduce la nota de la primera asignatura: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Introduce la nota de la segunda asignatura: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Introduce la nota de la tercera asignatura: ");
        double nota3 = teclado.nextDouble();

        System.out.print("Introduce la nota de la cuarta asignatura: ");
        double nota4 = teclado.nextDouble();

        // Calcular la media
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Mostrar la nota media real
        System.out.println("\nLa nota media obtenida es: " + media);

        // Redondear hacia arriba y hacia abajo
        int mediaArriba = (int) Math.ceil(media);
        int mediaAbajo = (int) Math.floor(media);

        System.out.println("La nota media redondeada hacia arriba es: " + mediaArriba);
        System.out.println("La nota media redondeada hacia abajo es: " + mediaAbajo);

        // Evaluar si puede acceder a estudios superiores
        if (media >= 8) {
            System.out.println("¡Felicidades! Puedes acceder a estudios superiores.");
        } else {
            System.out.println("Lo sentimos, la nota media obtenida no es suficiente para acceder a los estudios que deseabas.");
        }

	}

}
