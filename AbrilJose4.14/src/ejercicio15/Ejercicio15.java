/*
 * Descripción: array numero entre 50 y 99
 * Autor: José Abril
 * Fecha: 21/11/25
 */
package ejercicio15;

public class Ejercicio15 {

	public static int calcularSuma(int[] numeros){
        int sumaTotal = 0;
        for(int numero : numeros) {
            sumaTotal += numero;
        }
        return sumaTotal;
    }

    public static double calcularPromedio(int[] numeros){
        return calcularSuma(numeros) / (double) numeros.length;
    }

    public static void main(String[] args) {
        int[] numeros = new int[50];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = 50 + i;
        }

        System.out.println("Suma: " + calcularSuma(numeros));
        System.out.println("Promedio: " + calcularPromedio(numeros));
    }
}