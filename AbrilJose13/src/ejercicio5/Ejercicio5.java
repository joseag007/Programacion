package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		System.out.print("Introduzca un primer valor: ");
		num1 = teclado.nextInt(); // petición de primer valor
		
		int num2;
		System.out.print("Introduzca un segundo valor: ");
		num2 = teclado.nextInt(); // petición del segundo valor
		
		Boolean resultado1;
	    resultado1 =(num1 < num2);
	    
	    if (resultado1=true) {
	    	System.out.println(num1 + " es menor que "+num2);
	    }
	    
	      
	}

}
