/*
* Descripción: petición informacion equipo
* Autor: José
* Fecha: 25/09/2025
*/
package ejercicio4;

public class Ejercicio4 {
	
	enum Talla {pequeña, mediana, grande, extragrande}
	
	public static void main(String[] args) {
	
		Talla tallaS = Talla.pequeña; //Declaración e inicialización
        Talla tallaM = Talla.mediana; //Declaración e inicialización
        Talla tallaL = Talla.grande; //Declaración e inicialización
        Talla tallaXL = Talla.extragrande; //Declaración e inicialización
        
        System.out.println("Esta es una talla " + tallaS); // mostrar talla s
        System.out.println("Esta es una talla " + tallaM); // mostrar talla m
        System.out.println("Esta es una talla " + tallaL); // mostrar talla l
        System.out.println("Esta es una talla " + tallaXL); // mostrar talla xl
        
	}
}
