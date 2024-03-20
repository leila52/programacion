package Trabajo3evaluacion;

import java.util.Scanner;

public class usoCarta {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		Carta c =new Carta(8,2);
		System.out.println(c.getNombrecarta());
		
		Baraja baraja=new Baraja(1,true);
		double puntosJugador=0;
		double puntosordenador=0;
		boolean continuarJuego=true;

		while(continuarJuego==true) {
			System.out.println("bienvenido al juego de 7 y media:");
			System.out.println();
		}
		
		Carta cartaJugador = baraja.robar();
	    Carta cartaOrdenador = baraja.robar();

	    // Verifica si la carta del jugador es nula antes de usarla
	   
        puntosJugador += cartaJugador.getValor7yMedia();
        System.out.println("Carta del jugador: " + cartaJugador.getNombrecarta());
        System.out.println("Puntos del jugador: " + puntosJugador);
        
        cartaJugador = baraja.robar();
        puntosJugador += cartaJugador.getValor7yMedia();
        System.out.println("Carta del jugador: " + cartaJugador.getNombrecarta());
        System.out.println("Puntos del jugador: " + puntosJugador);
        
       
	    
        	//estadisticas
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

}
