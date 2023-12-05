package ud5;

import java.util.Scanner;

public class ej4cadena {
	//Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras
	//separadas por espacios), realiza un programa que cuente cuantas palabras tien
	public static void main(String[] args) {
		//leer cadenas por teclado
		Scanner in=new Scanner(System.in);
		//pedir cadena
		String cad="";
		char letra=' ';
		int cont=0;
		System.out.println("introduce el cadena");
		cad=in.nextLine();
		for(int i=1;i<cad.length();i++) {
			if((cad.charAt(i-1)==letra)&&(cad.charAt(i)!=letra)) {
				cont++;
			}
		}
		//caso de q la palabra no comienza con el espacio
		if(cad.charAt(0)!=letra) {
			cont++;
		}
				System.out.println(cad+" tiene "+cont+" palabras");
				

	}

}