package unidad6ObjetosBasico;

import java.util.Random;

public class Password {
	private int longitud;
	private String contrasena;
	//por defecto
	public Password(){
		longitud=8;
		contrasena="";
	}
	public Password(int longi){
		longitud=longi;
		generarcontrasena(longi);
	}
	//constructor con longitud y genera 
	//una contraseña aleaotria
	public static String generarcontrasena(int longitud) {
		Random ale=new Random();
		// 62 en total 26 mayu 26 min y 10 numeros
		String caracteres= "ABCDEFHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String contrasena="";
		for(int i=0; i<longitud;i++) {
			int reye=ale.nextInt(caracteres.length());
			contrasena+=caracteres.charAt(reye);
		}
		return contrasena;
	}
	//boolean de es fuerte
	public boolean esFuerte() {
		int mayu=0;
		int min=0;
		int num=0;
		for(int i=0;i< contrasena.length();i++) {
			char caracter= contrasena.charAt(i);
			if(caracter >= 'A' && caracter<='Z') {
				mayu++;
			}
			if(caracter >= 'a' && caracter<='z')
				min=min+1;
			if(caracter >='0'&& caracter <='9') {
				num++;
			}
		}
		return (mayu >2 && min >2 && num>1) ;
	}
	//getter
	public String getConttrasena() {
		return contrasena;
	}
	public int getLongitud() {
		return longitud;
	}
	//setters
	public void setLongitud(int longi) {
		longitud=longi;
		generarcontrasena(longi);
	}
	
}
