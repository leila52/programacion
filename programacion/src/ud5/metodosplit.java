package ud5;

import java.util.Scanner;

public class metodosplit {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("introduce una frase");
		String frase=in.nextLine();
		String [] palabras=frase.split("");
		int cont=0;
		for(int i=0;i<palabras.length;i++) {
			if(palabras[i].equals(" ")) {
				
				cont++;
			}
			
		}System.out.println("hay en total :"+cont+" palabras");

	}

}
