package Trabajo3evaluacion;

import java.util.Scanner;

public class JUego7ymedio {
	static Scanner entrada=new Scanner(System.in);
	static double puntosJugador=0;
	static double puntosordenador=0;
	public static void main(String[] args) {
		Baraja baraja=new Baraja(1,true);
		
		boolean continuarJuego=true;

		while(continuarJuego==true) {
			System.out.println("bienvenido al juego de 7 y media:");
			System.out.println("quieres una carta? s/n");
			String resp=entrada.nextLine().toLowerCase();
			if (resp.equals("s")) {
                Carta cartaJugador = baraja.robar();
                System.out.println("Has robado la carta: " + cartaJugador.getNombrecarta());
                puntosJugador += cartaJugador.getValor7yMedia();
                System.out.println("tu puntuacion: " + puntosJugador);

                if (puntosJugador > 7.5) {
                    System.out.println("te has pasado de 7.5, es turno del ordenador!");
                    jugarOrdenador(baraja);
                    continuarJuego = false;
                }
            } else if (resp.equals("n")) {
                System.out.println("has decidido parar sera el turno del ordenador!");
                jugarOrdenador(baraja);
                continuarJuego = false;
            } else {
                System.out.println("Respuesta erronea introduce 's' para si o 'n' para no");
            }
        }
    }

    public static void jugarOrdenador(Baraja baraja) {
        while (puntosordenador <= 7 && puntosordenador <= puntosJugador) {
            Carta cartaOrdenador = baraja.robar();
            System.out.println("ordenador ha robado la carta: " + cartaOrdenador.getNombrecarta());
            puntosordenador += cartaOrdenador.getValor7yMedia();
            System.out.println("puntos del ordenador: " + puntosordenador);
        }
        estadisticas();
    }

	public static void estadisticas() {
		if (puntosJugador > 7.5 && puntosordenador > 7.5) {
            System.out.println("ambos se han pasado de 7.5 empate , gana la banca(ia)");
        } else if (puntosJugador > 7.5) {
            System.out.println("El jugador se ha pasado de 7.5. El ordenador gana la proxima sera");
        } else if (puntosordenador > 7.5) {
            System.out.println("¡El ordenador se ha pasado de 7.5  el jugador gana ole ole ole ");
        } else if (puntosJugador > puntosordenador) {
            System.out.println("¡El jugador gana ole ole ole");
        } else if (puntosordenador > puntosJugador) {
            System.out.println("el ordenador gana lo siento jugador la proxima sera");
        } 
	}

        

	

}
