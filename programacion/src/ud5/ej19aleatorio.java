package ud5;

import java.util.Random;

public class ej19aleatorio {
// Realizar un programa que genere cadenas de 5 caracteres aleatorios formado por letras
	//minúsculas.
	public static void main(String[] args) {
		int cantidad=5;
		for(int i=0;i<cantidad;i++) {
			String cadAle=genAle();
			System.out.println("cadena"+(i+1)+":"+cadAle);
		}
	}
	public static String genAle() {
		Random ale=new Random();
		String cad="";
		//asi te genera cadenas con el ascci
		for(int i=0;i<5;i++) {
			char letra=(char) (ale.nextInt(26)+'a');
			cad+=letra;
		}
		return cad;
	}
}
