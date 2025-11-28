package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static String accesoBecaUsa(int edad, double nota, double renta, boolean nivelIdioma) {
        if (!nivelIdioma || edad > 30) {
            return "No apto";
        } else if (nota > 9) {
            return "Apto";
        } else if (nota < 5) {
            return "No apto";
        } else { // notas 6,7,8
            if (renta < 20000) {
                return "Apto";
            } else {
                return "No apto";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduce tu nota académica: ");
        double nota = sc.nextDouble();
        System.out.print("Introduce tu renta: ");
        double renta = sc.nextDouble();
        System.out.print("¿Cumples el nivel de idioma requerido? (true/false): ");
        boolean idioma = sc.nextBoolean();

        System.out.println(accesoBecaUsa(edad, nota, renta, idioma));
    }
}