package ud4;

public class ej17raro {

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
			matriz[10][j]=cont;
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