/*
* Descripción: tipos de matrículas
* Autor: José
* Fecha: 029/10/2025
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
Scanner teclado = new Scanner(System.in);
		

        // Mostrar el menú de operaciones
        System.out.println("--- MENÚ DE OPERACIONES ---");
        System.out.println("1. Calcular PVP de cada matrícula.");
        System.out.println("2. Aplicar oferta a un tipo de matrícula (sin iva).");
        System.out.println("3. Calcular el importe total de matrículas realizadas (sin iva).");
        System.out.println("4. Salir");

        System.out.print("Seleccione una opción: ");
        int opcion = teclado.nextInt();
        int iva;
        int contadorIva=1;
        double precio1=10.0;
        double precio2=15.0;
        double precio3=20.0;
        int descuento;
        int cantidad1=0, cantidad2=0, cantidad3=0;

        // Evaluar la operación seleccionada
        switch (opcion) {
            case 1:
            	while (contadorIva<= 3) {
            		System.out.println("Ingrese el IVA para el tipo de matrícula " + contadorIva + " (4 - 10 - 21): ");
            		opcion = teclado.nextInt();
            		if (opcion == 4) {
            			precio1 = precio1 + ((precio1*opcion) / 100.0);
            			System.out.println(precio1);
            		}else if (opcion == 10) {
            			precio1 = precio1 + ((precio1*opcion) / 100.0);
            			System.out.println(precio1);
            		}else if (opcion == 21) {
            			precio1 = precio1 + ((precio1*opcion) / 100.0);
            			System.out.println(precio1);
            		}else {
            			System.out.println("La cantidad introducida no es valida");
            		}
            	}
                
                break;
            case 2:
                
                System.out.println("Seleccione tipo de matrícula ( 1. Fitness, 2. Yoga o 3. Musculación");
                opcion= teclado.nextInt();
                System.out.println("Ingrese el % de descuento");
                descuento = teclado.nextInt();
                if (opcion == 1) {
                	precio1 = precio1 * descuento / 100;
                	System.out.println("El precio final (sin iva) con descuento para el tipo de matrícula " + opcion + " es: " + precio1);
        		}else if (opcion == 2) {
        			precio2 = precio2 + ((precio1*opcion) / 100.0);
        			System.out.println("El precio final (sin iva) con descuento para el tipo de matrícula " + opcion + " es: " + precio2);
        		}else if (opcion == 3) {
        			precio3 = precio3 * descuento / 100;
                	System.out.println("El precio final (sin iva) con descuento para el tipo de matrícula " + opcion + " es: " + precio3);
        		}else {
        			System.out.println("La cantidad introducida no es valida");
        		}
                
                break;
            case 3:
                System.out.println("Ingrese las matrículas relizadas para el tipo de matrícula 1 (1. Fitness: ");
                cantidad1 = teclado.nextInt();
                System.out.println("Ingrese las matrículas relizadas para el tipo de matrícula 2 (2. Yoga: ");
                cantidad2 = teclado.nextInt();
                System.out.println("Ingrese las matrículas relizadas para el tipo de matrícula 3 (3. Musculación: ");
                cantidad3 = teclado.nextInt();
                System.out.println("El importe total (sin iva) de las matrículas relizadas es: " + ((precio1*cantidad1)+(precio2*cantidad2)+(precio3*cantidad3)));
                break;
            case 4:
                System.out.println("Saliendo del programa ...");
                break;
            
            default:
                System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 4.");
        
           }
		
	}

}
