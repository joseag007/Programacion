/*
* Descripción: tipos de matrículas
* Autor: José
* Fecha: 029/10/2025
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        double[] precios = {10.0, 15.0, 20.0};  // Fitness, Yoga, Musculación

        while (true) {
            System.out.println("\n--- MENÚ DE OPERACIONES ---");
            System.out.println("1. Calcular PVP de cada matricula.");
            System.out.println("2. Aplicar oferta a un tipo de matricula (sin iva).");
            System.out.println("3. Calcular el importe total de matriculas realizadas (sin iva).");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularPVP(scanner, precios);
                    break;
                case 2:
                    aplicarOferta(scanner, precios);
                    break;
                case 3:
                    calcularImporteTotal(scanner, precios);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    /**
     * Método para calcular el PVP de cada matrícula.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     * @param precios Arreglo con los precios de las matriculas.
     */
    public static void calcularPVP(Scanner scanner, double[] precios) {
        double[] iva = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el IVA para el tipo de matrícula " + (i + 1) + " (4 - 10 - 21): ");
            iva[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 3; i++) {
            double pvp = precios[i] * (1 + iva[i] / 100);
            System.out.printf("El PVP de la actividad de %s es: %.2f€\n", getTipoMatricula(i + 1), pvp);
        }
    }

    /**
     * Método para aplicar oferta a un tipo de matrícula.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     * @param precios Arreglo con los precios de las matriculas.
     */
    public static void aplicarOferta(Scanner scanner, double[] precios) {
        System.out.print("Seleccione tipo de matrícula (1. Fitness, 2. Yoga o 3. Musculación): ");
        int tipo = scanner.nextInt();
        System.out.print("Ingrese el % de descuento a aplicar: ");
        double descuento = scanner.nextDouble();
        double precioFinal = precios[tipo - 1] * (1 - descuento / 100);
        System.out.printf("El precio final (sin iva) con descuento para el tipo de matrícula %d es: %.2f€\n", tipo, precioFinal);
    }

    /**
     * Método para calcular el importe total de matriculas realizadas.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     * @param precios Arreglo con los precios de las matriculas.
     */
    public static void calcularImporteTotal(Scanner scanner, double[] precios) {
        double total = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese las matrículas realizadas para el tipo de matrícula " + (i + 1) + " (1. Fitness, 2. Yoga o 3. Musculación): ");
            int matriculas = scanner.nextInt();
            total += matriculas * precios[i];
        }
        System.out.printf("El importe total (sin iva) de las matrículas realizadas es: %.2f€\n", total);
    }

    /**
     * Método para obtener el tipo de matrícula en formato de cadena.
     * @param tipo Número del tipo de matrícula (1, 2 o 3).
     * @return Nombre del tipo de matrícula.
     */
    public static String getTipoMatricula(int tipo) {
        switch (tipo) {
            case 1:
                return "Fitness";
            case 2:
                return "Yoga";
            case 3:
                return "Musculación";
            default:
                return "Desconocido";
        }
		
	}

}
