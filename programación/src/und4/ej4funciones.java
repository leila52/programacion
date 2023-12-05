package und4;

import java.util.Scanner;

public class ej4funciones {

	public static void main(String[] args) {
		//habilitamos lectura
		Scanner entrada= new Scanner(System.in);
		System.out.println("introduce un numero");
		int a =entrada.nextInt();
		if(EsPar(a)==true)
			System.out.println("Es par");
		else
			System.err.println("Es inpar");

	}
	public static int boolean EsPar(int a) {
		if(a %2==0)
			return true;
		else
			return false;
	}
}
