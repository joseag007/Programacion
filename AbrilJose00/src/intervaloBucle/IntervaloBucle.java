package intervaloBucle;

import java.util.Scanner;

public class IntervaloBucle {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el inicio: ");
        int inicio = teclado.nextInt();

        System.out.print("Introduzca el final: ");
        int fin = teclado.nextInt();

        int contador = inicio;

        // Imprimir ascendente
        do {
            System.out.print(contador + " ");
            contador++;
        } while (contador <= inicio );

        System.out.println();

        // Imprimir descendente
        contador = fin;
        do {
            System.out.print(contador + " ");
            contador--;
        } while (contador >= inicio);

        teclado.close();
    }
}