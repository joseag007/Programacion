package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static String indicaMesDias(int mes) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes < 1 || mes > 12) {
            return "Mes incorrecto";
        }
        return meses[mes - 1] + ", " + dias[mes - 1] + " días";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = sc.nextInt();

        System.out.println(indicaMesDias(mes));
    }
}
