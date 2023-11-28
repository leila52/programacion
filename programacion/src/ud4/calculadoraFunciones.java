package ud4;

import java.util.Scanner;

public class calculadoraFunciones {

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
				//lectura de un numero0
				System.out.println("introduce un numero");
				a=entrada.nextDouble(); 
				//leemos el otro numero
				System.out.println("introduce un numero");
				b=entrada.nextDouble();
				entrada.nextLine();
				if (b!=0) {
					result =divi(a,b);
					System.out.println(result);
				}
				System.out.println("ERROR,el numero es invalido");
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
