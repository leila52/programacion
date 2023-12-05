package ud5;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
//Escribir por pantalla cada carácter de una cadena introducida por teclado
public class ej1cadenas {
	public static void main(String[] args) {
		// string cad=entrada.nextint();
		//char letra=cad.charAt(0);
		//"a"cadena
		//'a' caracter unico
		//cadena vacia
		String cad="";
		//leer cadenas por teclado
		Scanner in=new Scanner(System.in);
		System.out.println("introduce la cadena");
		//para leer cadenas
		cad=in.nextLine();
		for(int i=0;i<cad.length();i++) {
		char letra=cad.charAt(i);
		System.out.println(letra);
		}

	}

}
