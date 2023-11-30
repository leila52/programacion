package ud4;

import java.util.Scanner;

public class EJ3Examen {

	public static void main(String[] args) {
		// que pida los numeros
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce un valor");
		System.out.println("introduce un valor");
		int a =entrada.nextInt();
		System.out.println("introduce un valor");
		int b =entrada.nextInt();
		if((a>100)||(b>100)||(a<0)||(b<0)) {
			System.out.println("ERROR");
		}else {
			if(a<b)
				for(int i=a;i<=b;i++) {
					System.out.println(i);
				}
			if(a>b)
				for(int i=a;i>=b;i--) {
					System.out.println(i);
				}
			
	}
	}

}
