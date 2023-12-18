package ud5;

import java.util.Random;

public class ej7aleatorio {

	public static void main(String[] args) {
		String apuesta= "1X2";
		Random ale=new Random();
		for(int fila=1;fila<=14;fila++) {
			System.out.println("fila"+fila+": ");
			for(int j=1;j<=3;j++) {
				int numale=ale.nextInt(3);
				System.out.print(" "+apuesta.charAt(numale)+" ");
			}
			System.out.println();
		}
		for(int fila=15;fila<=15;fila++) {
			System.out.println("fila"+fila+": ");
			for(int j=1;j<=1;j++) {
				int numale=ale.nextInt(3);
				System.out.print(" "+apuesta.charAt(numale)+" ");
			}
			System.out.println();
		}
		

	}

}
