package ud5;

import java.util.Random;
import java.util.Scanner;

public class carreratortugas {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		Random ale =new Random();
		int cont=1;
		String [] tortugas= {"","","","",""};
		
		int torAvanza;
		System.out.println("bienvenidos");
		System.out.println("introduzca el limite para el ganador");
		int limite=entrada.nextInt();
		do {
			//muestra el numero de interacion
			System.out.println("");
			System.out.println("iteracion"+ (cont++)+":");
			
			//se genera aleatoriamente un numero q indica q tortuga avanza de las 5
			torAvanza =ale.nextInt(5);
			tortugas[torAvanza]=tortugas[torAvanza]+"*";
			//muestra el estado de la carrera
			for(int i=0;i<5;i++) {
				System.out.println("tortuga"+ (i+1) +':'+ tortugas[i]);
			}
		}while(tortugas[torAvanza].length() !=limite);
		System.out.println("ha ganado la tortuga "+ (torAvanza+1));
		

	}

}
