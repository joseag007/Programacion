package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinistas,
            int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {
if (!proyectosTerminados) {
System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
return false;
}

double gastoTotal = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);

if (gastoTotal > 20000) {
System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " + gastoTotal + " y excede el límite mensual de 20.000 euros");
return false;
}

if (presupuestoEmpresa > 100000) {
System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de " + presupuestoEmpresa + " excede el límite establecido de 100.000 euros");
return false;
}

System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
return true;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Introduce salario del jefe: ");
double salarioJefe = sc.nextDouble();
System.out.print("Introduce salario del encargado: ");
double salarioEncargado = sc.nextDouble();
System.out.print("Introduce salario de los oficinistas: ");
double salarioOficinistas = sc.nextDouble();
System.out.print("Introduce número de oficinistas: ");
int numOficinistas = sc.nextInt();
System.out.print("¿Se han terminado los proyectos? (true/false): ");
boolean proyectos = sc.nextBoolean();
System.out.print("Introduce presupuesto de la empresa: ");
double presupuesto = sc.nextDouble();

auditoriaEmpresa(salarioJefe, salarioEncargado, salarioOficinistas, numOficinistas, proyectos, presupuesto);
}
}