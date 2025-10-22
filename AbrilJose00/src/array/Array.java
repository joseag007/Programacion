package array;

public class Array {

	public static void main(String[] args) {

		final int TOTAL_NUM = 20;
		
		int[] numeros; // Declaración del array
		numeros = new int[TOTAL_NUM]; // instanciamos array
		
		for (int posicion=0; posicion < TOTAL_NUM; posicion++) {
			numeros[posicion] = (int) (Math.random() * 50); // inicializamos a un valor aleatorio los elementos del array
		}
		
		numeros[3]=5;
		
		for (int posicion=0; posicion < TOTAL_NUM; posicion++) {
			System.out.println("El valor que hay en la posición "+
		posicion +" es: " + numeros[posicion]);
		}

		
		
	}
}
