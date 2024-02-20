package travajoevaluacion;

import java.util.Random;
import java.util.Scanner;

public class UsoTresEnRaya {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
        TresEnRaya juego = new TresEnRaya();
        jugadorvsmaquina(juego);
	}
       

        
	
	//caso de jugador vs maquina
        public static void jugadorvsjugado(TresEnRaya juego) {
        	 int turno = new Random().nextInt(2) + 1; // Decidir aleatoriamente quién empieza
             int jugador = 1;
             while (juego.quedanMovimientos() && !juego.ganaJugador1() && !juego.ganaJugador2()) {
                juego.dibujaTablero();
                if (turno == 1) {
                    jugador = 1;
                } else {
                    jugador = 2;
                }

                if (jugador == 1) {
                    System.out.print("Jugador 1 (X), elige una casilla (1-9): ");
                    int pos = entrada.nextInt();
                    if (juego.movimientoValido(pos)) {
                        juego.mueveJugador1(pos);
                        turno = 2;
                    } else {
                        System.out.println("Casilla ocupada. Inténtalo de nuevo.");
                    }
                } else {
                    System.out.print("Jugador 2 (O), elige una casilla (1-9): ");
                    int pos = entrada.nextInt();
                    if (juego.movimientoValido(pos)) {
                        juego.mueveJugador2(pos);
                        turno = 1;
                    } else {
                        System.out.println("Casilla ocupada. Inténtalo de nuevo.");
                    }
                }

                // Comprobar si algún jugador ganó
                if (juego.ganaJugador1()) {
                    juego.dibujaTablero();
                    System.out.println("¡Jugador 1 (X) ha ganado!");
                    break;
                } else if (juego.ganaJugador2()) {
                    juego.dibujaTablero();
                    System.out.println("¡Jugador 2 (O) ha ganado!");
                    break;
                }
            }

            if (!juego.ganaJugador1() && !juego.ganaJugador2()) {
                juego.dibujaTablero();
                System.out.println("¡Empate!");
            }
        }
        public static void jugadorvsmaquina(TresEnRaya juego) {
        	 int turno = 1;
             while (juego.quedanMovimientos() && !juego.ganaJugador1() && !juego.ganaJugador2()) {
                 juego.dibujaTablero();

                 int jugador = (turno == 1) ? 1 : 2;
                 if (jugador == 1) {
                     System.out.print("Jugador " + jugador + " (X), elige una casilla (1-9): ");
                     int pos = entrada.nextInt();
                     if (juego.movimientoValido(pos)) {
                         juego.mueveJugador1(pos);
                         turno = 2;
                     } else {
                         System.out.println("Casilla ocupada. Inténtalo de nuevo.");
                     }
                 } else {
                     juego.mueveOrdenador2();
                     turno = 1;
                 }

                 if (juego.ganaJugador1()) {
                     juego.dibujaTablero();
                     System.out.println("¡Jugador 1 (X) ha ganado!");
                     break;
                 } else if (juego.ganaJugador2()) {
                     juego.dibujaTablero();
                     System.out.println("¡La Máquina ha ganado!");
                     break;
                 }
             }
             if (!juego.ganaJugador1() && !juego.ganaJugador2()) {
                 juego.dibujaTablero();
                 System.out.println("¡Empate!");
             }
        }
        public static void maquinavsmaquina(TresEnRaya juego) {
        	int turno = 1;
            while (juego.quedanMovimientos() && !juego.ganaJugador1() && !juego.ganaJugador2()) {
                int jugador = (turno == 1) ? 1 : 2;
                if (jugador == 1) {
                    juego.mueveOrdenador1();
                    turno = 2;
                } else {
                    juego.mueveOrdenador2();
                    turno = 1;
                }

                if (juego.ganaJugador1()) {
                    juego.dibujaTablero();
                    System.out.println("¡La Máquina 1 ha ganado!");
                    break;
                } else if (juego.ganaJugador2()) {
                    juego.dibujaTablero();
                    System.out.println("¡La Máquina 2 ha ganado!");
                    break;
                }
            }
            if (!juego.ganaJugador1() && !juego.ganaJugador2()) {
                juego.dibujaTablero();
                System.out.println("¡Empate!");
            }
        }
}
