package unidad6ObjetosBasico;

import java.util.Scanner;

public class usoRaices {

	public static void main(String[] args) {
		/*Scanner in= new Scanner (System.in);
		System.out.println("introduce el numero");
		double a=in.nextDouble();
		System.out.println("introduce el numero");
		double b=in.nextDouble();
		System.out.println("introduce el numero");
		double c=in.nextDouble();
		*/
		Raices ecuacion1=new Raices(5,5,5);
		System.out.println("la primera ecuacion: ");
		ecuacion1.Calcular();
		Raices ecuacion2=new Raices(1,-5,6);
		System.out.println("la segunda ecuacion: ");
		ecuacion2.Calcular();
		Raices ecuacion3=new Raices(1,-4,4);
		System.out.println("la tercera ecuacion: ");
		ecuacion3.Calcular();
	}

}
