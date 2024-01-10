package ud5;

import java.util.Scanner;

public class ejercicio339problemas {
/* https://codeforces.com/problemset/problem/339/A*/
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("ingrese la suma");
		String suma=entrada.nextLine();
		//lamamos funcion
		String sumaOrganizada=organizaSuma(suma);
		//muestrab en pantalla la nueva suma
		System.out.println("la suma reorganizada: "+sumaOrganizada);
	}
	public static String organizaSuma(String suma) {
		char[]caracteres=suma.toCharArray();
		int cont1=0,cont2=0,cont3=0;
		for(int i=0;i<suma.length();i++) {
			char cont=suma.charAt(i);
			if(cont=='1') {
				cont1++;
			}
			if(cont=='2') {
				cont2++;
			}
			if(cont=='3') {
				cont3++;
			}
		}
		//la nueva suma bn organizada
		String newsuma="";
		for(int i=0;i<cont1;i++) {
			if(newsuma.contains("+")) {
				newsuma+="+";
			}newsuma+="1";
				
		}
		for(int i=0;i<cont2;i++) {
			if(newsuma.contains("+")) {
				newsuma+="+";
			}newsuma+="2";
				
		}
		for(int i=0;i<cont3;i++) {
			if(newsuma.contains("+")) {
				newsuma+="+";
			}newsuma+="3";
				
		}return newsuma;
		
				
	}
}
