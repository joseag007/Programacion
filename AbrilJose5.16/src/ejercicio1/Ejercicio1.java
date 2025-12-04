package ejercicio1;

import java.time.LocalDate;
import libtarea3.CuentaBancaria;

public class Ejercicio1 {

	public static void main(String[] args) {
		
// 1- Declarar tres variables referencia a objetos instancia de la clase CuentaBancaria
		
		CuentaBancaria cuentaPrivada = null;
        CuentaBancaria cuentaConjunta = null;
        CuentaBancaria cuentaFamiliar = null;
        
// 2- Instanciar tres objetos de la clase
        
        LocalDate fecha = null;
        double saldoInicial = 0;
        double limiteDescubierto = 0;
        
        	// Intentar crear una cuenta con fecha no válida (01/09/2027)
        
            try {
                fecha = LocalDate.parse("2027-09-01");
                
                // Crear la cuenta
                CuentaBancaria cuenta1 = new CuentaBancaria(saldoInicial, fecha, limiteDescubierto);
                System.out.println("Cuenta creada correctamente");

            } catch (IllegalArgumentException ex1) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex1.getMessage());
            } catch (Exception ex2) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex2.getMessage());
            }

        // Intentar crear otra cuenta con un saldo no válido (-200.00 euros)
            
            try {
                fecha = LocalDate.parse("2025-09-01");
                saldoInicial = -200.00;
                // Crear la cuenta
                CuentaBancaria cuenta2 = new CuentaBancaria(saldoInicial, fecha, limiteDescubierto);
                System.out.println("Cuenta creada correctamente");

            } catch (IllegalArgumentException ex3) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex3.getMessage());
            }    catch (Exception ex4) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex4.getMessage());
            }
            
        // Crear una cuenta válida con un saldo inicial de 1000.00 euros, con fecha de creación a 1 de julio de 2021 y -200.00 euros de límite de descubierto.    
            
            try {
                fecha = LocalDate.parse("2021-07-01");
                saldoInicial = 1000.00;
                limiteDescubierto = -200.00; 
                
                
                // Crear la cuenta
                cuentaPrivada = new CuentaBancaria(saldoInicial, fecha, limiteDescubierto);
                System.out.println("Cuenta creada correctamente");
                System.out.printf("Su Cuenta tiene un saldo  de %.2f euros, con fecha de creación el %s y un limite de descubierto de %.2f euros.%n",
                        cuentaPrivada.getSaldo(), cuentaPrivada.getFechaCreacion(), cuentaPrivada.getLimiteDescubierto());

            } catch (IllegalArgumentException ex5) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex5.getMessage());
            }catch (Exception ex6) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex6.getMessage());
            }
            
        // Crear una cuenta válida con un saldo inicial de 200.00 euros y con fecha de creación a 1 de julio de 2021    
            
            try {
                fecha = LocalDate.parse("2021-07-01");
                saldoInicial = 200.00;
                
                
                
                // Crear la cuenta
                cuentaConjunta = new CuentaBancaria(saldoInicial, fecha);
                System.out.println("Cuenta creada correctamente");
                System.out.printf("Su Cuenta tiene un saldo  de %.2f euros, con fecha de creación el %s y un límite de descubierto de %.2f euros.%n",
                        cuentaConjunta.getSaldo(), cuentaConjunta.getFechaCreacion(), cuentaConjunta.getLimiteDescubierto());

            } catch (IllegalArgumentException ex7) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex7.getMessage());
            }catch (Exception ex8) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex8.getMessage());
            }
            
            // Crear una cuenta válida con los valores por omisión
            
            
                cuentaFamiliar = new CuentaBancaria(); // Constructor sin parámetros

                System.out.println("Cuenta creada correctamente");
                System.out.printf("Su Cuenta tiene un saldo inicial de %.2f euros, con fecha de creación el %s y un límite de descubierto de %.2f euros.%n",
                        cuentaFamiliar.getSaldo(), cuentaFamiliar.getFechaCreacion(), cuentaFamiliar.getLimiteDescubierto());


            

