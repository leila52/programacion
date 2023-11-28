package und4;
//10*10 bueno 10*11 por la suma
//Que muestre los primeros 100 números de izquierda a derecha usando un
//array de dos dimensiones, la última fila a mostrará la suma de sus respectivas
//columnas.
public class ej17hoja4 {
	public static void main(String[] args) {
		int[][] matriz=new int [11][12];
		int num=1;
		int cont=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				matriz[i][j]=num;
				num++;
			}
		}
		
		for(int j=0;j<11;j++) {
			for(int i=0;i<10;i++) {
				cont+=matriz[i][j];
				}
			matriz[11-1][j]=cont;
			}

	//mostramos el array en formato matriz
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					System.out.print(matriz[i][j]+" ");;
				}
				System.out.println();

		}

}
}