package ud3;

import java.util.Scanner;

//Que pida un número y muestre en pantalla el mismo número de asteriscos
public class forej16 {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
				Scanner entrada=new Scanner(System.in);
				int i;
				int num;
				char aste = '*' ;
				//Leemos i chuletario
				System.out.println("introduce un numero");
				num = entrada.nextInt();
				for (i = 0; i < num; i++){
					System.out.println(aste);
				}

	}

}
