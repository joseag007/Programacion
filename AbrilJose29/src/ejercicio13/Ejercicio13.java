/*
 * Descripción: adivinar número del usuario
 * Autor: José Abril
 * Fecha: 24/10/25
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Piensa un número del 1 al 100");
        System.out.print("Introduce tu número: ");
        int numeroUsuario = teclado.nextInt(); 
        
        int limiteInferior = 1;
        int limiteSuperior = 100;
        int intento;
        String respuestaUsuario;


        while (true) {

            
            if (limiteInferior <= limiteSuperior) {
                intento = limiteInferior + (int)(Math.random() * (limiteSuperior - limiteInferior + 1));
            } else {
                System.out.println("¡Error! El rango se volvió inválido. Revisa tus respuestas.");
                break;
            }

            
            System.out.println(intento);

            
            System.out.print("Tu número es mayor, menor o igual?: ");
            respuestaUsuario = teclado.next();

            if (respuestaUsuario.equalsIgnoreCase("mayor")) {
                limiteInferior = intento + 1;
            } else if (respuestaUsuario.equalsIgnoreCase("menor")) {
                limiteSuperior = intento - 1;
            } else if (respuestaUsuario.equalsIgnoreCase("igual")) {
                System.out.println("El número era: " + intento);
                break;
            } else {
                System.out.println("Por favor, responde 'mayor', 'menor' o 'igual'.");
            }
        }

        
    }
}