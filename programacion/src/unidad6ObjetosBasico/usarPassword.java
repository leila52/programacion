package unidad6ObjetosBasico;

import java.util.Scanner;

public class usarPassword {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("introduce la longitud");
		int longContra=in.nextInt();
		//array
		System.out.println("introduce el tamaño de la array");
		int tama=in.nextInt();
		Password[] contraseñas= new Password[tama];
		boolean [] esFuerteArray =new boolean[tama];
		for(int i=0;i<longContra;i++) {
			contraseñas[i]=new Password(longContra);
			esFuerteArray[i] = contraseñas[i].esFuerte();
			
		}
		System.out.println("es fuerte");
		for(int i=0;i<tama;i++) {
			System.out.println(contraseñas[i].getConttrasena() + esFuerteArray[i]);
		}
	}

}
