package und4;

import java.util.Scanner;

public class ej14hoja4 {

	public static void main(String[] args) {
		final int TAMANO=20;
		//habilitamos la lectura
		Scanner entrada= new Scanner(System.in);
		int[] num;
		int numBuscado=0;
		boolean numEncontrado=false;
		//2.construimos las array de 20 posiciones
		num=new int[TAMANO];
		//3.introducimos los 20 valores
		for(int i=0;i<TAMANO;i++) {
			System.out.println("Introduce 20 valores");
			num[i]=entrada.nextInt();
		}
		//pedimos un numero
		System.out.println("introduce el numnero a buscaar");
		numBuscado=entrada.nextInt();
		for(int i=0;i<TAMANO;i++) {
			if ((numBuscado==num[i])&&(numEncontrado==false)){
				System.out.println("la posicion del numero es: "+(i+1));
				numEncontrado=true;
				
				
			}
		}

	}

}
