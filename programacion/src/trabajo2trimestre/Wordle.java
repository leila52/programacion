package trabajo2trimestre;

import java.util.Random;
import java.util.Scanner;

public class Wordle {
	static Scanner entrada=new Scanner(System.in);
	static String secreta="";
	static String secreta2="";
	static int intentos=6;
	static int intentosconsumidos1;
	static int intentosconsumidos2;
	static int letrasadivinadas;
	static int numPalabraAcertadas=0;
	static int contGanadasjugador1=0;
	static int contPerdidas1=0;
	static int contGanadasjugador2=0;
	static int contPerdidas2=0;
	static char[] vocal= {'a','e','i','o','u'};
	public String letra="";
	static char jugarOtraPartida=' ';
	public static void main(String[] args) {
		char jugarOtraPartida=' ';
		do {
			generaPalabra();
			System.out.println("Bienvenido al juego de Wordle");
			System.out.println("El objetivo es descubrir la palabra oculta de 5\n"+ "letras.");
			System.out.println("quiere jugar una partida");
			String opcion="";
			do {
				//leemos opcion
				opcion=entrada.nextLine().toLowerCase();
				switch(opcion) {
				case "si":
					iniciarPartida();
					jugarPartida();
				break;
				case "no":
					System.out.println("hasta nunca colega");
					break;
					default://caso por defecto
						System.out.println("opccion no valida vuelva a introducirlo");
				}
		}while(!(opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("no")));
			System.out.println();
			System.out.println("Quiere jugar otra ves ? S/N");
			jugarOtraPartida=entrada.nextLine().charAt(0);
		}while(jugarOtraPartida == 'S' || jugarOtraPartida== 's');	
		if(jugarOtraPartida == 'N' || jugarOtraPartida== 'n') {
			System.out.println(" hasta luego");
		}
	}
	
	
	//general la palabra secreta
	public static void generaPalabra() {
		String [] palabras= {"novio","coche","letra","hueco","casco","tecla","piano",
				"pollo","tocar","beber","carta","oveja","abeja","matar","libro","torre","final","rezar","pecar","crema"};
		Random ale=new Random();
		int palalea=ale.nextInt(20);
		secreta=palabras[palalea];
		
		
	}
	public static void generaPalabra2() {
		String [] palabras= {"novio","coche","letra","hueco","casco","tecla","piano",
				"pollo","tocar","beber","carta","oveja","abeja","matar","libro","torre","final","rezar","pecar","crema"};
		Random ale=new Random();
		int palalea=ale.nextInt(20);
		secreta2=palabras[palalea];
		
		
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
		/*en caso q  sea correcta*/
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
			intentosconsumidos1=1;
			intentosconsumidos2=1;
			letrasadivinadas=0;
		}
		
		/*Este método contiene el bucle principal del juego, donde el jugador tiene la 
		 * oportunidad de adivinar la palabra secreta. Se utilizan otros métodos para validar 
		 * la entrada del jugador, verificar la validez de la palabra,
		 *  y proporcionar retroalimentación sobre las letras adivinadas.*/
		public static void jugarPartida() {
			String palaIntroducida="";
			String palajugador2="";
			
			
			do {
				while(!haGanadoJugador(palaIntroducida)&& !haGanadoJugador(palajugador2)  && intentosconsumidos1<=6 && intentosconsumidos2<=6) {
				System.out.println("introduzca la palabra de 5 letras jugador1: ");
				palaIntroducida=entrada.nextLine().toLowerCase(); 
				if(Correct(palaIntroducida)) {
					//funcion comprobar que letras se han acertado
					String resultado=compruebaLetrasAcertadas(palaIntroducida);
					System.out.println(resultado);
					if(haGanadoJugador(palaIntroducida)&& intentosconsumidos1<6) {
						System.out.println("Felicidadesssss ganaste");
						contGanadasjugador1++;
					}else {
						intentosconsumidos1++;
						System.out.println("le toca a jugador dos");
						System.out.println("introduzca la palabra de 5 letras jugador2: ");
						palajugador2=entrada.nextLine().toLowerCase(); 
						if(Correct(palajugador2)) {
							//funcion comprobar que letras se han acertado
							String resultado2=compruebaLetrasAcertadas2(palajugador2);
							System.out.println(resultado2);
							if(haGanadoJugador(palajugador2)&& intentosconsumidos2<6) {
								System.out.println("Felicidadesssss ganaste");
								contGanadasjugador2++;
							}else {
								intentosconsumidos2++;
				}
				}
					else {
					System.out.println("La palabra introducida no es valida,porfavor siga las normas del juego si no seguiras perdiendo itentos");
				}
				}
			}
				}
			}while(!haTerminadoJuego(palaIntroducida) && !haGanadoJugador(palaIntroducida) && !haTerminadoJuego(palajugador2) && !haGanadoJugador(palajugador2) );
			
			if(!haGanadoJugador(palaIntroducida)) {
				System.out.println("has perdido colega");
				contPerdidas1++;	
			}
			if(!haGanadoJugador(palajugador2)) {
				System.out.println("has perdido colega");
				contPerdidas2++;	
			}
		
		}
		
