package trabajo2trimestre;

import java.util.Random;
import java.util.Scanner;

public class prueba2 {
	 private static String palabraSecreta;
	    private static int numIntentosConsumidos;
	    private static int numLetrasAdivinadas;
	    private static final int MAX_INTENTOS = 6;
	    private static final String[] PALABRAS = {"novio","coche","letra","hueco","casco","tecla","piano",
				"pollo","tocar","beber","carta","oveja","abeja","matar","libro","torre","final","rezar","pecar","crema"};
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        char jugarOtraPartida;

	        do {
	            iniciarJuego();
	            jugarPartida(scanner);

	            System.out.println("Total de partidas: 1");
	            System.out.print("¿Deseas jugar otra partida? (s/n): ");
	            jugarOtraPartida = scanner.next().charAt(0);

	        } while (jugarOtraPartida == 's' || jugarOtraPartida == 'S');

	        System.out.println("Fin del juego");
	    }

	    private static void iniciarJuego() {
	        palabraSecreta = generaPalabra();
	        numIntentosConsumidos = 0;
	        numLetrasAdivinadas = 0;
	    }

	    private static void jugarPartida(Scanner scanner) {
	        System.out.println("Bienvenid@ al juego de Wordle.");
	        System.out.println("El objetivo es descubrir la palabra oculta de 5 letras.");

	        while (!haTerminadoJuego()) {
	            System.out.printf("Introduce una palabra de 5 letras (%d intento(s) restante(s)):\n> ", MAX_INTENTOS - numIntentosConsumidos);
	            String palabraUsuario = scanner.next().toLowerCase();

	            if (validarPalabra(palabraUsuario)) {
	                String resultado = compruebaLetrasAcertadas(palabraUsuario);
	                System.out.println(resultado);

	                if (haGanadoJugador()) {
	                    System.out.println("¡Felicidades! Has ganado la partida.");
	                    break;
	                } else {
	                    numIntentosConsumidos++;
	                }
	            } else {
	                System.out.println("La palabra introducida no es válida. Por favor, sigue las reglas.");
	            }
	        }

	        if (!haGanadoJugador()) {
	            System.out.println("Has perdido la partida");
	        }

	        System.out.printf("Tú: 0 puntos vs Máquina: 1 punto%n");
	    }

	    private static boolean haTerminadoJuego() {
	        return numIntentosConsumidos >= MAX_INTENTOS || haGanadoJugador();
	    }

	    private static boolean haGanadoJugador() {
	        return numLetrasAdivinadas == palabraSecreta.length();
	    }

	    private static String compruebaLetrasAcertadas(String palabraUsuario) {
	        StringBuilder resultado = new StringBuilder();

	        for (int i = 0; i < palabraSecreta.length(); i++) {
	            char letraUsuario = palabraUsuario.charAt(i);
	            char letraSecreta = palabraSecreta.charAt(i);

	            if (letraUsuario == letraSecreta) {
	                resultado.append(Character.toUpperCase(letraUsuario));
	                numLetrasAdivinadas++;
	            } else if (palabraSecreta.contains(String.valueOf(letraUsuario))) {
	                resultado.append(Character.toLowerCase(letraUsuario));
	            } else {
	                resultado.append('*');
	            }
	        }

	        return resultado.toString();
	    }

	    private static String generaPalabra() {
	        Random random = new Random();
	        return PALABRAS[random.nextInt(PALABRAS.length)];
	    }

	    private static boolean validarPalabra(String palabra) {
	        return palabra.length() == 5 &&
	                palabra.matches("[a-zA-Z]+") &&
	                palabra.replaceAll("[aeiouAEIOU]", "").length() >= 2 &&
	                palabra.replaceAll("[aeiouAEIOU]+", "").length() <= 3 &&
	                !palabra.matches(".*[qQwWxX]$") &&
	                !palabra.matches(".*[aeiouAEIOU]{2,}.*") &&
	                !palabra.matches(".*[^a-zA-Z].*");
	    }
	}
