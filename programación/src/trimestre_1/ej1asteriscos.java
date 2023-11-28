package trimestre_1;

import java.util.Scanner;

public class ej1asteriscos {

	public static void main(String[] args) {
		///Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		int i,j;
		int num;
		char aste = '*' ;
		//Leemos i chuletario
		System.out.println("introduce un numero");
		num = entrada.nextInt();
		for (i = 0; i < num; i++){
			for(j= 0; j< i; j++) {
			System.out.print(aste);
			}
			System.out.println(aste);
		}

	}

}
