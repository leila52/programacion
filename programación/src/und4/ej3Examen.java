package und4;

import java.util.Scanner;

public class ej3Examen {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce un valor");
		int a =entrada.nextInt();
		System.out.println("introduce un valor");
		int b =entrada.nextInt();
		int cont;
		if((a>100)||(b>100)||(a<0)||(b<0)) {
			System.out.println("ERROR");
		}else {
			while(a<=b) {
				System.out.println(a);
				cont=a+1;
				a=cont;
			}
			
			while(a>=b) {
				System.out.println(a);
				cont=a-1;
				a=cont;
				
			}
	}


	}

}
