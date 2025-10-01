package cambioDeUnidad;

import java.util.Scanner;

public class CambioDeUnidad {

	public static void main(String[] args) {
		
		double metros;
		
        double decimetros, centimetros, milimetros;
        double pulgadas, pies, yardas;
        
		Scanner teclado = new Scanner(System.in);
		
        System.out.print("Introduzca la longitud en metros que desea transformar: ");
        metros = teclado.nextDouble();

        // SISTEMA INTERNACIONAL
        
        decimetros = metros * 10;
        centimetros = metros * 100;
        milimetros = metros * 1000;

        // SISTEMA ANGLOSAJÓN
        
        pulgadas = metros * 100 / 2.54;
        pies = pulgadas / 12;
        yardas = pies / 3;

        // RESULTADOS
        // RESULTADOS SISTEMA INTERNACIONAL
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println();
        System.out.println("SISTEMA INTERNACIONAL");
        System.out.println("---------------------");
        System.out.println("La medida " + metros + " en metros son:");
        System.out.println(decimetros + " decímetros");
        System.out.println(centimetros + " centímetros");
        System.out.println(milimetros + " milímetros");

     // RESULTADOS SISTEMA ANGLOSAJÓN
        System.out.println();
        System.out.println("SISTEMA ANGLOSAJÓN");
        System.out.println("------------------");
        System.out.println("La medida " + metros + " en metros son:");
        System.out.println(pulgadas + " pulgadas");
        System.out.println(pies + " pies");
        System.out.println(yardas + " yardas");

	}

}
