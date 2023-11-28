package ud3;

import java.util.Scanner;
//dado un n de 3 cifras calcular si es un numero narcicista
public class narcicistamodulo {

	public static void main(String[] args) {
		//habilitamos entrada por teclado
				Scanner entrada=new Scanner(System.in);
				int numLeido=0,num;
				int c=0,d=0,u=0;
				System.out.println("Introduce un número");
				numLeido=entrada.nextInt();
				num=numLeido;
				//obtenemos las centenas
				while (num>=100) {
					num=num-100;
					c=c+1;
				}

	}

}
