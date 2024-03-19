package Trabajo3evaluacion;

import java.util.Scanner;

public class Juego7yMedia1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Baraja baraja = new Baraja(1, true);
	        double puntuacionJugador = 0;
	        double puntuacionComputadora = 0;
	        boolean continuarJugando = true;

	        while (continuarJugando) {
	            System.out.println("Tu puntuación: " + puntuacionJugador);
	            System.out.println("¿Quieres otra carta? (s/n)");
	            String respuesta = scanner.nextLine().toLowerCase();

	            if (respuesta.equals("s")) {
	                Carta cartaJugador = baraja.robar();
	                System.out.println("Has robado la carta: " + cartaJugador.getNombrecarta());
	                puntuacionJugador += cartaJugador.getValor7yMedia();
	                if (puntuacionJugador > 7.5) {
	                    System.out.println("¡Te has pasado de 7 y media!");
	                    continuarJugando = false;
	                } else {
	                    Carta cartaComputadora = baraja.robar();
	                    puntuacionComputadora += cartaComputadora.getValor7yMedia();
	                    System.out.println("La computadora ha robado la carta: " + cartaComputadora.getNombrecarta());
	                }
	            } else if (respuesta.equals("n")) {
	                continuarJugando = false;
	            } else {
	                System.out.println("Respuesta no válida. Por favor, ingresa 's' o 'n'.");
	            }
	        }

	        System.out.println("Puntuación del jugador: " + puntuacionJugador);
	        System.out.println("Puntuación de la computadora: " + puntuacionComputadora);
	         if (puntuacionComputadora > 7.5) {
	            System.out.println("¡Has ganado! La computadora se ha pasado de 7 y media.");
	        } else if (Math.abs(7.5 - puntuacionJugador) < Math.abs(7.5 - puntuacionComputadora)) {
	            System.out.println("¡Has ganado! Estás más cerca de 7 y media que la computadora.");
	        } else if (Math.abs(7.5 - puntuacionJugador) > Math.abs(7.5 - puntuacionComputadora)) {
	            System.out.println("¡Has perdido! La computadora está más cerca de 7 y media que tú.");
	        } else {
	            System.out.println("¡Empate! Ambos están a la misma distancia de 7 y media.");
	        }
	}

}
