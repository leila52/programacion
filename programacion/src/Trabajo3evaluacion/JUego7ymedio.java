package Trabajo3evaluacion;

import java.util.Scanner;

public class JUego7ymedio {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		Baraja baraja=new Baraja(1,true);
		double puntosJugador=0;
		double puntosordenador=0;
		boolean continuarJuego=true;

		while(continuarJuego==true) {
			System.out.println("bienvenido al juego de 7 y media:");
			Carta cartaJugador = baraja.robar();
		    Carta cartaOrdenador = baraja.robar();
		    puntosJugador += cartaJugador.getValor7yMedia();
		    puntosordenador+=cartaOrdenador.getValor7yMedia();
	        System.out.println("Carta del jugador: " + cartaJugador.getNombrecarta());
	        System.out.println("Puntos del jugador: " + puntosJugador);
	        System.out.println("Carta del ordenador: " + cartaOrdenador.getNombrecarta());
	        System.out.println("Puntos del jugador: " + puntosordenador);
	        System.out.println("¿Quieres otra carta? (s/n)");
            String respuesta = entrada.nextLine().toLowerCase();

            if (respuesta.equals("s")) {
                cartaJugador = baraja.robar();
                System.out.println("Has robado la carta: " + cartaJugador.getNombrecarta());
                puntosJugador += cartaJugador.getValor7yMedia();
                if (puntosJugador > 7.5) {
                    System.out.println("¡Te has pasado de 7 y media!");
                    continuarJuego = false;
                } else {
                    cartaOrdenador= baraja.robar();
                    puntosordenador += cartaOrdenador.getValor7yMedia();
                    System.out.println("La computadora ha robado la carta: " + cartaOrdenador.getNombrecarta());
                }
            } else if (respuesta.equals("n")) {
                continuarJuego = false;
            } else {
                System.out.println("Respuesta no válida. Por favor, ingresa 's' o 'n'.");
            }
            if (puntosJugador > 7.5 && puntosordenador > 7.5) {
                System.out.println("Ambos jugadores se han pasado de 7.5. ¡Es un empate!");
            } else if (puntosJugador > 7.5) {
                System.out.println("¡El jugador se ha pasado de 7.5! El ordenador gana.");
            } else if (puntosordenador > 7.5) {
                System.out.println("¡El ordenador se ha pasado de 7.5! El jugador gana.");
            } else if (puntosJugador > puntosordenador) {
                System.out.println("¡El jugador gana!");
            } else if (puntosordenador > puntosJugador) {
                System.out.println("¡El ordenador gana!");
            } else {
                System.out.println("¡Es un empate!");
            }
    		
	        
		}
		
		

	    // Verifica si la carta del jugador es nula antes de usarla
	   
        
        /*
        cartaJugador = baraja.robar();
        puntosJugador += cartaJugador.getValor7yMedia();
        System.out.println("Carta del jugador: " + cartaJugador.getNombrecarta());
        System.out.println("Puntos del jugador: " + puntosJugador);
        
       */
	    
        	//estadisticas
        

	}

}
