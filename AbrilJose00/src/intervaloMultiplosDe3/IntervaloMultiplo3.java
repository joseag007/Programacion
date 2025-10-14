package intervaloMultiplosDe3;

import java.util.Scanner;

public class IntervaloMultiplo3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el primer valor: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Introduzca el segundo valor: ");
        int num2 = teclado.nextInt();

        for (int contador = num1; contador <= num2; contador++) {
            if (contador % 3 == 0) {
                System.out.println(contador);  // Mostrar el número si es múltiplo de 3
            }
        }
        
        for (int contador = num1; contador >= num2; contador--) {
            if (contador % 3 == 0) {
                System.out.println(contador);  // Mostrar el número si es múltiplo de 3
            }
        }
        
        
	}
}
