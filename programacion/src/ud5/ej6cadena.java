package ud5;

import java.util.Scanner;

public class ej6cadena {
//Realizar un programa que dada una cadena de caracteres por caracteres, genere otra cadena
//resultado de invertir la primera.
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("ingresa una cadena");
		String cad=entrada.nextLine();
		String cadinver="";
		for(int i=cad.length()-1;i>=0;i--) {
			cadinver+=cad.charAt(i);
		}
		System.out.println("cadena invertida:"+cadinver);
	}

}
