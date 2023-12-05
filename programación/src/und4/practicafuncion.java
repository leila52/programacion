package und4;

import java.util.Scanner;

public class practicafuncion {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce un numero");
		int num=entrada.nextInt();
		int result=cuadrado(num);
		System.out.println(result);

	}
	public static int cuadrado(int a) {
		return a*a;
	}
}
