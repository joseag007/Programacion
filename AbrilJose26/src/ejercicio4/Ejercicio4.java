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
        
        double suma = gasto1 + gasto2 + gasto3 + gasto4;
        double total = suma/4;
        
        if (total<300) {
        	System.out.println("Nombre: " + nombre);
        	
        }

	}

}
