/*
 * Descripción: suma pares suma impares (100-200)
 * Autor: José Abril
 * Fecha: 24/10/25
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {

		int sumaPares=0,sumaImpares=0;
		int numero=100;
		
		while (numero>=100 && numero <= 200) {
			if (numero%2 == 0) {
				sumaPares = sumaPares + numero;
				numero++;
			}else {
				sumaImpares = sumaImpares + numero;
				numero++;
			}
		}
		System.out.println("La suma de los números pares entre 100 y 200 es: " + sumaPares);
        System.out.println("La suma de los números impares entre 100 y 200 es: " + sumaImpares);
    

	}

}
