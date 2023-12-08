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
		do {
				intentos--;
				System.out.println("introduce el numero secreto");
				num=entrada.nextInt();
				if(num==numero) {
					System.out.println("has acertado");
				}
				else {
					System.out.println("te quedan "+intentos+"intentos");
				}
				if(numero<num) {
					System.out.println("el numero secreto es menor ");
				}if(numero>num) {
					System.out.println("numero secreto es mayor");
				}
				
				
		}while((num!=numero)&&(intentos>0));
		
	}
	

}

