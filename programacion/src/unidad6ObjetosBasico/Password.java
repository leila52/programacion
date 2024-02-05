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
	public static int generarcontrasena(int longi) {
		int contra = 0;
		Random aledebil=new Random();
		int[] longitud=new int [longi];
		int contrasena;
		for(int i=0;i<longitud.length;i++) {
		contrasena=aledebil.nextInt(90)+33;
		longitud[i]=contrasena;
		contra=(char)(longitud[i]);
		}
		return contra ;
	}
	//boolean de es fuerte
	public boolean esFuerte() {
		
	}
	
}
