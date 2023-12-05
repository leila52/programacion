package ud4;
//. Que pinte un tablero de ajedrez, los peones con la letra P, las torres con T, los
//caballos con C, los alfiles con A, el rey con R y la reina con M.
public class ej15hoja4 {

	public static void main(String[] args) {
		int[][] tablero=new int [8][8];
		int num=0;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				tablero[j][i]=num;
				num++;
			}
		}

	}

}
