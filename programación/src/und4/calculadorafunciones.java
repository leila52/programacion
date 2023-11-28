package und4;

import java.util.Scanner;

public class calculadorafunciones {

	public static void main(String[] args) {
		//habilitamos lectura
		Scanner entrada=new Scanner(System.in);
		double a,b,result;
		char opcion=0;
		//menú
		do {
			menu();
			//leemos opcion
			opcion=entrada.nextLine().charAt(0);
			switch(opcion) {
			case 'S':
			case 's':
				//lectura de un numero
				System.out.println("introduce un numero");
				a=entrada.nextDouble();
				//leemos el otro numero
				System.out.println("introduce un numero");
				b=entrada.nextDouble();
				entrada.nextLine();
				result =suma(a,b);
				System.out.println(result);
			break;
			case 'R':
			case 'r':
				//lectura de un numero
				System.out.println("introduce un numero");
				a=entrada.nextDouble();
				//leemos el otro numero
				System.out.println("introduce un numero");
				b=entrada.nextDouble();
				entrada.nextLine();
				result =resta(a,b);
				System.out.println(result);
			break;
			case 'M':
			case'm':
				//lectura de un numero
				System.out.println("introduce un numero");
				a=entrada.nextDouble();
				//leemos el otro numero
				System.out.println("introduce un numero");
				b=entrada.nextDouble();
				entrada.nextLine();
				result =multi(a,b);
				System.out.println(result);
			break;
			case 'D':
			case 'd':
				//lectura de un numero
				System.out.println("introduce un numero");
				a=entrada.nextDouble();
				do {
					System.out.println("Introduce numero 2 distinto de 0");
					b=entrada.nextDouble();
				}while(b == 0);
				entrada.nextLine();
				result = divi(a,b);
				System.out.println(result);
			break;
			case 'A':
			case 'a':
				System.out.println("Salir");
				//caso por defecto
			default:
					System.out.println("opcion no valida");
			}
		}while((opcion!='a')&&(opcion!='A'));
	}
	public static double suma(double a,double b) {
		return a+b;
	}
	public static double resta(double a,double b) {
		return a-b;
	}
	public static double multi(double a,double b) {
		return a*b;
	}
	public static double divi(double a,double b) {
		return a/b;
	}
	public static void menu() {
		//mostrar menu
		System.out.println("***** Calculadora de “Laila El Haddad” *****");
		System.out.println("Sumar");
		System.out.println("Restar");
		System.out.println("Multiplicar");
		System.out.println("Dividir");
		System.out.println("sAlir");
		System.out.println("******************");
	}
}
