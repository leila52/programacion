package trimestre_1;

import java.util.Scanner;

public class calculadora_potencia {

	public static void main(String[] args) {
		//habilitamos entrada por teclado
		Scanner entrada=new Scanner(System.in);
		//Declaro variables
		double num1,num2,result,acum,cont;
		char opcion=0;
		acum = 1;
		cont = 1;
		//menú
		do {
			//mostramos el menú
			System.out.println("Opciones de menú de calculadora:");
			System.out.println("S sumar");
			System.out.println("R restar");
			System.out.println("M multiplicar");
			System.out.println("D dividir");
			System.out.println("a Salir");
			//leemos opcion
			opcion=entrada.nextLine().charAt(0);
			switch(opcion) {
			//caso sumar
			case 'S':
			case's':
				System.out.println("Introduce un numero");
				num1=entrada.nextDouble();
				System.out.println("Introduce un numero");
				num2=entrada.nextDouble();
				//limpiamos buffer
				entrada.nextLine();
				result=num1+num2;
				System.out.println("El resultado de la suma es :"+result);
			break;
			//caso restar
			case 'R':
			case 'r':
				System.out.println("Introduce un numero");
				num1=entrada.nextDouble();
				System.out.println("Introduce un numero");
				num2=entrada.nextDouble();
				//limpiamos buffer
				entrada.nextLine();
				result=num1-num2;
				System.out.println("El resultado de la resta es :"+result);
			break;
			//caso multiplicación
			case 'M':
			case 'm':
				System.out.println("Introduce un numero");
				num1=entrada.nextDouble();
				System.out.println("Introduce un numero");
				num2=entrada.nextDouble();
				//limpiamos buffer
				entrada.nextLine();
				result=num1*num2;
				System.out.println("El resultado de la multiplicación es :"+result);
			break;
			//caso division
			case 'D':
			case'd':
				System.out.println("Introduce un numero");
				num1=entrada.nextDouble();
				System.out.println("Introduce un numero");
				num2=entrada.nextDouble();
				//limpiamos buffer
				entrada.nextLine();
				result=num1/num2;
				System.out.println("El resultado de la división es :"+result);
			break;
			//caso division
			case 'P':
			case'p':
				System.out.println("Introduce el numero de la base");
				num1=entrada.nextInt();
				System.out.println("Introduce el numero de exponente");
			    num2=entrada.nextInt();
				//limpiamos buffer
				entrada.nextLine();
				while (cont <=num2) {
					acum= acum* num1;
					cont= cont +1;
				}
				System.out.println("El resultado de la potencia :"+acum);
            //caso por defecto
			default:
				System.out.println("Salir");
			}
		}while((opcion!='a')&&(opcion!='A'));


	}

}
