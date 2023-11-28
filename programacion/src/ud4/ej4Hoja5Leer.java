package ud4;

import java.util.Scanner;

//que realice la media de dos números, utilizar una función
public class ej4Hoja5Leer {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce un valor");
		double a =entrada.nextDouble();
		System.out.println("introduce un valor");
		double b =entrada.nextDouble();
		double media=suma(a,b);
		System.out.println(media);
	}
	public static double suma(double a,double b) {
		return (a+b)/2;
		}

}
