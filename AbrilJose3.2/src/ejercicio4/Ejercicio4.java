/*
 * Descripción: maximo, minimo y media notas
 * Autor: José Abril
 * Fecha: 5/11/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        double[][] notas = new double[4][5];

        for (int alumno = 0; alumno < 4; alumno++) {
            System.out.println("Introduce las notas del Alumno " + (alumno + 1) + ":");
            for (int asignatura = 0; asignatura < 5; asignatura++) {
                System.out.print("Nota " + (asignatura + 1) + ": ");
                notas[alumno][asignatura] = sc.nextDouble();
            }
        }

        for (int alumno = 0; alumno < 4; alumno++) {
            double sumaNotas = 0;
            double notaMax = notas[alumno][0];
            double notaMin = notas[alumno][0];

            for (int asignatura = 0; asignatura < 5; asignatura++) {
                double notaActual = notas[alumno][asignatura];
                sumaNotas += notaActual;
                if (notaActual > notaMax) notaMax = notaActual;
                if (notaActual < notaMin) notaMin = notaActual;
            }

            double notaMedia = sumaNotas / 5;
            System.out.println("\nAlumno " + (alumno + 1) + ":");
            System.out.println("Nota mínima: " + notaMin);
            System.out.println("Nota máxima: " + notaMax);
            System.out.println("Nota media: " + notaMedia);
        }

		
	}
}
