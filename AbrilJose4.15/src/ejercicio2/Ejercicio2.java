package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	 public static double productosDescuento(double precio, int cantidad, int descuento, String nombreProducto) {
	        double precioTotal = precio * cantidad;
	        double precioFinal = precioTotal * (1 - descuento / 100.0);

	        System.out.println("Usted ha adquirido " + cantidad + " productos " + nombreProducto + ", a un precio de " + precio + " euros la unidad.");
	        System.out.println("El precio a pagar es " + precioTotal + " euros, pero al aplicarle el descuento del " + descuento + "% el precio final a pagar es: " + precioFinal + " euros.");
	        return precioFinal;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce el nombre del producto: ");
	        String nombreProducto = sc.nextLine();
	        System.out.print("Introduce el precio unitario: ");
	        double precio = sc.nextDouble();
	        System.out.print("Introduce la cantidad: ");
	        int cantidad = sc.nextInt();
	        System.out.print("Introduce el descuento (%): ");
	        int descuento = sc.nextInt();

	        productosDescuento(precio, cantidad, descuento, nombreProducto);
	    }
	}