/*
* Descripción: ciclo y nota, con matrícula de honor
* Autor: José
* Fecha: 07/10/2025
*/
package ejercicio6;

import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		
		String nombre;
	    System.out.print("Introduzca su nombre: ");
	    nombre = teclado.nextLine();
	    
	    String apellidos;
	    System.out.print("Introduzca sus apellidos: ");
	    apellidos = teclado.nextLine();
	    
	    String ciclo;
	    System.out.print("Introduzca su ciclo formativo: ");
	    ciclo = teclado.nextLine();
	    
	    int nota;
	    System.out.println("Introduzca su nota académica: ");
	    nota = teclado.nextInt();
	    
	    System.out.println("Nombre: " + nombre);
    	System.out.println("Apellidos: " + apellidos);
    	System.out.println("Ciclo Formativo: " + ciclo);
    	
    	String notaCualitativa = "ERROR";
    	
    	if (nota >= 0 && nota <= 10)
			if ( nota < 5 )
				notaCualitativa= "(INSUFICIENTE)";
			else if ( nota < 6  )
				notaCualitativa= "(SUFICIENTE)";
			else if (  nota < 7  )
				notaCualitativa= "(BIEN)";
			else if ( nota < 9 )
				notaCualitativa= "(NOTABLE)";
			else if ( nota< 10 )
				notaCualitativa= "(SOBRESALIENTE)";
			else if ( nota == 10 )
				notaCualitativa= "(Matrícula de Honor)";
		
		if (nota >=0 && nota <= 10 ){ 
			System.out.println ("Nota académica: " + nota + notaCualitativa);
		} else {
			System.out.println("La nota introducida no es valida");
		}
		
	}

}
