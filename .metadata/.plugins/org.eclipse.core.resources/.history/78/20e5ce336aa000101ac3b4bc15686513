package clasificarNotas;

import java.util.Scanner;

public class ClasificarNotas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int notaCuantitativa;
		System.out.print("Introduzca su nota: ");
		notaCuantitativa = teclado.nextInt();
		
		
		String notaCualitativa = "No válida";
		
		if ( notaCuantitativa < 5 )
		    notaCualitativa= "INSUFICIENTE";
		if ( notaCuantitativa >=5 && notaCuantitativa < 6  )
		    notaCualitativa= "SUFICIENTE";
		if ( notaCuantitativa >=6 && notaCuantitativa < 7  )
		    notaCualitativa= "BIEN";
		if ( notaCuantitativa >= 7 && notaCuantitativa < 9 )
		    notaCualitativa= "NOTABLE";
		if ( notaCuantitativa >=9 && notaCuantitativa<= 10 )
		    notaCualitativa= "SOBRESALIENTE";
		
		System.out.println ("La calificación es: " + notaCualitativa);

	}

}
