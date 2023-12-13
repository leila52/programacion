package ud5;

import java.util.Scanner;

//ejercicio q leea un numero entero y lo multiplque por dos
//controlar q sea entero
public class ejemploscanner2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("introduce un numero entero");
		boolean esInt=in.hasNextInt();
		if(esInt==true) {
			int num=in.nextInt();
			System.out.println("el numero multiplicado por 2 es: "+(num*2));
		}else {
			System.out.println("error el numero no es entero");
		}
		

	}

}
