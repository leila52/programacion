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
		contrasena="";
	}
	//constructor con longitud y genera 
	//una contraseña aleaotria
	public static char generarcontrasena() {
		Random ale=new Random();
		// 62 en total 26 mayu 26 min y 10 numeros
		int caracter=ale.nextInt(62);
		if(caracter <26) {
			return (char)(caracter+'A');
		}
		if(caracter>26 && caracter <52) {
			return (char)(caracter-26+'a');
		}
		else {
			return (char)(caracter-52+'0');
		}
	}
	//boolean de es fuerte
	public boolean esFuerte() {
		int mayu=0;
		int min=0;
		int num=0;
		for(int i=0;i< longitud;i++) {
			char caracter= generarcontrasena();
			if(Character.isUpperCase(caracter)) {
				mayu++;
			}
			if(Character.isLowerCase(caracter)) {
				min++;
			}
			if(Character.isDigit(caracter)) {
				num++;
			}
		}
		return character ;
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
		generarcontrasena();
	}
	
}
