package trabajo1trimestre;
import java.util.Scanner;
public class tresenrayamodificaacion {
		//Habilitamos la lectura de datos por consola
		static Scanner entrada=new Scanner(System.in);
		static char[]tablero=new char[9];
		//variable para que pueda moverse
		int pos=0;
		int winjugador1=0,winjugador2=0,empate=0;
		public static void menu() {
			//menu para que el jugador elija
			System.out.println("1. Jugar una partida");
			System.out.println("2. Mostrar estadísticas");
			System.out.println("3. Salir");
			System.out.println("Seleccione una opción:");
		}
		//public static void seleccionarFichas() {
			//char ficha1,ficha2;
			//System.out.println("jugador1 con que ficha quieres jugar X o O");
			//entrada.nextLine();
			//ficha1=entrada.nextLine().charAt(0);
			//if(ficha1=='X') {
				//ficha2='O';
				
			//}
			//else {
				//ficha1='O';
				//ficha2='X';
			//}
		
		//}
		public static void main(String[] args) {
			int winjugador1=0;
			int winjugador2=0;
			int empate=0;
			int opcion;
			do { 
				//in.nextLine();
				//mostramos el menu 
				menu();
				//Leemos un entero de la opcion
				opcion=entrada.nextInt();
				switch(opcion) {
				case 1:
					//seleccionarFichas();
					int pos;
					//mostrar tablero
					//iniciar para todos los valores del arrary se ponga a espacio
					iniciar();
					System.out.println("jugador 1 son las fichas  X y jugador 2 son las fichas  O");
					//do while ya que tiene que ir preguntando los movimientos hasta q las casilla esten completas.
					do {
						//para que asi el jugador pueda introducir donde quiere moverse
						System.out.println("jugador1 diga en que posicion se quiere mover");
						pos=entrada.nextInt();
						muevejugador1(pos);
						dibujaTablero();
						//se comprueba si no ha ganado el jugador 1 para que asi el jugador 2 pueda moverse
						if(ganaJugador1()!=true && quedanCasillas()==true) {
						System.out.println("jugador 2 diga en q posicin se quiere mover");
						pos=entrada.nextInt();
						muevejugador2(pos);
						dibujaTablero();
						}
			        } 
					//el while para q se quede en el bucle si quedan casillas y si gana jugador 2 salga del bucle
					while ((quedanCasillas()==true )&&(ganaJugador1()!=true )&&(ganaJugador2()!=true));
					//si gana incrementamos winjugador para q asi en estadistcas se sume
					muestraResultado();
					
					break;
				case 2:
					//estadistica de todas las partidas jugadas
					System.out.println("el jugador1 ha ganado "+ winjugador1 +" veces");
					System.out.println("el jugador1 ha ganado "+ winjugador2 +" veces");
					System.out.println("Han empatado "+ empate +" veces");
					break;
				case 3:
					System.out.println("Hasta luego ,esperemos que vuelva a jugar");
					break;
				default:
					System.out.println("Ohhhhh vaya creemos q la opción no es valida ,vuelva a introducir otra opcción");
				}
			}while (opcion!=3);
		}
		//para poder iniciar la partida
		public static void iniciar() {
			for(int i=0;i<9;i++) {
				tablero[i]=' ';
			}
			dibujaTablero();
		}
		
		//si quedan casillas vacias y asi para que puede entrar en el while y ai entrar en el bucle para pedri las posiciones
		public static boolean quedanCasillas() {
			if(ganaJugador1()==true || ganaJugador2()==true) {
				return false;
			}
			for(int i=0;i<9;i++) {
				if(tablero[i]==' ') {
					return true;
				}
			}
			return false;
		}
		
		//dibujo del tablero para que salga por pantalla se pone tablero[] ya q se tiene meter dentro del array la pos
		public static void dibujaTablero() {
			System.out.println("tablero del tres en raya");
				System.out.println("|  "+tablero[0]+"  |  "+tablero[1]+"  |  "+tablero[2]);
				System.out.println("~~~~~~~~~~~~~~~~~~");
				System.out.println("|  "+tablero[3]+"  |  "+tablero[4]+"  |  "+tablero[5]);
				System.out.println("~~~~~~~~~~~~~~~~~~");
				System.out.println("|  "+tablero[6]+"  |  "+tablero[7]+"  |  "+tablero[8]);
				System.out.println("~~~~~~~~~~~~~~~~~~");
		}
		
