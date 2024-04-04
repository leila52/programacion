package trabajo2trimestre;

import java.util.Random;
import java.util.Scanner;

public class usoTresenrayaModificacion {

	static  Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		TresEnRaya juego = new TresEnRaya();
        int opcion;

        do {
            menu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    jugarDosJugadores(juego);
                    break;
                case 2:
                    jugarContraMaquina(juego);
                    break;
                case 3:
                    jugarMaquinaVsMaquina(juego);
                    break;
                case 4:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);

	}
	public static void menu() {
		System.out.println("Elija una opcion:");
        System.out.println("1. jugador1 vs jugador2");
        System.out.println("2. Jugar vs la máquina");
        System.out.println("3. Máquina vs máquina");
        System.out.println("4. Salir");
	}
    public static void jugarDosJugadores(TresEnRaya juego) {
        juego.iniciarTablero();
        juego.dibujaTablero();
        // se inicia con 1
        int jugadorActual = 1;
        int posicion;
        while (juego.quedanMovimientos() && !juego.ganaJugador1() && !juego.ganaJugador2()) {
            System.out.println("turno del jugador " + jugadorActual);
            System.out.print("introduzca la posición del 1 al 9: ");
            posicion = entrada.nextInt();
            
            if (juego.movimientoValido(posicion)) {
                if (jugadorActual == 1) {
                    juego.mueveJugador1(posicion);
                    // cambiamos al jugador 2
                    jugadorActual = 2;
                } else {
                	//cambiamos de jugador
                    juego.mueveJugador2(posicion);
                    jugadorActual = 1;
                }

                juego.dibujaTablero();
            } else {
                System.out.println(" posicion no valida ya q ya hay una ficha vuelve a introducirlo");
            }
        }
        //estadisticas de gannas o perder
        if (juego.ganaJugador1()) {
            System.out.println("oleeee gano el jugador 1");
        } else if (juego.ganaJugador2()) {
            System.out.println("oleeee gano el jugador 2");
        } else {
            System.out.println("vayaaaaa empate");
        }
    }

    public static void jugarContraMaquina(TresEnRaya juego) {
        juego.iniciarTablero();
        juego.dibujaTablero();
        //decide aleatoriamente quién empieza
        int jugadorActual = new Random().nextInt(2) + 1; 
        int posicion;

        while (juego.quedanMovimientos() && !juego.ganaJugador1() && !juego.ganaJugador2()) {
            //si es 1 mueve jugador1 
        	if (jugadorActual == 1) {
                System.out.print("Introduzca la posición del 1 a 9: ");
                posicion = entrada.nextInt();
                if (juego.movimientoValido(posicion)) {
                    juego.mueveJugador1(posicion);
                    juego.dibujaTablero();
                    jugadorActual = 2;
                } else {
                    System.out.println("La posición ya esta llena ,mete otro valor ");
                }
            } 
        	//si es 2 empieza ordenador
        	else {
        		//no se comprueba ya q en si el metodo lo comprueba
                juego.mueveOrdenador2();
                System.out.println("Turno del ordenador: ");
                juego.dibujaTablero();
                //cambiamos el jugador actual
                jugadorActual = 1;
            }
        }
        //estadisticas

        if (juego.ganaJugador1()) {
            System.out.println("oleeee a ganado");
        } else if (juego.ganaJugador2()) {
            System.out.println("gano la maquina, lo siento humano");
        } else {
            System.out.println("empate, eres igual de inteligente q la maquina");
        }
    }

    public static void jugarMaquinaVsMaquina(TresEnRaya juego) {
        juego.iniciarTablero();
        DibujarTablero(juego);

        while (juego.quedanMovimientos() && !juego.ganaJugador1() && !juego.ganaJugador2()) {
            Movimiento(juego, 1);
            DibujarTablero(juego);
            if (juego.quedanMovimientos() && !juego.ganaJugador1() && !juego.ganaJugador2()) {
                Movimiento(juego, 2);
                DibujarTablero(juego);
            }
        }

       Resultado(juego);
    }
    // realizar movimiento
    public static void Movimiento(TresEnRaya juego, int jugador) {
        System.out.println("turno de la maquina " + jugador + ":");
       // se ve a q jugador le toca jugar si es 1 le tocara al ordenador 1 
        if (jugador == 1) {
            juego.mueveOrdenador1();
        } else {
            juego.mueveOrdenador2();
        }
    }
    //dibuja el tablero con la posicion del movimiento de cada jugador
    public static void DibujarTablero(TresEnRaya juego) {
        juego.dibujaTablero();
        System.out.println();
    }

    public static void Resultado(TresEnRaya juego) {
        if (juego.ganaJugador1()) {
            System.out.println("la maquina 1 ha ganado!");
        } else if (juego.ganaJugador2()) {
            System.out.println("la maquina 2 ha ganado!");
        } else {
            System.out.println("vayaaaa empate");
        }
    }
}

