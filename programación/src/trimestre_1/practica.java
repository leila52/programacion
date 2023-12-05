package trimestre_1;

import java.util.Scanner;

//Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas
public class practica {

	public static void main(String[] args) {
		Scanner entrada==new Scanner(System.in);
		// describir variables
		int cont;
		cont=0;
		int acum;
		acum=0;
		System.out.println(" Introduce un numero positivo ");
		//leer cont
		cont=entrada.nextInt();
		while (cont >0) {
			cont = cont-1;
			System.out.println(cont);
		}
		cont = cont-1;
		acum=0;
		

	}

}
