/*
 * Descripción: ficha senderista
 * Autor: José Abril
 * Fecha: 17/10/25
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // petición de datos generales
        System.out.print("Introduzca su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Introduzca sus apellidos: ");
        String apellidos = teclado.nextLine();

        byte edad;
        System.out.print("Introduzca su edad: ");
        edad = teclado.nextByte();

        // Validar edad
        while (edad <= 17 || edad >= 45) {
            System.out.println("Esa edad no es correcta.");
            System.out.print("Introduzca su edad: ");
            edad = teclado.nextByte();
        }

        System.out.print("Introduzca el número de rutas que ha realizado: ");
        int rutas = teclado.nextInt();

        System.out.print("Introduzca la distancia que recorrió en su última ruta (km): ");
        double ultimaDistancia = teclado.nextDouble();

        // datos de las 5 rutas
        int contador = 1;
        double distancia, sumaDistancias = 0, distanciaMax = 0;
        String ciudad = "", ciudadMax = "";

        while (contador <= 5) {
            System.out.println("Ruta " + contador);

            System.out.println("Distancia (km): ");
            distancia = teclado.nextDouble();
            sumaDistancias += distancia;

            if (distancia > distanciaMax) {
                distanciaMax = distancia;
                teclado.nextLine();
                System.out.println("Ciudad: ");
                ciudadMax = teclado.nextLine();
            } else {
            	teclado.nextLine();
                System.out.println("Ciudad: ");
                ciudad = teclado.nextLine();
            }

            System.out.println("Número de participantes: ");
            int participantes = teclado.nextInt();

            contador++;
        }

        double distanciaMedia = sumaDistancias / 5;

        // mostrar ficha
        System.out.println("FICHA DEL SENDERISTA");
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Número de rutas realizadas: " + rutas);
        System.out.println("Distancia de la última ruta: " + ultimaDistancia + " km");
        System.out.println("Distancia media (5 últimas rutas): " + distanciaMedia + " km");
        System.out.println("Distancia más larga de las últimas 5 rutas: " + distanciaMax + " km");
        System.out.println("Ciudad de la ruta más larga: " + ciudadMax);

    }
}