		/*compara la palabra introducida por el jugador con la palabra secreta y devuelve una cadena 
		 * que indica las letras acertadas. Utiliza varios métodos de verificación para gestionar las 
		 * diferentes condiciones (letras en la posición correcta, letras correctas en posición incorrecta, 
		 * letras incorrectas, etc.).*/
		public static String compruebaLetrasAcertadas(String palaIntroducida) {
			
			String resultadoPalabra = "";
			    int[] repeticiones = repeticionesPalbraIntroducida(palaIntroducida);

			    for (int i = 0; i < palaIntroducida.length(); i++) {
			    	// si la letra y posicion son correctas se mostrara la letra en mayuscula
			        if (palaIntroducida.charAt(i) == secreta.charAt(i)) {
			            resultadoPalabra += Character.toUpperCase(palaIntroducida.charAt(i));
			            letrasadivinadas++;
			        } 
			     // si la letra es correcta pero la posicon no se muestra la letra en minuscula
			        else if (secreta.contains("" + palaIntroducida.charAt(i))) {
			        	// si no se repite en la palabra introducida
			            if (!seRepitePalabraSecreta(palaIntroducida.charAt(i)) && !seRepitePalabraIntroducida(palaIntroducida, i)) {
			                resultadoPalabra += palaIntroducida.charAt(i);
			            }
			         // si no se repite en la secreta y si en la introducida
			          //primera ocurrencia (controlando que no haya ninguna en posicion correcta despues
			            else if (!haSalidoANTES(palaIntroducida, palaIntroducida.charAt(i), i) && !hayAlgunaPosicionCOrrect(palaIntroducida, palaIntroducida.charAt(i))) {
			                resultadoPalabra += palaIntroducida.charAt(i);
			            } 
			            //otra ocurrencia
			            else {
			                resultadoPalabra += '*';
			            }
			        }//si la letra no es correcta asterisco
			        else {
			            resultadoPalabra += '*';
			        }
			    }

			    return resultadoPalabra;
			}
		public static String compruebaLetrasAcertadas2(String palajugador2) {
			
			String resultadoPalabra = "";
			    int[] repeticiones = repeticionesPalbraIntroducida(palajugador2);

			    for (int i = 0; i < palajugador2.length(); i++) {
			    	// si la letra y posicion son correctas se mostrara la letra en mayuscula
			        if (palajugador2.charAt(i) == secreta2.charAt(i)) {
			            resultadoPalabra += Character.toUpperCase(palajugador2.charAt(i));
			            letrasadivinadas++;
			        } 
			     // si la letra es correcta pero la posicon no se muestra la letra en minuscula
			        else if (secreta2.contains("" + palajugador2.charAt(i))) {
			        	// si no se repite en la palabra introducida
			            if (!seRepitePalabraSecreta(palajugador2.charAt(i)) && !seRepitePalabraIntroducida(palajugador2, i)) {
			                resultadoPalabra += palajugador2.charAt(i);
			            }
			         // si no se repite en la secreta y si en la introducida
			          //primera ocurrencia (controlando que no haya ninguna en posicion correcta despues
			            else if (!haSalidoANTES(palajugador2,palajugador2.charAt(i), i) && !hayAlgunaPosicionCOrrect(palajugador2, palajugador2.charAt(i))) {
			                resultadoPalabra += palajugador2.charAt(i);
			            } 
			            //otra ocurrencia
			            else {
			                resultadoPalabra += '*';
			            }
			        }//si la letra no es correcta asterisco
			        else {
			            resultadoPalabra += '*';
			        }
			    }

			    return resultadoPalabra;
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
		public static boolean seRepitePalabraSecreta(char letra) {
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
		public static boolean seRepitePalabraIntroducida(String palaIntroducida, int posicion) {
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
	
	 public static boolean haGanadoJugador(String palaIntroducida) {
	        return palaIntroducida.equals(secreta);
	    }

	    public static boolean haTerminadoJuego(String palaIntroducida) {
	        return intentos >= 6 || haGanadoJugador(palaIntroducida);
	    }
	}
