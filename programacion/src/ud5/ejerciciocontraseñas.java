package ud5;

import java.util.Random;
import java.util.Scanner;

public class ejerciciocontraseñas {
/*Desarrolla un programa en Java que permita generar contraseñas tanto débiles como fuertes. El programa debe pedir al usuario que elija entre generar una contraseña débil o una fuerte.

Para las contraseñas débiles, el programa deberá generar una contraseña de longitud fija (por ejemplo, 6 caracteres) compuesta únicamente por letras minúsculas.

Para las contraseñas fuertes, el programa debe generar una contraseña de longitud específica ingresada por el usuario (por ejemplo, entre 8 y 12 caracteres). Estas contraseñas deben incluir una combinación de letras mayúsculas, minúsculas, números y al menos un carácter especial, como '@', '#', '$', '_'.

El programa deberá mostrar la contraseña generada según la elección del usuario.*/
	
	public static void main(String[] args) {
		Scanner entrada =new Scanner (System.in);
		Random aledebil= null;
		aledebil=new Random();
		Random alefuerte = null;
		alefuerte=new Random();
		System.out.println("que contraseña quieres, para debil pulsar d o fuerte pulsar f");
		String usuario=entrada.nextLine();
		// longitud específica ingresada por el usuario (por ejemplo, entre 8 y 12 
		//caracteres). Estas contraseñas deben incluir una combinación de letras
		//mayúsculas, minúsculas, números y al menos un carácter especial, como 
		//'@'=64, '#'=35, '$'=36, '_'=95.

		if(usuario.charAt(0)=='f' || usuario.charAt(0)=='F') {
			System.out.println("que longitu quiere entre 8 y 12");
			int longitudf=entrada.nextInt();
			int[]longitudfuerte=new int[longitudf];
			for(int i=0;i<longitudfuerte.length;i++) {
				int contrasena;
				contrasena=alefuerte.nextInt(90)+33;
				longitudfuerte[i]=contrasena;
				System.out.print((char)(longitudfuerte[i]));
			}	
		}
		
		//debil longitud de 6 letras comuesto por letras minusculas
		if(usuario.charAt(0)=='d' || usuario.charAt(0)=='D') {
			int[] longitud=new int [6];
			int contrasena;
			for(int i=0;i<longitud.length;i++) {
			contrasena=aledebil.nextInt(26)+97;
			
			longitud[i]=contrasena;
			System.out.print((char)(longitud[i]));
			}
		}
		

	}

}
