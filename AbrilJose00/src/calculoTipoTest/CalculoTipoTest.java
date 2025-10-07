package calculoTipoTest;

import java.util.Scanner;

public class CalculoTipoTest {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int aciertos, fallos;
        
        System.out.print("Introduzca el número de aciertos que ha obtenido: ");
        aciertos = teclado.nextInt();
        
        System.out.print("Introduzca el número de fallos que ha obtenido: ");
        fallos = teclado.nextInt();
        
        int preguntas = fallos + aciertos;
        
        if (preguntas > 20) {
            System.out.println("Datos erróneos");
        } else {
        
        double acierto = aciertos * 0.5;
        double fallo = fallos * 0.25;
        double total = acierto - fallo;
        
        // Si el total es menor que 0, lo redondeamos a 0
        if (total < 0) {
            total = 0;
        }
        
        System.out.println("La nota que ha obtenido es: " + total);
        
        String notaCualitativa = "ERROR";
        
        if (total >= 0 && total <= 10)
            if (total < 5)
                notaCualitativa = "INSUFICIENTE";
            else if (total < 6)
                notaCualitativa = "SUFICIENTE";
            else if (total < 7)
                notaCualitativa = "BIEN";
            else if (total < 9)
                notaCualitativa = "NOTABLE";
            else
                notaCualitativa = "SOBRESALIENTE";
        
        System.out.println("La calificación cualitativa equivalente es: " + notaCualitativa);
        }
        
    }
}