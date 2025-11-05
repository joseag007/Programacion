/*
 * Descripción: maxima, minima y media altura array
 * Autor: José Abril
 * Fecha: 31/10/25
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Número de personas: ");
        int numPersonas = sc.nextInt();

        double[] listaAlturas = new double[numPersonas];

        for (int indice = 0; indice < listaAlturas.length; indice++) {
            System.out.print("Altura " + (indice + 1) + ": ");
            listaAlturas[indice] = sc.nextDouble();
        }

        double sumaAlturas = 0;
        double alturaMax = listaAlturas[0];
        double alturaMin = listaAlturas[0];

        for (int indice = 0; indice < listaAlturas.length; indice++) {
            double alturaActual = listaAlturas[indice];
            sumaAlturas += alturaActual;
            if (alturaActual > alturaMax) alturaMax = alturaActual;
            if (alturaActual < alturaMin) alturaMin = alturaActual;
        }

        double alturaMedia = sumaAlturas / numPersonas;
        int contEncima = 0;
        int contDebajo = 0;

        for (int indice = 0; indice < listaAlturas.length; indice++) {
            if (listaAlturas[indice] > alturaMedia) contEncima++;
            else if (listaAlturas[indice] < alturaMedia) contDebajo++;
        }

        System.out.println("Altura media: " + alturaMedia);
        System.out.println("Altura máxima: " + alturaMax);
        System.out.println("Altura mínima: " + alturaMin);
        System.out.println("Personas por encima de la media: " + contEncima);
        System.out.println("Personas por debajo de la media: " + contDebajo);


	}

}
