/*
 * Descripción: comprobacion fecha
 * Autor: José Abril
 * Fecha: 20/11/25
 */
package ejercicio10;

public class Ejercicio10 {

		public static void main(String[] args) {
	        java.util.Scanner teclado = new java.util.Scanner(System.in);

	        System.out.print("Día: ");
	        int dia = teclado.nextInt();

	        System.out.print("Mes: ");
	        int mes = teclado.nextInt();

	        System.out.print("Año: ");
	        int año = teclado.nextInt();

	        if (fechaCorrecta(dia, mes, año))
	            System.out.println("Fecha correcta");
	        else
	            System.out.println("Fecha incorrecta");
	    }

	    public static boolean fechaCorrecta(int dia, int mes, int año) {
	        if (mes < 1 || mes > 12) return false;
	        if (dia < 1) return false;

	        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};

	        return dia <= diasMes[mes - 1];
	    }
	}