package Trabajo3evaluacion;


import java.util.Scanner;

public class juegoescoba {
	    static Scanner in = new Scanner(System.in);

	    public static void main(String[] args) {
	        boolean continuarjuego = true;
	        while (continuarjuego) {
	            // Creamos dos jugadores
	            Jugador j1 = new Jugador();
	            Jugador j2 = new Jugador();
	            // Creamos la baraja
	            Baraja baraja = new Baraja(1, true);
	            // Repartir cartas
	            repartircartas(j1, j2, baraja);

	            // Mostrar estado inicial del juego
	            System.out.println("---------- ESCOBA ----------");
	            mostrarresultados(j1, j2);
	            System.out.println("-----------------------------");

	            // Iniciar el juego
	            while (!baraja.estaVacia() && continuarjuego) {
	                // Turno del Jugador 1
	                System.out.println("Turno del Jugador 1:");
	                jugarturno(j1, j2, baraja);
	                // Turno del Jugador 2
	                if (!baraja.estaVacia() && continuarjuego) {
	                    System.out.println("Turno del Jugador 2:");
	                    jugarturno(j2, j1, baraja);
	                }
	            }

	            // Mostrar resultado final del juego
	            System.out.println("¡Fin del juego!");
	            System.out.println("¿Quieres jugar otra partida? (s/n)");
	            String respuesta = in.nextLine().toLowerCase();
	            if (!respuesta.equals("s")) {
	                continuarjuego = false;
	            }
	        }
	    }

	    public static void repartircartas(Jugador j1, Jugador j2, Baraja baraja) {
	        // Se reparten tres cartas
	        for (int i = 0; i < 3; i++) {
	            j1.agregarCartaAlaMano(baraja.robar());
	            j2.agregarCartaAlaMano(baraja.robar());
	        }
	    }

	    public static void mostrarresultados(Jugador j1, Jugador j2) {
	        System.out.println("El jugador 1 tiene en su mano:");
	        j1.getCartasEnSuMano();
	        System.out.println("Puntos del jugador 1: " + j1.CalcularPuntos());
	        System.out.println();
	        System.out.println("El jugador 2 tiene en su mano:");
	        j2.getCartasEnSuMano();
	        System.out.println("Puntos del jugador 2: " + j2.CalcularPuntos());
	    }

	    public static void jugarturno(Jugador jugador1, Jugador jugador2, Baraja baraja) {
	        if (jugador1.getCartasEnSuMano().isEmpty()) {
	            System.out.println("El jugador 1 no tiene cartas en su mano.");
	            return;
	        }
	        System.out.println("Las cartas en tu mano son:");
	        jugador1.getCartasEnSuMano();
	        System.out.println();
	        // Elegir qué carta jugar
	        System.out.println("Elige una carta para jugar (1-" + jugador1.getCartasEnSuMano().size() + "):");
	        int indiceCarta = Integer.parseInt(in.nextLine()) - 1;
	        if (indiceCarta < 0 || indiceCarta >= jugador1.getCartasEnSuMano().size()) {
	            System.out.println("Índice de carta inválido.");
	            return;
	        }
	        Carta cartaJugada = jugador1.getCartasEnSuMano().get(indiceCarta);
	        // Jugar la carta seleccionada
	        jugador1.jugarcarta(cartaJugada);
	        // Mostrar estado actual
	        mostrarresultados(jugador1, jugador2);
	    }
	}



