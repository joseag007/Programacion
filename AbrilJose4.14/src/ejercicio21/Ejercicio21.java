/*
 * Descripción: volumen, area, circunferencia
 * Autor: José Abril
 * Fecha: 21/11/25
 */
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

	static Scanner sc = new Scanner(System.in);

    // ----- FUNCIONES -----

    // Muestra el menú y devuelve la opción elegida
    public static int menu() {
        System.out.println("\n---- MENÚ ----");
        System.out.println("1. Circunferencia");
        System.out.println("2. Área");
        System.out.println("3. Volumen");
        System.out.println("4. Todas");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
        return sc.nextInt();
    }

    // Pide el radio al usuario
    public static double pideRadio() {
        System.out.print("Introduce el radio: ");
        return sc.nextDouble();
    }

    // Longitud de circunferencia
    public static double circunferencia(double r) {
        return 2 * Math.PI * r;
    }

    // Área del círculo
    public static double area(double r) {
        return Math.PI * r * r;
    }

    // Volumen de esfera
    public static double volumen(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    // ----- PROGRAMA PRINCIPAL -----
    public static void main(String[] args) {

        int opcion;

        do {
            opcion = menu(); // mostrar menú y leer opción

            switch (opcion) {

                case 1: {
                    double r = pideRadio();
                    System.out.println("Circunferencia: " + circunferencia(r));
                    break;
                }

                case 2: {
                    double r = pideRadio();
                    System.out.println("Área: " + area(r));
                    break;
                }

                case 3: {
                    double r = pideRadio();
                    System.out.println("Volumen: " + volumen(r));
                    break;
                }

                case 4: {
                    double r = pideRadio();
                    System.out.println("Circunferencia: " + circunferencia(r));
                    System.out.println("Área: " + area(r));
                    System.out.println("Volumen: " + volumen(r));
                    break;
                }

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5); // repetir hasta salir
    }
}