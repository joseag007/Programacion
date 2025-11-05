package clases;

public class MetodosVarios {
	public static void main(String[] args) {
		int numero;
		boolean par;
		
		numero=3;
		par= esPar(numero);
		System.out.println(par);
	}


	public static boolean esPar (int numero) {
		boolean par;
		if (numero%2==0) {
			par=true;
		}else {
			par=false;
		}
		return par;
	}

	}


