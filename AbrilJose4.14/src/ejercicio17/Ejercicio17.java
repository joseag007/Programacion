/*
 * Descripción: diferenciar entre numeros primos y no primos
 * Autor: José Abril
 * Fecha: 21/11/25
 */
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
	
	public static boolean esPrimo(int numero){
        if(numero <= 1) return false;

        for(int divisor = 2; divisor <= Math.sqrt(numero); divisor++){
            if(numero % divisor == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            num = teclado.nextInt();

            if(num != 0) {
                boolean primo = esPrimo(num);
                System.out.println(num + (primo ? " es primo" : " NO es primo"));
            }

        } while(num != 0);

    }
}