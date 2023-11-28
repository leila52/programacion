package ud4;

import java.util.Scanner;

public class ej1hoja4 {

	public static void main(String[] args) {
		//definimos el array de notas
		// paso uno
		int[] num;
		//2.construimos el array de 100 posiciones
		num=new int[100];
		//DECLARAMOS VARIBLES
		int numero=1;
		//3.metemos 100 notas en el array
		for(int i=0;i<100;i++) {
			num[i]=numero;
			numero++;
		}
		//muestro array
		for(int i=0;i<100;i++) {
			System.out.println(num[i]);
		}
			

	}

}
