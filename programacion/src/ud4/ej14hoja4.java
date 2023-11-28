package ud4;

import java.util.Scanner;
// Que rellene un array con 20 números y luego busque un número concreto.
public class ej14hoja4 {

	public static void main(String[] args) {
		//definicion deconstantes
		final int TAMANO=20;
		//habilitamos la lectura
		Scanner entrada= new Scanner(System.in);
		int[] num;
		int numBuscado=0;
		boolean numEncontrado=false;
		int pos =0;
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
		while(num[pos]!=numBuscado) {
			
		}
	}
}
