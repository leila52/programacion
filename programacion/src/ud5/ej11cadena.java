package ud5;

import java.util.Scanner;

/*Realizar una función a la que se le pasa por parámetro una cadena
con un email, y dicha función devuelve si el mail está bien formado.
Un email está bien formado cuando:
1.1.- Contiene una y solo una arroba.
1.2.- No puede contener dos puntos seguidos '.' después de la arroba.
1.3.- No puede contener ' '*/
public class ej11cadena {

	public static void main(String[] args) {
		//leer cadenas por teclado
		Scanner in=new Scanner(System.in);
		//pedir cadena
		String cad="";
		System.out.println("introduce el cadena");
		cad=in.nextLine();
		esmail(cad);
		

	}
	public static boolean esmail(String cad) {
		String[] parte=cad.split("@");
		if((cad.contains("@")==true)&&(cad.contains(".")==true)&&(cad.contains(" ")==false)) {
			System.out.println("es correcto el mail");
			return true;
		}
		return false;
	}

}
