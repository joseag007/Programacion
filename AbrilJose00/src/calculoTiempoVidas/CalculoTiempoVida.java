package calculoTiempoVidas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculoTiempoVida {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu fecha de nacimiento: aaaa-mm-dd");
		String fechaNacimiento = teclado.next();
		
		try {
			LocalDate fNacimiento = LocalDate.parse(fechaNacimiento);
			
			LocalDate hoy = LocalDate.now();
			
			Period tiempoTranscurrido = Period.between(fNacimiento, hoy);
		} catch (Exception ex1){
			System.out.println( ex1.getMessage());
		}
		
	}

}