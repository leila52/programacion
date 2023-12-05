package ud5;

import java.util.Scanner;
//Realizar un programa que comprueba si una cadena leída por teclado comienza por una
//subcadena introducida por teclado
public class ej2string {

	public static void main(String[] args) {
		//leer cadenas por teclado
		Scanner in=new Scanner(System.in);
		//pedir cadena
		String cad="";
		String dac="";
		int contdeletras=0;
		System.out.println("introduce el cadena");
		cad=in.nextLine();
		System.out.println("introduce la subcadena");
		dac=in.nextLine();
		//se comprueba letra a leetra e imcre,emt cont en ese caso
		for(int i=0;i<dac.length();i++) {
			if(cad.charAt(i)==dac.charAt(i)) {
				contdeletras++;
			}
		}
		if(contdeletras==dac.length()) {
			System.out.println("si lo hace");
		}else {
			System.out.println("no lo hace");
		}
	}
		

		}
