package examenescoreccion;
import java.util.Scanner;
//programa dos metodos estaticos
//un parametro entero entre 0 y 10 incluidos
//public static boolean valido(int num)
//segundo metodo
//public static void multiplica(int num)
//main
//se comprueba si el numero esta entre 1 y 10con el primer metodo si no lo vuelve a pedir
//mostrar tabla de multiplicacion
public class ej2ud23 {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		System.out.println("introduce un numero");
		num=entrada.nextInt();
		while(Esvalido(num)==false) {
			System.out.println("error vuelve a introducirlo");
			num=entrada.nextInt();
		}
		multi(num);
	}public static boolean Esvalido (int num) {
		if((num<1)||(num>10)) {
			return false;-
		}
		else {
			return true;
		}
	}
	public static void multi(int num) {
		int multi;
		for(int i=0;i<11;i++) {
			multi=num*i;
			System.out.println(num+"x"+i+"="+multi);
		}
	}
}
