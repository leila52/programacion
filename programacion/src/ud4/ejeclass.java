package ud4;

import java.util.Scanner;

//que pida 10 notas y muestre la media ademas debera mostrar las notas pedidas
public class ejeclass {

	public static void main(String[] args) {
		//habilitamos entrada por teclado
		Scanner entrada=new Scanner(System.in);
		//definimos el array de notas
		// paso uno
		int[] notas ;
		int suma=0;
		//2.construimos el array de 10 posiciones
		notas=new int[10];
		//3.metemos 10 notas en el array
		for(int i=0;i<10;i++) {
			System.out.println("Introduce 10 valores");
			notas[i]=entrada.nextInt();
			suma=suma+notas[i];
		}
		//4.los mostramos
		for(int i=0;i<10;i++) {
		System.out.println(notas[i]);
		}
		System.out.println("La media es : "+(suma/10));
	
	}

}
