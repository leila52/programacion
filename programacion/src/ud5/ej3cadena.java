package ud5;

import java.util.Scanner;
//Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas veces
//aparece el carácter en la cadena
public class ej3cadena {

	public static void main(String[] args) {
		//leer cadenas por teclado
		Scanner in=new Scanner(System.in);
		//pedir cadena
		String cad="";
		char letra=' ';
		int cont=0;
		System.out.println("introduce el cadena");
		cad=in.nextLine();
		//pedimos el caracter
		System.out.println("introduce el caracter");
		letra=in.nextLine().charAt(0);
		for(int i=0;i<cad.length();i++) {
			if(letra==cad.charAt(i))
				cont++;
		}
		System.out.println("la letra "+ letra+" se encuentra "+ cont+" veces");

	}

}
