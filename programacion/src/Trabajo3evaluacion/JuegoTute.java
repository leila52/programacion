package Trabajo3evaluacion;

import java.util.ArrayList;
import java.util.Scanner;

public class JuegoTute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Baraja baraja = new Baraja(1, true);
        int puntosJugador = 0;
        int puntosComputadora = 0;

        System.out.println("¡Bienvenido al juego del Tute!");

        // Repartir cartas al jugador y a la computadora
        ArrayList<Carta> manoJugador = new ArrayList<>();
        ArrayList<Carta> manoComputadora = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            manoJugador.add(baraja.robar());
            manoComputadora.add(baraja.robar());
        }

        System.out.println("Tus cartas: " + manoJugador);
        System.out.println("Cartas de la computadora: " + manoComputadora);

        // Calcular puntos del jugador y la computadora
        puntosJugador = calcularPuntos(manoJugador);
        puntosComputadora = calcularPuntos(manoComputadora);

        // Mostrar puntos iniciales
        System.out.println("Tus puntos: " + puntosJugador);
        System.out.println("Puntos de la computadora: " + puntosComputadora);

        // Determinar ganador
        if (puntosJugador > puntosComputadora) {
            System.out.println("¡Has ganado!");
        } else if (puntosComputadora > puntosJugador) {
            System.out.println("¡Has perdido!");
        } else {
            System.out.println("¡Ha habido un empate!");
        }
    }

    public static int calcularPuntos(ArrayList<Carta> mano) {
        int puntos = 0;
        for (Carta carta : mano) {
            puntos += carta.getValoreTute();
        }
        return puntos;

	}

}
