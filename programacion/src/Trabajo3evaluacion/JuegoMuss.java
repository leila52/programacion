package Trabajo3evaluacion;

import java.util.Scanner;

public class JuegoMuss {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Baraja baraja = new Baraja(1, true);
        double puntuacionJugador = 0;
        double puntuacionComputadora = 0;

        System.out.println("¡Bienvenido al juego del Mus!");

        // Repartir cartas al jugador y a la computadora
        Carta cartaJugador1 = baraja.robar();
        Carta cartaJugador2 = baraja.robar();
        Carta cartaComputadora1 = baraja.robar();
        Carta cartaComputadora2 = baraja.robar();

        System.out.println("Tus cartas: " + cartaJugador1.getNombrecarta() + " y " + cartaJugador2.getNombrecarta());
        System.out.println("Carta de la computadora: " + cartaComputadora1.getNombrecarta());

        // Sumar los valores de las cartas del jugador y de la computadora
        puntuacionJugador = cartaJugador1.getValorMus() + cartaJugador2.getValorMus();
        puntuacionComputadora = cartaComputadora1.getValorMus() + cartaComputadora2.getValorMus();

        // Mostrar las puntuaciones iniciales
        System.out.println("Tu puntuación: " + puntuacionJugador);
        System.out.println("Puntuación de la computadora: " + puntuacionComputadora);

        // Turno del jugador
        boolean continuarJugando = true;
        while (continuarJugando) {
            System.out.println("¿Quieres pedir carta o plantarte? (pedir/plantar)");
            String respuesta = scanner.nextLine().toLowerCase();

            if (respuesta.equals("pedir")) {
                Carta nuevaCarta = baraja.robar();
                System.out.println("Has robado la carta: " + nuevaCarta.getNombrecarta());
                puntuacionJugador += nuevaCarta.getValorMus();
                System.out.println("Tu puntuación: " + puntuacionJugador);
                if (puntuacionJugador > 31) {
                    System.out.println("¡Te has pasado de 31! Has perdido.");
                    continuarJugando = false;
                }
            } else if (respuesta.equals("plantar")) {
                continuarJugando = false;
            } else {
                System.out.println("Respuesta no válida. Por favor, ingresa 'pedir' o 'plantar'.");
            }
        }

        // Turno de la computadora
        while (puntuacionComputadora < 27 && puntuacionComputadora < puntuacionJugador) {
            Carta nuevaCarta = baraja.robar();
            System.out.println("La computadora ha robado la carta: " + nuevaCarta.getNombrecarta());
            puntuacionComputadora += nuevaCarta.getValorMus();
            System.out.println("Puntuación de la computadora: " + puntuacionComputadora);
        }

        // Determinar el ganador
        if ((puntuacionJugador <= 31 && puntuacionJugador > puntuacionComputadora) || puntuacionComputadora > 31) {
            System.out.println("¡Has ganado! Tu puntuación es mayor que la de la computadora.");
        } else if ((puntuacionComputadora <= 31 && puntuacionComputadora > puntuacionJugador) || puntuacionJugador > 31) {
            System.out.println("¡Has perdido! La puntuación de la computadora es mayor que la tuya.");
        } else {
            System.out.println("¡Ha habido un empate!");
        }

	}

}
