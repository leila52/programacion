package ud5;

import java.util.Scanner;

public class desplazamiento {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("introduzca la frase que quiere introducir");
		String frase=in.nextLine();
		frase=frase.toLowerCase();
		System.out.println("de cuanto quiere el desplazamiento ");
		int desplazamiento=in.nextInt();
		while (desplazamiento> 25) {
			System.out.println("ERROR necesita meter un numero entre 1 y 25");
			desplazamiento=in.nextInt();
		}
		in.nextLine();
		System.out.println("dime si quiere cifrarlo o descifrarlo");
		String cifrar=in.nextLine();
		
		
		if(cifrar.equals("cifrarlo")) {
			String msjCodificado=codificar(frase,desplazamiento);
			System.out.println(msjCodificado);
		}
		if(cifrar.equals("descifrarlo")) {
			String msjdescodificado=descodificar(frase,desplazamiento);
			System.out.println(msjdescodificado);
		}
		
		}
	public static String codificar( String frase,int desplazamiento) {
		String mansejaCodificado="";
		for(int i=0;i<frase.length();i++) {
			char caracter=frase.charAt(i);
			char caracterCodificado=caracter;
			//minuscula 
			if(caracter>='a' && caracter <='z') {
				caracterCodificado=(char)(caracter +desplazamiento);
				if(caracterCodificado>'z') {
					caracterCodificado=(char)(caracterCodificado-('z'-'a'));
					
				}
			}mansejaCodificado=mansejaCodificado+caracterCodificado;
			//cualquier otro caracter
		}
		return mansejaCodificado;
	}
public static String descodificar( String frase,int desplazamiento) {
	return codificar(frase,desplazamiento*(-1));

}

}


