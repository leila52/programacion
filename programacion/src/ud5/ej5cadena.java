package ud5;

import java.util.Scanner;

//Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales
//en mayúsculas
public class ej5cadena {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el nombre y apellido");
		String nomCompleto=entrada.nextLine();
		char letra=' ';
		for(int i=1;i<nomCompleto.length();i++) {
			if((nomCompleto.charAt(i-1)==letra)) {
				
			}
		}
		

	}

}
