/*
 * Descripción: suma y producto 10 primeros números naturales
 * Autor: José Abril
 * Fecha: 23/10/25
 */
package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {

		int suma = 0;         // Guarda la suma acumulada
        long producto = 1;        // Guarda el producto acumulado

        // Recorremos los 10 primeros números naturales (del 1 al 10)
        for (int numero = 1; numero <= 10; numero++) {
            suma += numero;      // Sumar
            producto *= numero;      // Multiplicar
        }

        // Mostrar resultados
        System.out.println("La suma de los 10 primeros números naturales es: " + suma);
        System.out.println("El producto de los 10 primeros números naturales es: " + producto);

	}
}
