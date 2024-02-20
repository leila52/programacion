package travajoevaluacion;

public class TresenRaya {
	private final int[][] tablero;

    public TresenRaya() {
        tablero = new int[3][3];
        iniciar();
    }
    //metodos
    public void iniciar() {
    	for(int i=0; i<3;i++) {
	    	for(int j=0;j<3;j++) {
				tablero[i][j]=' ';
			}
    	}
		DibujaTablero();
    }
    public boolean movimientoValido(int pos) {
    	if(pos <0 || pos > 9) {
    		return false;
    	}
    	if((tablero[pos-1][pos-1]=='X')|| tablero[pos-1][pos-1]== 'O') {
    		return false;
    	}else {
    		return true;
    	}
    }
    public void mueveJugador1(int pos) {
    	boolean validar= movimientoValido(pos);
    	if(validar== true) {
    		tablero[pos-1][pos-1]='X';
    	}while(validar==false) {
    		System.out.println("la posicion ya esta ocupada,vuelva a introducirlo");
    		
    		
    	}
    }
    
    public void DibujaTablero() {
    	System.out.println("tablero del tres en raya");
    	for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(" | "+tablero[i][j]+" | ");
			}
			System.out.println("~~~~~~~~~~~~~~~~~~");
		
    }
    }
}
