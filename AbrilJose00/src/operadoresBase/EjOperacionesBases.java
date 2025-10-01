/*
* Descripción: ejemplos de operaciones bases
* Autor: José
* Fecha: 25/09/2025
*/
package operadoresBase;

public class EjOperacionesBases {

	public static void main(String[] args) {

		int dato1 = 5, dato3 = 2;
		double dato2 = 3;
		
		
		double suma = dato1 + dato2;
		System.out.println("La suma es: " + suma);

		double resta = dato1 - dato2;
		System.out.println("la resta es: " + resta);
		
		double multiplicacion = dato1 * dato2;
		System.out.println("La multiplicación es: " + multiplicacion);
		
		double division = dato1 / dato2;
		System.out.println("La división es: " + division);
		
		int resto;
		resto = dato1 % dato3;
		System.out.println("El resto es: " + resto);
	}

}
