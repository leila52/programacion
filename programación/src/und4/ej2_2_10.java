package und4;

import java.util.Scanner;

//introducir tamaño del array 1(TAM1)
//leer TAM1 entero
//introducir tamaño del array 2(TAM2)
//leer TAM2 entero
//crear una array de tam1+tam2 con el contenido de ambos
public class ej2_2_10 {

	public static void main(String[] args) {
		//habilitamos lectura
		Scanner entrada=new Scanner(System.in);
		int TAM1;
		int TAM2;
		int TAM3;
		System.out.println("Introduce el tamaño del primer array");
		TAM1=entrada.nextInt();
		int[]array1;
		array1=new int[TAM1];
		System.out.println("Introduce los numero del primer array");
		for(int i=0;i<TAM1;i++) {
			array1[i]=entrada.nextInt();
		}
		System.out.println("Introduce el tamaño del segundo array");
		TAM2=entrada.nextInt();
		int[]array2;
		array2=new int[TAM2];
		System.out.println("Introduce los numero del segundo array");
		for(int i=0;i<TAM2;i++) {
			array2[i]=entrada.nextInt();
		}
		TAM3=TAM1+TAM2;
		int[]array3;
		array3=new int[TAM3];
		for(int i=0;i<TAM1;i++) {
			array3[i]=array1[i];
		}
		for(int i=TAM1;i<TAM3;i++) {
			array3[i]=array2[i-TAM3];
		}
	}

}
