/*
* Descripción: entrevista de recursos humanos, distinción sueldo
* Autor: José
* Fecha: 08/10/2025
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
Scanner teclado = new Scanner(System.in);
		
		String nombre;
	    System.out.print("Introduzca su nombre: ");
	    nombre = teclado.nextLine();
	    
	    String apellidos;
	    System.out.print("Introduzca sus apellidos: ");
	    apellidos = teclado.nextLine();
	    
	    int edad;
	    System.out.print("Introduzca su edad: ");
	    edad = teclado.nextInt();
	    
	    int salarioDeseado;
	    System.out.print("Introduzca su salario deseado: ");
	    salarioDeseado = teclado.nextInt();
	    
	    if (edad > 45 || salarioDeseado > 30000) {
	    	System.out.println("Lo sentimos pero no cumple nuestro perfil");
	    } else {
	    	int añosExperiencia;
		    System.out.print("Introduzca los años que tiene de experiencia: ");
		    añosExperiencia = teclado.nextInt();
		    
		    int proyectos;
		    System.out.print("Introduzca los proyectos en los que ha participado: ");
		    proyectos = teclado.nextInt();
		    
		    if (añosExperiencia > 2 || proyectos > 3) {
		    	System.out.println("Enhorabuena. Ha sido contratado");
		    	
		    	if (añosExperiencia > 5 && proyectos > 5) {
		    		System.out.println("Su salario anual va a ser de 30.000 euros.");
		    	}else {
		    		System.out.println("Su salario anual va a ser de 25.000 euros.");
		    	}
		    } else {
		    	System.out.println("Lo sentimos pero no cumple nuestro perfil");
		    }
	    }
		
	    
	}
}
