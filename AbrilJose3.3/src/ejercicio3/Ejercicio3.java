package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		// Solicitar nombre y apellidos
        System.out.println("Introduce tu nombre:");
        String nombre = teclado.nextLine();

        System.out.println("Introduce tu primer apellido:");
        String apellido1 = teclado.nextLine();

        System.out.println("Introduce tu segundo apellido:");
        String apellido2 = teclado.nextLine();

        // Obtener las tres primeras letras de cada cadena y convertir a mayúsculas
        String ininombre = nombre.substring(0, 3);
        String iniapellido1 = apellido1.substring(0, 3);
        String iniapellido2 = apellido2.substring(0, 3);
        String codigoUsuario;
        
        codigoUsuario = (ininombre + iniapellido1 + iniapellido2).toUpperCase();

        // Mostrar resultado
        System.out.println("Código de usuario: " + codigoUsuario);

        
        
	}

}
