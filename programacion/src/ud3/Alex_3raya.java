package ud3;

import java.util.Scanner;

public class Alex_3raya{
	static Scanner scanner = new Scanner(System.in); // variable global para leer por pantalla
	static char[] tablero = new char[9]; // array de las posiciones del tablero

	public static void main(String[] args) {
		int opcion;
		do { // do while que muestra las opciones y hace elegir una opcion 
			menu();
			opcion = scanner.nextInt();
			switch (opcion) {

			case 1:
				int mov;
				int pos;
				System.out.println("1. Jugar partida ");
				iniciar();
				dibujarTablero();
				System.out.println("jugador 1 : X");
				System.out.println("jugador 2 : O");
				// tiene que preguntar los movimiento de los jugadiores hasta que todas las
				// casillas esten completas
				do {
					System.out.println("pon una ficha J1");
					pos = scanner.nextInt();
					mueveJugador1(pos);
					dibujarTablero();
					System.out.println("pon una ficha J2");
					pos = scanner.nextInt();
					mueveJugador2(pos);
					dibujarTablero();
					

				} while (quedanCasillas() == true);

				break;
			case 2:
				break;
			case 3:
				System.out.println("chao chao chao chao");
				break;
			default:
				System.out.println("opcion no encontrada ");

			}
		} while (opcion != 3);

	}

// Funcion que muestra el menu
	public static void menu() {
		System.out.println("1.Jugar partida ");
		System.out.println("2.Mostrar estadistica");
		System.out.println("3.Salir");
		System.out.println("Introduce una opcion");
	}

// funcion que dibuja el tablero 
	public static void dibujarTablero() {
		System.out.println("--------------");
		System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " | ");
		System.out.println("--------------");
		System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " | ");
		System.out.println("--------------");
		System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " | ");
		System.out.println("--------------");

	}

// funcion que pone a 0 todo el tablero 
	public static void iniciar() {
		for (int i = 0; i < 9; i++) {
			tablero[i] = ' ';
		}
	}

// funcion que define la posicion en la que coloca el jugador 1 
	public static void mueveJugador1(int pos) {
		if (movimientoValido(pos) == true) {
			tablero[pos - 1] = 'X';
		}
	}

	public static void mueveJugador2(int pos) {
		if (movimientoValido(pos) == true) {
			tablero[pos - 1] = 'O';
		}
		
		
			
	}

	public static boolean movimientoValido(int pos) {
		if (pos < 1 || pos > 9|| tablero[pos -1] != ' ') {
			return false;
		}
		return true;

	}

	public static boolean quedanCasillas() {
		for (int i = 0; i < 9; i++) {
			if (tablero[i] == ' ') {
				return true;
			}
		}
		return false;
	}
}