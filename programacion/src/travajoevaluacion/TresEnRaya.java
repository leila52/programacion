package travajoevaluacion;

import java.util.Random;

public class TresEnRaya {
	private int[][] tablero;

    public TresEnRaya() {
        tablero = new int[3][3];
        iniciar();
    }

    public void iniciar() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    public void mueveJugador1(int pos) {
        if (movimientoValido(pos)) {
            tablero[(pos - 1) / 3][(pos - 1) % 3] = 1;
        }
    }

    public void mueveJugador2(int pos) {
        if (movimientoValido(pos)) {
            tablero[(pos - 1) / 3][(pos - 1) % 3] = 2;
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
        tablero[(pos - 1) / 3][(pos - 1) % 3] = 1;
    }

    public void mueveOrdenador2() {
        Random ale = new Random();
        int pos;
        do {
            pos = ale.nextInt(9) + 1;
        } while (!movimientoValido(pos));
        tablero[(pos - 1) / 3][(pos - 1) % 3] = 2;
    }

    public boolean quedanMovimientos() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ganaJugador1() {
        return (tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1) ||
               (tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1) ||
               (tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1) ||
               (tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1) ||
               (tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1) ||
               (tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1) ||
               (tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1) ||
               (tablero[0][2] == 1 && tablero[1][1] == 1 && tablero[2][0] == 1);
    }

    public boolean ganaJugador2() {
        return (tablero[0][0] == 2 && tablero[0][1] == 2 && tablero[0][2] == 2) ||
               (tablero[1][0] == 2 && tablero[1][1] == 2 && tablero[1][2] == 2) ||
               (tablero[2][0] == 2 && tablero[2][1] == 2 && tablero[2][2] == 2) ||
               (tablero[0][0] == 2 && tablero[1][0] == 2 && tablero[2][0] == 2) ||
               (tablero[0][1] == 2 && tablero[1][1] == 2 && tablero[2][1] == 2) ||
               (tablero[0][2] == 2 && tablero[1][2] == 2 && tablero[2][2] == 2) ||
               (tablero[0][0] == 2 && tablero[1][1] == 2 && tablero[2][2] == 2) ||
               (tablero[0][2] == 2 && tablero[1][1] == 2 && tablero[2][0] == 2);
    }

    public void dibujaTablero() {
        System.out.println("-------------");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    System.out.print("  | ");
                } else if (tablero[i][j] == 1) {
                    System.out.print("X | ");
                } else {
                    System.out.print("O | ");
                }
            }
            System.out.println("\n-------------");
        }
    }
}
