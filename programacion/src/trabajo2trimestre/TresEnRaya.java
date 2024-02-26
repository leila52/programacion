package trabajo2trimestre;

import java.util.Random;

public class TresEnRaya {
	private int[][] tablero;

    public TresEnRaya() {
        tablero = new int[3][3];
        iniciarTablero();
    }

    public void iniciarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    public void mueveJugador1(int pos) {
    	//calcular la fila dividiendolo en 3 que valdra a la posicion en un tablero 3x3
        int fila = (pos - 1) / 3;
        // calcula la columna que valdra calculandolo con el resto
        int columna = (pos - 1) % 3;
        //si la celda esta vacia se rellena con 1 q seria  la ficha
        if (tablero[fila][columna] == 0) {
            tablero[fila][columna] = 1;
        }
    }

    public void mueveJugador2(int pos) {
        int fila = (pos - 1) / 3;
        int columna = (pos - 1) % 3;
        //si la celda esta vacia se rellena con el 2 que hace q sea la ficha
        if (tablero[fila][columna] == 0) {
            tablero[fila][columna] = 2;
        }
    }

    public boolean movimientoValido(int pos) {
        int fila = (pos - 1) / 3;
        int columna = (pos - 1) % 3;
        return tablero[fila][columna] == 0;
    }

    public void mueveOrdenador1() {
        Random rand = new Random();
        int pos;
        do {
            pos = rand.nextInt(9) + 1;
        } while (!movimientoValido(pos));
        mueveJugador1(pos);
    }

    public void mueveOrdenador2() {
        Random rand = new Random();
        int pos;
        do {
            pos = rand.nextInt(9) + 1;
        } while (!movimientoValido(pos));
        mueveJugador2(pos);
    }

    public boolean quedanMovimientos() {
    	// for(int i = 0; i < tablero.length; i++) {
        	//for (int j = 0; j < tablero[i].length; j++) {
        for (int[] fila : tablero) {
            for (int casilla : fila) {
                if (casilla == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ganaJugador1() {
        // Comprobación de filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == 1 && tablero[i][1] == 1 && tablero[i][2] == 1) {
                return true; // Fila i completa para jugador 1
            }
            if (tablero[0][i] == 1 && tablero[1][i] == 1 && tablero[2][i] == 1) {
                return true; // Columna i completa para jugador 1
            }
        }
        // Comprobación de diagonales
        if (tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1) {
            return true; // Diagonal principal completa para jugador 1
        }
        if (tablero[0][2] == 1 && tablero[1][1] == 1 && tablero[2][0] == 1) {
            return true; // Diagonal secundaria completa para jugador 1
        }
        return false;
    }

    public boolean ganaJugador2() {
        // Comprobación de filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == 2 && tablero[i][1] == 2 && tablero[i][2] == 2) {
                return true; // Fila i completa para jugador 2
            }
            if (tablero[0][i] == 2 && tablero[1][i] == 2 && tablero[2][i] == 2) {
                return true; // Columna i completa para jugador 2
            }
        }
        // Comprobación de diagonales
        if (tablero[0][0] == 2 && tablero[1][1] == 2 && tablero[2][2] == 2) {
            return true; // Diagonal principal completa para jugador 2
        }
        if (tablero[0][2] == 2 && tablero[1][1] == 2 && tablero[2][0] == 2) {
            return true; // Diagonal secundaria completa para jugador 2
        }
        return false;
    }

    public void dibujaTablero() {
        System.out.println("Tablero del tres en raya");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == 1) {
                    System.out.print("X");
                } else if (tablero[i][j] == 2) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

  }
