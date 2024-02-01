package unidad6ObjetosBasico;

import java.util.Scanner;

public class usarFraccion {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("introduce numerado");
		int numerador=in.nextInt();
		System.out.println("introduce el denominador");
		int denominador=in.nextInt();
		Fraccion f1 = new Fraccion(numerador,denominador);
		System.out.println("introduce numerado");
		int numerado=in.nextInt();
		System.out.println("introduce el denominador");
		int denominado=in.nextInt();
		Fraccion f2 = new Fraccion(numerado,denominado);
		System.out.println("la suma es ");
		f1.suma(f2).mostrar();
		
		System.out.println("la multiplicacion ");
		f1.multi(f2).mostrar();
		
		System.out.println("la division es ");
		f1.divi(f2).mostrar();
		
		System.out.println("la resta es : ");
		f1.resta(f2).mostrar();
		//si son iguales o no 
		
		if(f1.esIgual(f2)== true) {
			System.out.println("son iguales");
		}else {
			System.out.println("no son iguales");
		}
		Fraccion f = new Fraccion(8,12);
		System.out.println("simplificamos:");
		f1.simplificar();
		
		System.out.println("cuantas fracciones quiere hacer");
		int num=in.nextInt();
		Fraccion [] frac = new Fraccion [num];
		for (int i=0;i<num;i++) {
			System.out.println("introduce numerado");
			int nume=in.nextInt();
			System.out.println("introduce el denominador");
			int dem=in.nextInt();
			Fraccion f8= new Fraccion(nume,dem);
			frac[i]= f8;
		}
		Fraccion f3= new Fraccion(0,1);
		for(int i=0;i <num;i++) {
			f3=f3.suma(frac[i]);
		}
		f3.mostrar();

	}

}
