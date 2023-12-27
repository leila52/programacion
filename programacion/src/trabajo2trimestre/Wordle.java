package trabajo2trimestre;

import java.util.Scanner;

public class Wordle {
	static Scanner entrada=new Scanner(System.in);
	static String secreta="";
	static int intentos=6;
	static int numPalabraAcertadas=0;
	static char[] vocal= {'a','e','i','o','u'};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] palabras= {"novio","coche","letra","hueco","casco","tecla","piano",
				"pollo","tocar","beber","carta","oveja","abeja","matar","libro","torre","final","rezar","pecar","crema"};
	}
	public static boolean palaCorrect(String cad) {
		if
	}
	public static boolean cont5Letra(String cad) {
		if(cad.length()!=5) {
			return false;
		}return true;			
	}
	public static boolean contLetras(String cad) {
		for(int i=0;i<cad.length();i++) {
			char cara=cad.charAt(i);
			//si no es una letra
			if(!Character.isLetter(cara)) {
				return false;
			}
			}return true;
	}
	public static boolean contvocal(String cad) {
		for(int i=0;i<cad.length();i++) {
			for(int j=0;j<vocal.length;j++) {
				if(cad.charAt(i)==vocal[j]) {
					return true;
				}
			}
		}return false;
	}
	public static int contarVocal(String cad) {
		int cont=0;
		for(int i=0;i<cad.length();i++) {
			char letraahora=cad.charAt(i);
			for(int j=0;j<vocal.length;j++) {
			if(letraahora==vocal[j]) {
				cont++;
			}
			}
		}
	}
}
