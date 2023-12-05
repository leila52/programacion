package ud4;
import java.util.Scanner;
//10*10 bueno 10*11 por la suma
// Que muestre los primeros 100 números de izquierda a derecha usando un
//array de dos dimensiones, la última fila a mostrará la suma de sus respectivas
//columnas.
public class ej17hoja4 {
	public static void main(String[] args) {
		int[][] nums=new int [10][11];
		int num=1;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				nums[j][i]=num;
				num++;
			}
		}
		//suma array
		for (int i=0;i<10;i++) {
			sumaArray(nums[i]);
		}
		muestraArray(nums);
		
}
	public static void sumaArray(int[] vector) {
		int acum=0;
		for (int i=0;i<10;i++) {
			acum=acum+vector[i];
		}
		vector[10]=acum;
	}
	public static void muestraArray(int [][]nums) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(nums[j][i]+" ");;
			}
			System.out.println();
		}
		for(int i=0;i<10;i++) {
			System.out.print(nums[i][10]+" ");
		}
	}
}
