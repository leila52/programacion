package ud3;

import java.util.Scanner;

public class ej2arbol {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		int i,j;
		int num;
		char aste = '*' ;
		char espa = ' ';
		//Leemos i chuletario
		System.out.println("introduce un numero");
		num = entrada.nextInt();
		for (i = 0; i < num; i++){
			for(j= 0; j< i; j++) {
			System.out.print(aste);
			}
			System.out.println(aste);
		}
		for (j = 0; j < num; j++){
			for(i= 0; i< i; i++) {
			System.out.print(espa);
			}
			System.out.println(aste);
		}
		for (i = 0; i < num; i++){
			for(j= 0; j< i; j++) {
			System.out.print(aste);
			}
			System.out.print(aste);
		}
	}

}
