package ud5;
import java.util.Random;
import java.util.Scanner;
//. Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y
//tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
//oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
public class ej6aleatorio {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int intentos=5;
		int num;
		Random ale = null;
		ale=new Random();
		int numero=ale.nextInt(100)+1;
		System.out.println(numero);
		System.out.println("introduce el numero secreto");
		num=entrada.nextInt();
		while(num!=numero ) {
			if(intentos>0) {
				intentos--;
				if(numero<num) {
					System.out.println("el numero secreto es menor");
				}else {
					System.out.println("numero secreto es mayot");
				}
				System.out.println("vuelve a introducir el numero secreto y te quedan "+intentos+" intentos");
				num=entrada.nextInt();
				if(intentos==0 &&num!=numero){
					System.out.println("no has hacertado y te has quedado sin intentos");
				}
			}
			
		}
		if(num==numero) {
			System.out.println("has acertado");
		}
		
	}
	

}

