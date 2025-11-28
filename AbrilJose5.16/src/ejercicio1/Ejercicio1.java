package ejercicio1;

import java.time.LocalDate;
import libtarea3.CuentaBancaria;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// 1- Declarar tres variables referencia a objetos instancia de la clase CuentaBancaria
		
		CuentaBancaria cuentaPrivada;
        CuentaBancaria cuentaConjunta;
        CuentaBancaria cuentaFamiliar;
        
        // 2- Instanciar tres objetos de la clase
        
        LocalDate fecha = null;
        boolean error;
        double saldoInicial = 0;
        double limiteDescubierto = 0;
        
        	// Intentar crear una cuenta con fecha no válida (01/09/2027)
        
            try {
                fecha = LocalDate.parse("2027-09-01");
                error = false;
                // Crear la cuenta
                CuentaBancaria cuenta1 = new CuentaBancaria(saldoInicial, fecha, limiteDescubierto);
                System.out.println("Cuenta creada correctamente");

            } catch (IllegalArgumentException ex1) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex1.getMessage());
            }

        // Intentar crear otra cuenta con un saldo no válido (-200.00 euros)
            
            try {
                fecha = LocalDate.parse("2025-09-01");
                saldoInicial = -200.00;
                error = false;
                // Crear la cuenta
                CuentaBancaria cuenta2 = new CuentaBancaria(saldoInicial, fecha, limiteDescubierto);
                System.out.println("Cuenta creada correctamente");

            } catch (IllegalArgumentException ex1) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex1.getMessage());
            }    
            
        // Crear una cuenta válida con un saldo inicial de 1000.00 euros, con fecha de creación a 1 de julio de 2021 y -200.00 euros de límite de descubierto.    
            
            try {
                fecha = LocalDate.parse("2021-07-01");
                saldoInicial = 1000.00;
                limiteDescubierto = -200.00; 
                
                error = false;
                // Crear la cuenta
                cuentaPrivada = new CuentaBancaria(saldoInicial, fecha, limiteDescubierto);
                System.out.println("Cuenta creada correctamente");
                System.out.println("Su Cuenta tiene un saldo inicial de " + saldoInicial + " euros, con fecha de creación el " + fecha + " y un limite de descubierto de "
                + limiteDescubierto + " euros.");

            } catch (IllegalArgumentException ex1) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex1.getMessage());
            }
            
        // Crear una cuenta válida con un saldo inicial de 200.00 euros y con fecha de creación a 1 de julio de 2021    
            
            
    }
}
