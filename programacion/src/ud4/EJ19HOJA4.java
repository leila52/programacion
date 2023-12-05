package ud4;
import java.util.Scanner;
//Que rellene una matriz de 3x3 y muestre su traspuesta (la traspuesta se
//consigue intercambiando filas por columnas y viceversa).
public class EJ19HOJA4 {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int[][] matriz=new int [3][3];
		
		//rellenar
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("introduce los valores");
				matriz[i][j]=entrada.nextInt();
			}
		}
		//mostramos el array en formato matriz
		System.out.println("matriz normal");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
			System.out.println();
	}
		System.out.println("matriz inversa");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz[j][i]+" ");
				System.out.print(matriz[j][i]+" ");
			}
			System.out.println();
	}	
}
}
