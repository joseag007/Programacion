package intervaloBucle;

import java.util.Scanner;

public class IntervaloBucle {
	
	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
	        
	        int inicio = 0;
	        int fin = 0;
	        
	        System.out.print("Introduzca el inicio: ");
	        inicio = teclado.nextInt();
	        System.out.print("Introduzca el final: ");
	        fin = teclado.nextInt();
	        
	        int contador = inicio;
	         
	        while (contador <= fin) {
	        	System.out.print(" " + contador);
	                contador = contador + 1; 
	            }
	        
	        while (contador >= fin) {
	        	System.out.print(" " + contador);
	                contador = contador - 1; 
	            }
	        
	}
}
