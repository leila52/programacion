package und4;

import java.util.Scanner;

//Leer 5 números, almacenarlos en un array y ordenarlos por el método de la burbuja
public class ej3tarea_tipoC {

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
			for(int j=0;j<4;j++) {
				 =num[j];
				 num[j] = num[j+1];
			}
		}
	}

	}