		//para que pueda mover jugador 1se comprueba con el boolean para comprobar q el movimiento es valido y si entra en 1-9
		public static void muevejugador1(int pos) {
			boolean valido =movimientoValido(pos);
			if(valido==true) {
				tablero[pos-1]='X';
			}
			while(valido==false) {
				System.out.println("la posicion que quiere meter ya esta ocupada,intente meter la ficha en otra posicion");
				pos=entrada.nextInt();
				valido=movimientoValido(pos);
				if(valido==true) {
					tablero[pos-1]='X';
				}
			}
			}
		
		
		//para que pueda mover el jugador 2 se comprueba con el boolean para comprobar q el movimiento es valido y si entra en 1-9
		public static void muevejugador2(int pos) {
			boolean valido =movimientoValido(pos);
			if(valido==true) {
				tablero[pos-1]='O';
			}
			while(valido==false) {
				System.out.println("es erroneo,vuelve a introducirlo");
				pos=entrada.nextInt();
				valido=movimientoValido(pos);
				if(valido==true) {
					tablero[pos-1]='0';
				}
			}
			}
		
		//para comprovar si el movimiento sirve o no ya q puede haber sido utilizado
		public static boolean movimientoValido(int pos) {
			if( pos < 0 || pos > 9 ) {
				return false;
			}
			if((tablero[pos-1]== 'X')||(tablero[pos-1]== 'O')) {
			return false;
			}else {
				return true;
			}
			
		}
		
		//si gana jugador uno es verdadero dependiendo si esta en esas posiciones
		public static boolean ganaJugador1() {
			//verificacion si el jugador 1 ha ganado  si ha metido en ciertas posiciones hay q comprobarlo con un if
			if(((tablero[0]=='X') && (tablero[1]=='X') && (tablero[2]=='X') )||
				((tablero[3]=='X') && (tablero[4]=='X') && (tablero[5]=='X'))|| 
				((tablero[6]=='X') && (tablero[7]=='X') &&(tablero[8]=='X')) ||
				((tablero[0]=='X') &&(tablero[4]=='X') &&(tablero[8]=='X')) ||
				((tablero[2]=='X') && (tablero[4]=='X') && (tablero[6]=='X')) ||
				((tablero[0]=='X') &&(tablero[3]=='X') &&(tablero[6]=='X')) ||
				((tablero[1]=='X') && (tablero[4]=='X') && (tablero[7]=='X')) ||
				((tablero[2]=='X') && (tablero[5]=='X') && (tablero[8]=='X'))) {
				return true;
			}
			return false;
		}
		
		//si gana jugador 2 true
		public static boolean ganaJugador2() {
			//verificacion si el jugador 2 ha ganado si ha metido en ciertas posiciones hay q comprobarlo con un if
			if((tablero[0]=='O') && (tablero[1]=='O') && (tablero[2]=='O') ||
					(tablero[3]=='O') && (tablero[4]=='O') && (tablero[5]=='O')|| 
					(tablero[6]=='O') && (tablero[7]=='O') &&(tablero[8]=='O') ||
					(tablero[0]=='O') &&(tablero[4]=='O') &&(tablero[8]=='O') ||
					(tablero[2]=='O') && (tablero[4]=='O') && (tablero[6]=='O') ||
					(tablero[0]=='O') &&(tablero[3]=='O') &&(tablero[6]=='O') ||
					(tablero[1]=='O') && (tablero[4]=='O') && (tablero[7]=='O') ||
					(tablero[2]=='O') && (tablero[5]=='O') && (tablero[8]=='O')) {
					return true;
				}
				return false;
		}
				//modificacion de empate
		public static boolean esEmpate() {
			if ((ganaJugador1()==false)&&(ganaJugador2()==false)&&(quedanCasillas()==false)) {
				return true;
			}
		return false;
		}

		public static void muestraResultado() {
			int winjugador1=0,winjugador2=0,empate=0;
			if (ganaJugador1()==true) {
				System.out.println("jugador uno a ganado,enhorabuena eres el mejor");
				winjugador1++;
			}
			if (ganaJugador2()==true) {
				System.out.println("jugador 2 a ganado,enhorabuena eres el mejor ");
				winjugador2++;
			}
			 if(esEmpate()==true) {
				 System.out.println("habeis empatado los dos");
				 empate++;
			 }
		}
		
	}
