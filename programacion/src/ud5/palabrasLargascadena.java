package ud5;

import java.util.Scanner;

public class palabrasLargascadena {
/*A veces algunas palabras como " localización " o " internacionalización " son tan largas que escribirlas muchas veces en un mismo texto resulta bastante tedioso.

Consideremos una palabra demasiado larga , si su longitud es estrictamente superior a 10 caracteres. Todas las palabras demasiado largas deberían sustituirse por una abreviatura especial.

Esta abreviatura se hace así: escribimos la primera y la última letra de una palabra y entre ellas escribimos el número de letras entre la primera y la última. Ese número está en sistema decimal y no contiene ceros a la izquierda.

Por lo tanto, " localización " se escribirá como " l10n " y " internacionalización " se escribirá como " i18n ".

Se sugiere automatizar el proceso de cambio de palabras con abreviaturas. En este caso, las palabras demasiado largas deben sustituirse por la abreviatura y las palabras que no sean demasiado largas no deben sufrir ningún cambio.*/
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		//pedir cadena
		
		int numPalabra=Integer.parseInt(entrada.nextLine());
		String[] cadAbre=new String[numPalabra];
		String cad="";
		for(int i=0;i<numPalabra;i++) {
			cad=entrada.nextLine();
			if(cad.length()>10) {
				cadAbre[i]=""+(cad.charAt(0))+(cad.length()-2)+
						(cad.charAt(cad.length()-1));
				
			}else {
				cadAbre[i]=cad;
			}
		}
		for(int i=0;i<numPalabra;i++) {
			System.out.println(cadAbre[i]);
		}
		
	}

}
