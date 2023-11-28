package examenescoreccion;
import java.util.Scanner;
//pedir un numero de 5 cifras10000 y 99999,se debe de controlar y si no se pide de nuevo
//mostrar por pantalla si es capitua o no
public class ej1ud23 {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		System.out.println("introduce un numero de 5 cifras");
		num=entrada.nextInt();
		while((num<=10000)||(num>=99999)) {
			System.out.println("error vuelve a introducir un numero");
			num=entrada.nextInt();
		}
			int cont=0;
			int d=0,c=0,u=0,f=0;
			while(num>=10000) {
			num=num-10000;
			u++;
			}
			while(num>=1000) {
			num=num-1000;
			d++;
			}
			while(num>=100) {
			num=num-100;
			c++;
			}
			while(num>=10) {
			num=num-10;
			f++;
			}
			cont=num;
			if((u==cont)&&(d==f)) {
				System.out.println("es capicua");
			}
			else {
				System.out.println("no es capicua");
			}
		}	
	}