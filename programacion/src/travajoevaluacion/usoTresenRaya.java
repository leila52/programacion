package travajoevaluacion;

import java.util.Scanner;

public class usoTresenRaya {
	static Scanner en =new Scanner(System.in);
	public static void main(String[] args) {
		TresenRaya uno= new TresenRaya();
		menu();
		uno.iniciar();
	}
	public static void menu() {
		//menu para que el jugador elija
		System.out.println("Juego del tres en raya : ");
		System.out.println("1. Jugar una partida: ");
		System.out.println("2. Jugar contra un ordenador");
		System.out.println("3. Maquina vs Maquina");
		System.out.println("4. Mostrar estadísticas");
		System.out.println("5. Salir");
		System.out.println("Seleccione una opción:");
	}
}
