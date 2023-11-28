package ud4;

import java.util.Scanner;

//pida al usuario un caracter(mostrando las dos opcionnes
//p debera mostra los numeros pares de 1 al 500
//i numeros impares de 1 al 500
//otro caracter mostrar error
public class Ej4Examen {

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
