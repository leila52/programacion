package trabajo2trimestre;

import java.util.Random;
import java.util.Scanner;

public class Wordle {
	static Scanner entrada=new Scanner(System.in);
	static String secreta="";
	static int intentos=6;
	static int intentosconsumidos;
	static int letrasadivinadas;
	static int numPalabraAcertadas=0;
	static char[] vocal= {'a','e','i','o','u'};
	public static void main(String[] args) {
		
		generaPalabra();
		char jugarOtraPartida;
		do {
			iniciarPartida();
			jugarPartida();
			System.out.println("total de partidad 1");
			System.out.println("deseas jugar otra partida s/n");
			jugarOtraPartida=entrada.next().charAt(0);			
			/*if(Correct(palaIntroducida)==true) {
				System.out.println("la palabra es correcta");
				System.out.println(palaIntroducida);
				correct=true;
			}else {
				System.out.println("la palabra es incorrecta");
				palaIntroducida=entrada.nextLine().toLowerCase();
				while (!haTerminadoJuego() && !haGanadoJugador()) {
		            System.out.println("Introduce una palabra de 5 letras:");
		            String intento = entrada.next().toLowerCase();

		            if (Correct(intento)) {
		                intentos++;
		            } else {
		                System.out.println("Entrada no válida. Inténtalo de nuevo.");
		            }
		        }
			}*/

			
		}while(jugarOtraPartida=='s'|| jugarOtraPartida=='S');
	
	}
	
	
	//general la palabra secreta
	public static void generaPalabra() {
		String [] palabras= {"novio","coche","letra","hueco","casco","tecla","piano",
				"pollo","tocar","beber","carta","oveja","abeja","matar","libro","torre","final","rezar","pecar","crema"};
		Random ale=new Random();
		int palalea=ale.nextInt(21);
		secreta=palabras[palalea];
		
		
	}
	/*comprobaciones*/
	public static boolean Correct(String cad) {
		if(!cont5Letra(cad))
			return false;
		if(!contsoloLetras(cad))
			return false;
		if(contienEspacio(cad))
			return false;
		if(!contienevocal(cad)&&(contarVocal(cad)<2 || contarVocal(cad)>3) )
			return true;
		/*en caso q no sea correcta*/
		return false;
		
	}
	/*Debe tener exactamente 5 letras.*/
	public static boolean cont5Letra(String cad) {
		if(cad.length()!=5) {
			return false;
		}return true;			
	}
	/**/
	public static boolean contsoloLetras(String cad) {
		for(int i=0;i<cad.length();i++) {
			char cara=cad.charAt(i);
			//si no es una letra es un metodo
			if(!Character.isLetter(cara)) {
				return false;
			}
			}return true;
	}
	/*La palabra debe contener entre dos y tres vocales.*/
	public static boolean contienevocal(String cad) {
		for(int i=0;i<cad.length();i++) {
			for(int j=0;j<vocal.length;j++) {
				if(cad.charAt(i)==vocal[j]) {
					return true;
				}
			}
		}return false;
	}
	/**/
	public static int contarVocal(String cad) {
		int cont=0;
		for(int i=0;i<cad.length();i++) {
			char letraahora=cad.charAt(i);
			for(int j=0;j<vocal.length;j++) {
			if(letraahora==vocal[j]) {
				cont++;
			}
			}
		}return cont;
	}
	public static boolean contienEspacio(String cad) {
		char espacio=' ';
		if(cad.charAt(0)!=espacio) {
			return true;
		}
		for(int i=1;i<cad.length();i++) {
			//si empieza con un espacio se asegura q lo haya y asi se utiliza el metodo
			if((cad.charAt(i-1)==' ')&&(cad.charAt(i)!=' ')) {
				return true;
			}
			
			}return false;	
		}
	
	
	//partida
	//iniciar la partida
		public static void iniciarPartida() {
			intentosconsumidos=0;
			letrasadivinadas=0;
		}
		
		
		public static void jugarPartida() {
			System.out.println("Bienvenido al juego de Wordle");
			System.out.println("El objetivo es descubrir la palabra oculta de 5\n"
					+ "letras.");
			while(!haTerminadoJuego()) {
				System.out.println("introduzca la palabra de 5 letras: ");
				String palaIntroducida=entrada.nextLine().toLowerCase(); 
				if(Correct(palaIntroducida)) {
					//funcion comprobar que letras se han acertado
					String resultado=compruebaLetrasAcertadas(palaIntroducida);
					System.out.println(resultado);
					if(haGanadoJugador()) {
						System.out.println("Felicidadesssss ganaste");
					}else {
						intentosconsumidos++;
					}
				}else {
					System.out.println("La palabra introducida no es valida");
				}
			}if(!haGanadoJugador()) {
				System.out.println("has perdido colega");
			}
			System.out.println();
		}
		public static String compruebaLetrasAcertadas(String palaIntroducida) {
			String resultado="";
			for(int i=0;i<secreta.length();i++) {
				//letra del usuario
				char letraU=palaIntroducida.charAt(i);
				//letra de la palabra secreta
				char letraS=secreta.charAt(i);
				//
				if(letraU==letraS) {
					//resultado.
					//letrasadivinadas++;
				}else if(secreta.contains(String.valueOf(letraU))){
					
				}else {
					//resultado

				}
			}return resultado;
		}
	
	 public static boolean haGanadoJugador() {
	        return numPalabraAcertadas== secreta.length();
	    }

	    public static boolean haTerminadoJuego() {
	        return intentos >= 6 || haGanadoJugador();
	    }
	}

