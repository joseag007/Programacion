package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto: ");
        String cadena1 = teclado.nextLine();
        
        System.out.println("Introduce una cadena de texto: ");
        String cadena2 = teclado.nextLine();
        
        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Ambas cadenas de texto son iguales, sin diferenciar entre mayusculas y minusculas.");
        } else {
            System.out.println("Las cadenas de texto son diferentes.");
        }
        
           
	}
}