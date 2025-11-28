package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	 public static boolean comparaNombres(String nombre1, String nombre2) {
	        return nombre1.equalsIgnoreCase(nombre2); // ignora mayúsculas/minúsculas
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce el primer nombre: ");
	        String nombre1 = sc.nextLine();
	        System.out.print("Introduce el segundo nombre: ");
	        String nombre2 = sc.nextLine();

	        boolean resultado = comparaNombres(nombre1, nombre2);
	        System.out.println("¿Son iguales los nombres? " + resultado);
	    }
	}