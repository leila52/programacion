package ud4;

import java.util.Scanner;

//Que lea 5 números por teclado, los copie a otro array multiplicados por 2 y
//muestre el segundo array.
public class ej9hoja4 {

	public static void main(String[] args) {
		//habilitamos la lectura
		Scanner entrada= new Scanner(System.in);
		//definimos las arrays
		int[] num;
		int[] num2;
		//2.construimos las array de 5 posiciones
		num=new int[5];
		num2=new int[5];
		//3.introducimos los 5 valores
		for(int i=0;i<5;i++) {
			System.out.println("Introduce 5 valores");
			num[i]=entrada.nextInt();
		}
		//paraque el segundo array se multiplique a 2 y se imprima
		for(int i=0;i<5;i++) {
			num2[i]=num[i]*2;
			System.out.println(num2[i]);
		   
		}

   }

}
