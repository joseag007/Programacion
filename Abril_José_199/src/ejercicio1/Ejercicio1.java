
/*
* Descripción: operaciones
* Autor: José
* Fecha: 029/10/2025
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

        System.out.println("CÁLCULO EXPRESIONES FÍSICAS/MATEMÁTICAS");
        System.out.println("------------------------------------");

        while (true) {                       // permite introducir varios casos
            double x = leer(sc, "Introduce el valor de X: ");
            double masa = leer(sc, "Introduce la masa (kg): ");
            double tiempo = leer(sc, "Introduce el tiempo (s): ");
            double frecuencia = leer(sc, "Introduce la frecuencia (hz): ");
            double radio = leer(sc, "Introduce el radio del círculo (m): ");

            // 1. Operación:   (frecuencia * x) / masa
            double operacion = (frecuencia * x) / masa;

            // 2. Fuerza peso: masa * g  (g = 9.81)
            double fuerzaPeso = masa * 9.81;

            // 3. Número de vueltas: frecuencia * tiempo   (se convierte a int)
            int numVueltas = (int) (frecuencia * tiempo);

            // 4. Área del círculo: π r²
            double areaCirculo = Math.PI * radio * radio;

            System.out.println("RESULTADOS");
            System.out.println("----------");
            System.out.printf("OPERACION: %.15f%n", operacion);
            System.out.printf("FUERZA_PESO: %.10f%n", fuerzaPeso);
            System.out.println("NUMERO_VUELTAS: " + numVueltas);
            System.out.printf("AREA_CIRCULO: %.15f%n", areaCirculo);

            // Preguntar si se quiere otro caso
            System.out.print("\n¿Desea introducir otro conjunto de datos? (s/n): ");
            String resp = sc.next();
            if (!resp.equalsIgnoreCase("s")) break;
        }

        sc.close();
    }

    /** Lee un double con mensaje */
    private static double leer(Scanner sc, String msg) {
        System.out.print(msg);
        return Double.parseDouble(sc.next().replace(',', '.'));
        
        
    }    
}