package ud4;

import java.util.Scanner;

public class ej3_practicaTipoC {

	public static void main(String[] args) {
		//habilitamos la lectura
		Scanner entrada= new Scanner(System.in);
		//definimos las arrays
		int[] num;
		//2.construimos las array de 5 posiciones
		num=new int[5];
		//3.introducimos los 5 numeros
		for(int i=0;i<5;i++) {
			System.out.println("Introduce 5 numeros");
			num[i]=entrada.nextInt();
		}
		//ordenamos el array usando el metodo de la burbuja
			for(int i=0;i<5;i++) {
				for(int j=0;j<5-i;j++) {
					 =num[j];
					 num[j] = num[j+1];
				}
			}
		}
		

}


