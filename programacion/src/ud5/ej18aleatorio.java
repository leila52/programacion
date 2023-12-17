package ud5;

import java.util.Random;
import java.util.Scanner;

public class ej18aleatorio {
//. Realizar un juego que genera un número aleatorio entre 50 y 100 (incluidos), y, el jugador
	//tiene 3 intentos para adivinar el número.
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int intentos=3;
		int num;
		Random ale = null;
		ale=new Random();
		int numero=ale.nextInt(50)+50;
		System.out.println(numero);
		do {
				//restamos los intentos
				intentos--;
				System.out.println("introduce el numero secreto");
				num=entrada.nextInt();
				//si el numero es igual que el secreto se muestra
				if(num==numero) {
					System.out.println("has acertado");
				}
				//si no mostramos los intentos que le quedan y si es mayor o menor
				else {
					System.out.println("te quedan "+intentos+" intentos");
				}
				if(intentos==0) {
					System.out.println("te has quedado sin intentos vuelve a intentarlo la proxima");
				}
		//el whille para q no salga del bucle y se asegure q los intentos sean mayores a cero y sea diferente al num secreto
		}while((num!=numero)&&(intentos>0));

	}

}
