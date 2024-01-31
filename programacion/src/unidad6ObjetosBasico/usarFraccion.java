package unidad6ObjetosBasico;

import java.util.Scanner;

public class usarFraccion {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("cuantas fracciones quiere hacer");
		int num=in.nextInt();
		Fraccion [] frac = new Fraccion [num];
		for (int i=0;i>num;i++) {
			System.out.println("introduce numerado");
			int nume=in.nextInt();
			System.out.println("introduce el denominador");
			int dem=in.nextInt();
			Fraccion f1= new Fraccion(num,dem);
		}Fraccion f3= new Fraccion(0,1);
		for(int i=0;i <num;i++) {
			f3=f3.suma(frac[i]);
		}
		f3.mostrar();

	}

}
