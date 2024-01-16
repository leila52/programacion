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
	public String letra="";
	static char jugarOtraPartida=' ';
	public static void main(String[] args) {
		
		generaPalabra();
		char jugarOtraPartida=' ';
		
		do {
			iniciarPartida();
			jugarPartida();
			System.out.println("total de partidad 1");
			if(!haGanadoJugador()) {
			System.out.println("deseas jugar otra partida s/n");
			jugarOtraPartida=entrada.next().charAt(0);			
			}
			
		}while(jugarOtraPartida =='s');
		System.out.println("Fin del juego");
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
		if(!contienevocal(cad)&&(contarVocal(cad)==2 || contarVocal(cad)==3) )
			return false;
		/*en caso q no sea correcta*/
		return true;
		
	}
	/*Debe tener exactamente 5 letras.*/
	public static boolean cont5Letra(String cad) {
		return cad.length()==5;			
	}
	/**/
	public static boolean contsoloLetras(String cad) {
		for(int i=0;i<cad.length();i++) {
			char cara=cad.charAt(i);
			//si no es una letra devuelve false
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
			//devuelve true si la cade contiene espacios
		return cad.contains(" ");
		}
	
	
	//partida
	//iniciar la partida
		public static void iniciarPartida() {
			intentosconsumidos=1;
			letrasadivinadas=0;
		}
		
		
		public static void jugarPartida() {
			System.out.println("Bienvenido al juego de Wordle");
			System.out.println("El objetivo es descubrir la palabra oculta de 5\n"
					+ "letras.");
			do {
				while(!haGanadoJugador() && intentosconsumidos<=6) {
				System.out.println("introduzca la palabra de 5 letras: ");
				String palaIntroducida=entrada.nextLine().toLowerCase(); 
				if(Correct(palaIntroducida)) {
					//funcion comprobar que letras se han acertado
					String resultado=compruebaLetrasAcertadas(palaIntroducida);
					System.out.println(resultado);
					if(haGanadoJugador()&& intentosconsumidos<6) {
						System.out.println("Felicidadesssss ganaste");
					}else {
						intentosconsumidos++;
					}
				}else {
					System.out.println("La palabra introducida no es valida,porfavor siga las normas del juego si no seguiras perdiendo itentos");
				}
				}
			}while(!haTerminadoJuego() || !haGanadoJugador());
			if(!haGanadoJugador()) {
				System.out.println("has perdido colega");
			}
		}
		public static String compruebaLetrasAcertadas(String palaIntroducida) {
			String[] palabra2=new String[palaIntroducida.length()];
			String result="";
			palaIntroducida=palaIntroducida.toLowerCase();
			for(int i=0;i<palaIntroducida.length();i++) {
				String letra="";
				letra+=palaIntroducida.charAt(i);
				//primer caso
				if(palaIntroducida.charAt(i)==secreta.charAt(i)&& secreta.contains(letra) && intentosconsumidos<=6) {
					palabra2[i]=letra.toUpperCase();
					
				}//segundo caso
				if(secreta.contains(letra)&&(palaIntroducida.charAt(i)!=secreta.charAt(i))) {
					palabra2[i]=letra.toLowerCase();
				}
				if(!secreta.contains(letra) &&(palaIntroducida.charAt(i)!=secreta.charAt(i))) {
					palabra2[i]="*";
				}result+=palabra2[i];
			}
			return result;
		}
		//calcular cuantas veces se repite cada letra en la palabra introducida
		public static int[] repeticionesPalbraIntroducida(String palaIntroducida) {
			int[] repeticiones =new int[palaIntroducida.length()];
			for(int i=0;i<palaIntroducida.length();i++) {
				for(int j=0;j<palaIntroducida.length();j++) {
					if(palaIntroducida.charAt(i)==palaIntroducida.charAt(j)){
						repeticiones[i]++;
					}	
				}
			}return repeticiones;
		}
		//contar las veces se repite cada letra en la palabra secreta
		public static int repeticionesPlabraSecreta(char letra) {
			int repeticiones=0;
			for(int i=0;i<secreta.length();i++) {
				if(secreta.charAt(i)==letra) {
					repeticiones++;
				}
			}return repeticiones;
		}
		//comprobar si se repite una letra en la palabra secreta
		public static boolean RepitePalabraSecreta(char letra) {
			//contador
			int cont=0;
			for(int i=0;i<secreta.length();i++) {
				if(secreta.charAt(i)==letra) {
					cont++;
				}
			}
			if(cont>1) {
				return true;
			}
			return false;
		}
		//comprobar si se repite una letra en la palabra introducida
		public static boolean RepitePalabraIntroducida(String palaIntroducida, int posicion) {
			if(palaIntroducida.indexOf(palaIntroducida.charAt(posicion)) == palaIntroducida.lastIndexOf(palaIntroducida.charAt(posicion))) {
				return false;
			}
			return true;
		}
		//comprobar si ya ha salido una letra determinada
		public static boolean haSalidoANTES(String palaIntroducida, char letra, int posicion) {
			for(int i= posicion -1;i>=0;i--) {
				if(palaIntroducida.charAt(i)==letra) {
					return true;
				}
			}return false;
		}
		//comprobar si hay alguna letra en la posicion correcta
		public static boolean hayAlgunaPosicionCOrrect(String palaIntroducida, char letra) {
			for(int i=0;i<secreta.length();i++) {
				if(secreta.charAt(i)==letra  &&  secreta.charAt(i)==palaIntroducida.charAt(i)) {
					return true;
				}
			}return false;
		}
	
	 public static boolean haGanadoJugador() {
	        return numPalabraAcertadas== secreta.length();
	    }

	    public static boolean haTerminadoJuego() {
	        return intentos >= 6 || haGanadoJugador();
	    }
	}
