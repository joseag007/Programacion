package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static String posicionJugador(int dorsal, String nombre) {
        if (dorsal < 1 || dorsal > 16) {
            return "Número introducido incorrecto";
        }
        String posicion;
        if (dorsal == 1) posicion = "portero";
        else if (dorsal >= 2 && dorsal <= 5) posicion = "defensa";
        else if (dorsal >= 6 && dorsal <= 8) posicion = "centrocampista";
        else if (dorsal >= 9 && dorsal <= 11) posicion = "delantero";
        else posicion = "suplente";

        return nombre + ", con el dorsal " + dorsal + " juega el próximo partido como " + posicion + ".";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del jugador: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el dorsal (1-16): ");
        int dorsal = sc.nextInt();

        System.out.println(posicionJugador(dorsal, nombre));
    }
}