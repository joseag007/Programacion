/*
* Descripción: premios supermercados
* Autor: José
* Fecha: 07/10/2025
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
	    System.out.print("Introduzca su nombre: ");
	    nombre = teclado.nextLine();
	    
	    String apellidos;
	    System.out.print("Introduzca sus apellidos: ");
	    apellidos = teclado.nextLine();
	    
	    int gasto1;
	    System.out.print("Introduzca el primer importe gastado: ");
	    gasto1 = teclado.nextInt();
	    
	    int gasto2;
	    System.out.print("Introduzca el segundo importe gastado: ");
	    gasto2 = teclado.nextInt();
	    
	    int gasto3;
	    System.out.print("Introduzca el tercer importe gastado: ");
	    gasto3 = teclado.nextInt();
		
	    int gasto4;
	    System.out.print("Introduzca el cuarto importe gastado: ");
	    gasto4 = teclado.nextInt();
	    
	    // calculo el promedio de las cuatro compras
	    double suma = gasto1 + gasto2 + gasto3 + gasto4;
	    double total = suma/4;
	    
	    if (suma<300) { // condición si no se alcanzan los 300 euros
	    	System.out.println("Nombre: " + nombre);
	    	System.out.println("Apellidos: " + apellidos);
	    	
	    	System.out.println("Importe Gastado1: " + gasto1);
	    	System.out.println("Importe Gastado2: " + gasto2);
	    	System.out.println("Importe Gastado3: " + gasto3);
	    	System.out.println("Importe Gastado4: " + gasto4);
	    	
	    	System.out.println("Importe Medio: " + total);
	    	
	    	System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");
	    } else { // condición si se alcanzan los 300 euros
	    	System.out.println("Nombre: " + nombre);
	    	System.out.println("Apellidos: " + apellidos);
	    	
	    	System.out.println("Importe Gastado1: " + gasto1);
	    	System.out.println("Importe Gastado2: " + gasto2);
	    	System.out.println("Importe Gastado3: " + gasto3);
	    	System.out.println("Importe Gastado4: " + gasto4);
	    	
	    	System.out.println("Importe Medio: " + total);
	    	
	    	System.out.println("Enhorabuena, sus compras han alcanzado los 300 euros este mes, por lo que dispone de un vale descuento de 50 euros.");
	    }
	
	    
	}
}
