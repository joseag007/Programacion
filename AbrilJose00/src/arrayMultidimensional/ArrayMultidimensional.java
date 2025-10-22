package arrayMultidimensional;

public class ArrayMultidimensional {

    public static void main(String[] args) {

        int [][] temperatura = new int[30][12]; // 30 días, 12 meses

        // Llenar el arreglo con temperaturas aleatorias (0 a 39)
        for (int dia = 0; dia < 30; dia++) {
            for (int mes = 0; mes < 12; mes++) {
                temperatura[dia][mes] = (int)(Math.random() * 40);
            }
        }

        // Mostrar todas las temperaturas
        System.out.println("Temperaturas registradas (día x mes):");
        for (int dia = 0; dia < 30; dia++) {
            for (int mes = 0; mes < 12; mes++) {
                System.out.print(temperatura[dia][mes] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTemperatura más alta de cada mes:");
        // Calcular la temperatura más alta de cada mes
        for (int mes = 0; mes < 12; mes++) {
            int maxTemp = temperatura[0][mes];
            for (int dia = 1; dia < 30; dia++) {
                if (temperatura[dia][mes] > maxTemp) {
                    maxTemp = temperatura[dia][mes];
                }
            }
            System.out.println("Mes " + (mes + 1) + ": " + maxTemp + "°C");
        }
    }
}