/*  3-  Obtener la siguiente información de la cuenta privada y mostrarla por pantalla
* Identificador de cuenta.
* Fecha de creación de la cuenta.
* Límite de descubierto de la cuenta. Con dos decimales.
* Si la cuenta está embargada o no.
* Si la cuenta está en descubierto o no.
* El número de días que lleva la cuenta abierta.
*/
            
            
                
                String estadoEmbargo;
                String estadoDescubierta;
                
                if ( cuentaPrivada.isEmbargada() == false) {
                	estadoEmbargo = "no";
                }else {
                	estadoEmbargo = "sí";
                }
                
                if ( cuentaPrivada.isDescubierta() == false) {
                	estadoDescubierta = "no";
                }else {
                	estadoDescubierta = "sí";
                }
                
                System.out.println("Cuenta creada correctamente");
                System.out.printf("El identificador de su cuenta es %d, la fecha de creación de su cuenta es el %s, el límite de descubierto de su cuenta bancaria es de %.2f euros, su cuenta %s está embargada, su cuenta %s está en descubierto y su cuenta tiene %d días de antigüedad.%n",
                cuentaPrivada.getId(), cuentaPrivada.getFechaCreacion(), cuentaPrivada.getLimiteDescubierto(), estadoEmbargo, estadoDescubierta, cuentaPrivada.getDiasCuenta());

            
/* 4- Llevar a cabo las siguientes operaciones sobre las cuentas:
 * Ingresar 100.00 euros en la cuenta familiar.
 * Extraer 100.00 euros de la cuenta conjunta.
 * Transferir 1100.00 euros de la cuenta privada a la familiar.
 */
            
            // Ingresar 100.00 euros en la cuenta familiar.
            
            try {
                cuentaFamiliar.ingresar(100.00);
                System.out.printf("Se han ingresado %.2f euros en la cuenta familiar. Saldo actual: %.2f euros.%n",
                                  100.00, cuentaFamiliar.getSaldo());
            } catch (IllegalArgumentException ex9) {
            	System.out.println("No se ha podido ingresar el dinero debido a un error: " + ex9.getMessage());
            } catch (IllegalStateException ex10) {
            	System.out.println("No se ha podido ingresar el dinero debido a un error: " + ex10.getMessage());
            } catch (Exception ex13) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex13.getMessage());
            }
            
            // Extraer 100.00 euros de la cuenta conjunta.
            
            try {
                cuentaConjunta.extraer(100.00);
                System.out.printf("Se han extraido %.2f euros en la cuenta conjunta. Saldo actual: %.2f euros.%n",
                                  100.00, cuentaConjunta.getSaldo());
            } catch (IllegalArgumentException ex11) {
            	System.out.println("No se ha podido extraer el dinero debido a un error: " + ex11.getMessage());
            } catch (IllegalStateException ex12) {
            	System.out.println("No se ha podido extraer el dinero debido a un error: " + ex12.getMessage());
            } catch (Exception ex13) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex13.getMessage());
            }
            
            // Transferir 1100.00 euros de la cuenta privada a la familiar.
            
            try {
            	
                cuentaPrivada.transferir(1100.00, cuentaFamiliar);
                System.out.printf("Se han transferido %.2f euros de la cuenta privada a la cuenta familiar. Saldo actual de la cuenta privada: %.2f euros. Saldo actual de la cuenta familiar: %.2f euros.%n",
                                  1100.00, cuentaPrivada.getSaldo(), cuentaFamiliar.getSaldo());
            } catch (IllegalArgumentException ex14) {
            	System.out.println("No se ha podido transferir el dinero debido a un error: " + ex14.getMessage());
            } catch (IllegalStateException ex15) {
            	System.out.println("No se ha podido transferir el dinero debido a un error: " + ex15.getMessage());
            } catch (Exception ex16) {
            	System.out.println("No se ha podido crear la cuenta debido a un error: " + ex16.getMessage());
            }
            
// Muestra la información sobre el estado final de cada una las cuentas.
            
            // Estado final de la cuenta privada.
            System.out.printf("Cuenta privada: %s %n",cuentaPrivada);
            
            // Estado final de la cuenta conjunta.
            System.out.printf("Cuenta conjunta: %s %n", cuentaConjunta);
            
            // Estado final de la cuenta familiar.
            System.out.printf("Cuenta familiar: %s %n", cuentaFamiliar);
            
    }
}
