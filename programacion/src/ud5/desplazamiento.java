package ud5;

import java.util.Scanner;

public class desplazamiento {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("introduzca la frase que quiere introducir");
		String frase=in.nextLine();
		
		System.out.println("de cuanto quiere el desplazamiento ");
		int desplazamiento=in.nextInt();
		while (desplazamiento> 25) {
			System.out.println("ERROR necesita meter un numero entre 1 y 25");
			desplazamiento=in.nextInt();
		}
		String [] palabra=frase.split("");
		for(int i=0;i<100;i++) {
			for(int j=0;j<palabra.length;j++) {
				String letra=palabra[j].charAt(i);
				String frasecifrada="";
				frasecifrada=letra.
					
					
			}
				System.out.print(letra+desplazamiento);	
			}
		}
		

	}

}
