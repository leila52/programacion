package ud3;

import java.util.Scanner;

public class ejraro {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		int i,j,l;
		int num;
		char aste = '*';
		char espa = ' ';
		//Leemos i chuletario
		System.out.println("introduce un numero");
		num = entrada.nextInt();
		for (i = 0; i < num; i++){
			for(j= 0; j< i; j++) {
				for(l= 0; l< i; l++) {
					System.out.print(espa);
				}
			System.out.print(aste);
			}
			System.out.println(espa);
		}

	}

}
