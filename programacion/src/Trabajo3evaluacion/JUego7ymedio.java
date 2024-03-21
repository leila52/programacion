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
			if(resp.equals("s")) {
				Carta cartaJugador = baraja.robar();
				System.out.println("has robado la carta:"+cartaJugador.getNombrecarta());
				puntosJugador+=cartaJugador.getValor7yMedia();
				 System.out.println("Tu puntuación: " + puntosJugador);
				 if(puntosJugador>7.5) {
					 estadisticas();
					 continuarJuego= false;
				 }else {
					 Carta cartaOrdenador = baraja.robar();
					 System.out.println("ordenador ha robado la carta:"+cartaOrdenador.getNombrecarta());
					 puntosordenador+=cartaOrdenador.getValor7yMedia();
					 System.out.println("puntuación del ordenador : " + puntosordenador);
					 //se asegura q no se pase
					 if(puntosordenador>7.5) {
						 estadisticas();
						 continuarJuego= false;
					 }
					 
				 }
				 
			}
			//para salir
			else if(resp.equals("n")) {
				estadisticas();
				continuarJuego=false;
				
			}else
				System.out.println("respuesta no valida ingrese nuevamente");
			
			
			
            
    		
	        
		}
		
	}
	public static void estadisticas() {
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
