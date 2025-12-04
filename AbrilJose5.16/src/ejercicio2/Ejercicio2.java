package ejercicio2;

import libtarea3.Dado;

public class Ejercicio2 {

	public static void main(String[] args) {
		
// 1- Llevar a cabo una consulta inicial
		
		// número total de dados creados
		System.out.printf("Dados creados: %d\n", Dado.getNumeroDadosCreados());
        
		// número total de lanzamientos
		System.out.printf("Número de lanzamientos: %d\n", Dado.getNumeroLanzamientosGlobal());
        
		// cantidad de veces que han salido las caras con valores 1, 2, 3 y 4 
		System.out.printf("Veces totales que ha salido la cara 1: %d\n", Dado.getNumeroVecesCaraGlobal(1));
        System.out.printf("Veces totales que ha salido la cara 2: %d\n", Dado.getNumeroVecesCaraGlobal(2));
        System.out.printf("Veces totales que ha salido la cara 3: %d\n", Dado.getNumeroVecesCaraGlobal(3));
        System.out.printf("Veces totales que ha salido la cara 4: %d\n", Dado.getNumeroVecesCaraGlobal(4));
		
// 2- Creación y lanzamiento de dados:
        
        // intentos de creación: debes intentar crear 10 objetos de tipo Dado que tengan aleatoriamente entre 0 y 8 caras
        
        Dado[] dados = new Dado[10]; // array para guardar los dados creados

        int contador = 1;
        int numlanzamientos = 1;

        do {
        	
            int carasAleatorias = (int)(1 + (Math.random() * 8)); // (1 + (Math.random() * 9) -- sirve para que los valores esten entre 1 y 8
            System.out.printf(" Intento %d: creando Dado con %d caras...\n",
                    contador + 1, carasAleatorias);

            try {

                dados[contador] = new Dado(carasAleatorias); // genera el dado

                System.out.printf("Se ha generado un dado con %s caras.\n",
                        dados[contador].getNumeroCaras()); // genera el número de caras

                while (numlanzamientos <= dados[contador].getNumeroCaras()) {

                    String cara = dados[contador].lanzar(); // lanza el dado
                    
                    numlanzamientos++;
                }

                System.out.println(dados[contador].getSerieHistoricaLanzamientos()); // muestra el registro de lanzamientos
                System.out.println(dados[contador].getSumaPuntuacionHistorica()); // muestra la suma de los lanzamientos

                numlanzamientos = 1;
                contador++;
                

            } catch (IllegalArgumentException ex1) {

                System.out.println("No se ha podido crear el dado." + ex1.getMessage());
                
            }
            

        } while (contador < 10);
     
         
	}
}