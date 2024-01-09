package ud5;

import java.util.Scanner;

public class ej33 {
//hacer un programa que lea una frase e indique cuantas veces aparece cada letra en dicha frase
	//ejemplo: frase: en un lugar de la Mancha
	//letras:a 4 veces,c 1 vez, d 1 vez,e dos veces
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("introduzca una frase");
		String frase=entrada.nextLine().toLowerCase();
		frase=frase.toLowerCase();
		int cont;
		char letra=97;
		for(int i=97;i<=122;i++) {
			cont=0;
			for(int j=0;j<frase.length();j++) {
				letra=(char)(i);
				if(frase.charAt(j)==letra) {
					cont++;
				}
			}if(cont!=0) {
				System.out.println(letra+":"+cont+"veces");
			}
		}
	}
}
		/*forma del profesor*/
		/*que no se puede cambiar es el final iny
		 *int=numletras='z' -'a'+1;
		 *int[]contletras=new int[numletras];
		 *Scanner in=new Scanner(System.in);
		 *syso("introduce una frase);
		 *String frase=in.nwxtLine();
		 *recorremos la fraseletra a letra
		 *for(int i=0;i<frase.length();i++){
		 *   int pos=frase.charAt(i)-'a';
		 *   if(pos>=0&&(pos<=numletra))
		 *   		contletras[pos]++;
		 *   }
		 *   for(int i=0;i<numletras;i++){
		 *   if(contletras[i]>0)
		 *   syso (char)(i+'a')+" "+contletras[i];
		 *   }
		 
		 * 
		 */

