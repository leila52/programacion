package und4;

import java.util.Scanner;

//6. Que lea 10 números por teclado, los almacene en un array y muestre la suma,
//resta, multiplicación y división de todos.

public class ej6hoja4 {

	public static void main(String[] args) {
		//habilitamos la lectura
		Scanner entrada= new Scanner(System.in);
		//definimos el array
		// paso uno
		double[] num = new double[10] ;
		double suma=0;
		double resta=0;
		double mult=1;
		double divi=1;
		//3.relolenamos en el array
		for(int i=0;i<10;i++) {
			System.out.println("Introduce 10 numeros");
			num[i]=entrada.nextDouble();
		}
		//calculamos la array
		for(int i=0;i<10;i++) {
			suma=suma + num[i];
			resta=resta - num[i];
			mult= mult * num[i];
			if(num[i]==0) {
				divi= divi / num[i];
			}
		}
		System.out.println("La suma es " +suma);
		System.out.println("La resta es "+resta);
		System.out.println("la multi es "+mult);
		System.out.println("La division es "+divi);



	}

}
