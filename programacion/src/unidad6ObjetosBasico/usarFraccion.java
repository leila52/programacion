package unidad6ObjetosBasico;

import java.util.Scanner;

public class usarFraccion {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char opcion=0;
		do {
			menu();
			//leemos opcion
			opcion=in.nextLine().charAt(0);
			int numerador;
			int denominador;
			int numerado;
			int denominado;
			switch(opcion) {
			
			case 'S':
			case 's':
				
				System.out.println("introduce numerado");
				numerador=in.nextInt();
				System.out.println("introduce el denominador");
				denominador=in.nextInt();
				Fraccion f1 = new Fraccion(numerador,denominador);
				System.out.println("introduce numerado");
				numerado=in.nextInt();
				System.out.println("introduce el denominador");
				denominado=in.nextInt();
				in.nextLine();
				Fraccion f2 = new Fraccion(numerado,denominado);
				System.out.println("la suma es ");
				f1.suma(f2).mostrar();
			break;
			case 'R':
			case 'r':
				
				System.out.println("introduce numerado");
				numerador=in.nextInt();
				System.out.println("introduce el denominador");
				denominador=in.nextInt();
				Fraccion f3 = new Fraccion(numerador,denominador);
				System.out.println("introduce numerado");
				numerado=in.nextInt();
				System.out.println("introduce el denominador");
				denominado=in.nextInt();
				in.nextLine();
				Fraccion f4 = new Fraccion(numerado,denominado);
				System.out.println("la resta es :");
				f3.resta(f4).mostrar();
			break;
			case 'M':
			case 'm':
				
				System.out.println("introduce numerado");
				numerador=in.nextInt();
				System.out.println("introduce el denominador");
				denominador=in.nextInt();
				Fraccion f5 = new Fraccion(numerador,denominador);
				System.out.println("introduce numerado");
				numerado=in.nextInt();
				System.out.println("introduce el denominador");
				denominado=in.nextInt();
				in.nextLine();
				Fraccion f6 = new Fraccion(numerado,denominado);
				System.out.println("la multiplicacion ");
				f5.multi(f6).mostrar();
			break;
			case 'D':
			case 'd':
				
				System.out.println("introduce numerado");
				numerador=in.nextInt();
				System.out.println("introduce el denominador");
				denominador=in.nextInt();
				Fraccion f7 = new Fraccion(numerador,denominador);
				System.out.println("introduce numerado");
				numerado=in.nextInt();
				System.out.println("introduce el denominador");
				denominado=in.nextInt();
				in.nextLine();
				Fraccion f8 = new Fraccion(numerado,denominado);
				System.out.println("la division es ");
				f7.divi(f8).mostrar();
			break;
			case 'T':
			case 't':
				
				System.out.println("introduce numerado");
				numerador=in.nextInt();
				System.out.println("introduce el denominador");
				denominador=in.nextInt();
				Fraccion f10 = new Fraccion(numerador,denominador);
				System.out.println("introduce numerado");
				numerado=in.nextInt();
				System.out.println("introduce el denominador");
				denominado=in.nextInt();
				in.nextLine();
				Fraccion f11 = new Fraccion(numerado,denominado);
				if(f10.esIgual(f11)== true) {
					System.out.println("son iguales");
				}else {
					System.out.println("no son iguales");
				}
			break;
			case 'N':
			case 'n':
				
				System.out.println("cuantas fracciones quiere hacer");
				int num=in.nextInt();
				Fraccion [] frac = new Fraccion [num];
				for (int i=0;i<num;i++) {
					System.out.println("introduce numerado");
					int nume=in.nextInt();
					System.out.println("introduce el denominador");
					int dem=in.nextInt();
					in.nextLine();
					Fraccion f56= new Fraccion(nume,dem);
					frac[i]= f56;
				}
				Fraccion f78= new Fraccion(0,1);
				for(int i=0;i <num;i++) {
					f78=f78.suma(frac[i]);
				}
				f78.mostrar();
			break;
			case 'G':
			case 'g':
				
				System.out.println("introduce numerado");
				numerador=in.nextInt();
				System.out.println("introduce el denominador");
				denominador=in.nextInt();
				in.nextLine();
				Fraccion f9 = new Fraccion(numerador,denominador);
				System.out.println("simplificamos:");
				f9.simplificar();
				break;
			case 'A':
			case 'a':
				
				System.out.println("vuelve pronto");
				break;
				default://caso por defecto
					System.out.println("opccion no valida");
			}
		
			
		}while((opcion!='a')&&(opcion!='A'));
	}
	public static void menu() {
		//mostramos el menú
		System.out.println("Opciones de menú de Fracciones:");
		System.out.println("S sumar");
		System.out.println("R restar");
		System.out.println("M multiplicar");
		System.out.println("D dividir");
		System.out.println("T saber si son iguales");
		System.out.println("N meterlo en un array y hacer sumas");
		System.out.println("G simplificar la fraccion");
		System.out.println("A Salir");
	}

}
