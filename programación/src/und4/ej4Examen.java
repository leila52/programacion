package und4;

import java.util.Scanner;

public class ej4Examen {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce p o i");
		char caracter=entrada.nextLine().charAt(0);
		int cont=2;
		int imp=1;
		if((caracter =='p')||(caracter=='P')) {
			while(cont<=500) {
				System.out.print(cont+",");
				cont=cont+2;
			}
		}
		if((caracter=='i')||(caracter=='I')) {
			while(imp<=500) {
				System.out.print(imp+",");
				imp=imp+2;
			}
		}
		
		else {
			System.out.println("ERROR vuelva introducir i o p");
		}


	}

}
