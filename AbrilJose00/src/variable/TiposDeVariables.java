/*
* Descripción: ejemplos de variables
* Autor: José
* Fecha: 23/09/2025
*/
package variable;

public class TiposDeVariables {

	public static void main(String[] args) {
		byte edadAlumno; // Declaración
		edadAlumno = 0; // Inicialización
		
		byte edadProfe =0; //Declaración e inicialización
		
		System.out.println("Valor de la variable: "+ edadAlumno);
		
		double pesoAlumno = 92.5, alturaAlumno = 1.76;
		
		System.out.println("Peso: "+ pesoAlumno + " Altura: " + alturaAlumno);
		
		pesoAlumno = 94;
		System.out.println("Peso: "+ pesoAlumno + " Altura: " + alturaAlumno);
		
		char letraDni = 'B';
		
		String nombreAlumno = "Alberto";
		
		boolean mayorEdad = false;
		
	}

}
