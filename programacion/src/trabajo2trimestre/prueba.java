package trabajo2trimestre;

import java.util.Random;
import java.util.Scanner;

public class prueba {

		    // Variables globales
		    private static String palabraSecreta;
		    private static int numIntentosConsumidos;
		    private static int numLetrasAdivinadas;
		    public static Scanner scanner= new Scanner(System.in);;

		    public static void main(String[] args) { 

		        System.out.println("Bienvenid@ al juego de Wordle.");
		        System.out.println("El objetivo es descubrir la palabra oculta de 5 letras.");

		        do {
		            jugarPartida();
		            mostrarResultado();
		            System.out.println("¿Deseas jugar otra partida? (s/n)");
		        } while (scanner.next().equalsIgnoreCase("s"));

		        System.out.println("Fin del juego.");
		    }

		    public static void jugarPartida() {
		        palabraSecreta = generaPalabra();
		        numIntentosConsumidos = 0;
		        numLetrasAdivinadas = 0;

		        while (!haTerminadoJuego() && !haGanadoJugador()) {
		            System.out.println("Introduce una palabra de 5 letras:");
		            String intento = scanner.next().toLowerCase();

		            if (validarEntrada(intento)) {
		                String resultado = compruebaLetrasAcertadas(intento);
		                System.out.println(resultado);
		                numIntentosConsumidos++;
		            } else {
		                System.out.println("Entrada no válida. Inténtalo de nuevo.");
		            }
		        }
		    }

		    public static boolean validarEntrada(String palabra) {
		        return palabra.matches("[a-z]{5}") &&
		               palabra.matches(".*[aeiou].*[aeiou].*[aeiou].*") &&
		               !palabra.matches(".*[aeiou]{2}.*") &&
		               !palabra.matches(".*[^aeiou]{4}.*") &&
		               !palabra.matches(".*[qwxQWX]$");
		    }

		    public static String compruebaLetrasAcertadas(String intento) {
		        StringBuilder resultado = new StringBuilder();

		        for (int i = 0; i < 5; i++) {
		            char letraIntento = intento.charAt(i);
		            char letraSecreta = palabraSecreta.charAt(i);

		            if (letraIntento == letraSecreta) {
		                resultado.append(Character.toUpperCase(letraIntento));
		                numLetrasAdivinadas++;
		            } else if (palabraSecreta.contains(String.valueOf(letraIntento))) {
		                resultado.append(Character.toLowerCase(letraIntento));
		            } else {
		                resultado.append("*");
		            }
		        }

		        return resultado.toString();
		    }

		    public static boolean haGanadoJugador() {
		        return numLetrasAdivinadas == 5;
		    }

		    public static boolean haTerminadoJuego() {
		        return numIntentosConsumidos == 6;
		    }

		    public static String generaPalabra() {
		        String[] palabras = {"manzana", "perro", "gato", "fuego", "lugar", "leche", "cabra", "rojo", "azul", "verde",
		                "tabla", "techo", "tigre", "zapato", "café", "naranja", "hoja", "libro", "flor", "agua"};
		        Random random = new Random();
		        return palabras[random.nextInt(palabras.length)];
		    }

		    public static void mostrarResultado() {
		        if (haGanadoJugador()) {
		            System.out.println("¡Has ganado la partida!");
		        } else {
		            System.out.println("Has perdido la partida");
		        }

		        System.out.println("Tú: " + (haGanadoJugador() ? "1" : "0") + " puntos vs Máquina: " + (haGanadoJugador() ? "0" : "1") + " punto");
		        System.out.println("Total de partidas: 1");
		    }
		}
