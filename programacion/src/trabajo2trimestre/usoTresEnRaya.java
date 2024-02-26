package trabajo2trimestre;

import java.util.Random;
import java.util.Scanner;

public class usoTresEnRaya {
	static  Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		TresEnRaya juego = new TresEnRaya();
        int opcion;

        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Jugar 2 jugadores");
            System.out.println("2. Jugar contra la máquina");
            System.out.println("3. Máquina contra máquina");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();
           entrada.nextLine(); // Consumir la nueva línea pendiente

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

    public static void jugarDosJugadores(TresEnRaya juego) {
        juego.iniciarTablero();
        juego.dibujaTablero();
        int jugadorActual = 1;
        int posicion;

        while (juego.quedanMovimientos() && !juego.ganaJugador1() && !juego.ganaJugador2()) {
            System.out.println("Turno del jugador " + jugadorActual);
            System.out.print("Introduzca la posición (1-9): ");
            posicion = entrada.nextInt();
            entrada.nextLine(); // Consumir la nueva línea pendiente

            if (juego.movimientoValido(posicion)) {
                if (jugadorActual == 1) {
                    juego.mueveJugador1(posicion);
                    jugadorActual = 2;
                } else {
                    juego.mueveJugador2(posicion);
                    jugadorActual = 1;
                }

                juego.dibujaTablero();
            } else {
                System.out.println(" posicion no valida ya q ya hay una ficha vuelve a introducirlo");
            }
        }

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
            if (jugadorActual == 1) {
                System.out.print("Introduzca la posición (1-9): ");
                posicion = entrada.nextInt();
                entrada.nextLine(); // Consumir la nueva línea pendiente

                if (juego.movimientoValido(posicion)) {
                    juego.mueveJugador1(posicion);
                    juego.dibujaTablero();
                    jugadorActual = 2;
                } else {
                    System.out.println("La posición ya esta llena ,mete otro valor ");
                }
            } else {
                juego.mueveOrdenador2();
                System.out.println("Turno de la máquina: ");
                juego.dibujaTablero();
                jugadorActual = 1;
            }
        }
        //resultado

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
        System.out.println("Turno de la máquina " + jugador + ":");
        if (jugador == 1) {
            juego.mueveOrdenador1();
        } else {
            juego.mueveOrdenador2();
        }
    }

    public static void DibujarTablero(TresEnRaya juego) {
        juego.dibujaTablero();
        System.out.println();
    }

    public static void Resultado(TresEnRaya juego) {
        if (juego.ganaJugador1()) {
            System.out.println("¡La máquina 1 ha ganado!");
        } else if (juego.ganaJugador2()) {
            System.out.println("¡La máquina 2 ha ganado!");
        } else {
            System.out.println("¡Empate!");
        }
    }
}
