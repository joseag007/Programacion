
/*
* Descripción: operaciones
* Autor: José
* Fecha: 029/10/2025
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {


		Scanner Scanner = new Scanner(System.in);
        
        System.out.println("CÁLCULO EXPRESIONES FÍSICAS/MATEMÁTICAS");
        System.out.println("------------------------------------");

        System.out.print("Introduzca el valor de la X: ");
        double X = Scanner.nextDouble();
        System.out.print("Introduce la masa (kg): ");
        double masa = Scanner.nextDouble();
        System.out.print("Introduce el tiempo (s): ");
        double tiempo = Scanner.nextDouble();
        System.out.print("Introduce la frecuencia (hz): ");
        double frecuencia = Scanner.nextDouble();
        System.out.print("Introduce el radio del círculo (m): ");
        double radio = Scanner.nextDouble();

        System.out.println("RESULTADOS");
        System.out.println("----------");

        // 1. OPERACION
        double operacion = (X+(X/4.0)) / (6.0 - (X/2.0));
        System.out.println("OPERACION: " + operacion);

        // 2. FUERZA_PESO   (g = 9,81 m/s²)
        double g = 9.8;
        double fuerzaPeso = (masa * g);
        System.out.println("FUERZA_PESO: " + fuerzaPeso);

        // 3. NUMERO_VUELTAS
        int numeroVuelta = (int) (frecuencia * tiempo);
        System.out.println("NUMERO_VUELTAS: " + numeroVuelta);

        // 4. AREA_CIRCULO
        double areaCirculo = (Math.PI * (radio * radio));
        System.out.println("AREA_CIRCULO: " + areaCirculo);
    }
        
    }
