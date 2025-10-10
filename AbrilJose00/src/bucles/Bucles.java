package bucles;

import java.util.Scanner;

public class Bucles {
	
	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
	        
	        int numero, suma =0, contador = 0;
	       
	           /* while (numero != 0 && contador < 8) {
	                System.out.println("Dame otro número: ");
	                numero = teclado.nextInt();
	                contador = contador + 1;
	                suma = suma + numero; //acumulador
	            }
	            System.out.println("La suma es: " + suma);*/
	            
	            do {
	            	System.out.println("Dame otro número: ");
	                numero = teclado.nextInt();
	                contador = contador + 1;
	                suma = suma + numero;
	                
	            	} while (numero != 0 && contador < 8);
	            	
	            
	            System.out.println("La suma es: " + suma + " y la cantidad de números es: " + --contador);
	}
}
