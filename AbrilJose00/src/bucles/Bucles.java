package bucles;

import java.util.Scanner;

public class Bucles {
	
	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
	        
	        int numero;
	        
	        System.out.println("Dame un número (0 para terminar): ");
	        numero = teclado.nextInt();
	        int contador = 1;
	        int suma = numero;
	       
	            while (numero != 0 && contador < 8) {
	                System.out.println("Dame otro número: ");
	                numero = teclado.nextInt();
	                contador = contador + 1;
	                suma = suma + numero; //acumulador
	            }
	            System.out.println("La suma es: " + suma);
	        
	}
}
