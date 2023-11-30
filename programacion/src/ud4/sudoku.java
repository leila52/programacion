package ud4;
import java.util.Scanner;
public class sudoku {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
			int[][] sudoku = {
		            {5, 3, 4, 6, 7, 8, 9, 1, 2},
		            {6, 7, 2, 1, 9, 5, 3, 4, 8},
		            {1, 9, 8, 3, 4, 2, 5, 6, 7},
		            {8, 5, 9, 7, 6, 1, 4, 2, 3},
		            {4, 2, 6, 8, 5, 3, 7, 9, 1},
		            {7, 1, 3, 9, 2, 4, 8, 5, 6},
		            {9, 6, 1, 5, 3, 7, 2, 8, 4},
		            {2, 8, 7, 4, 1, 9, 6, 3, 5},
		            {3, 4, 5, 2, 8, 6, 1, 7, 9}
		            };
			
		}

		//del 1 al 10
		public static boolean comprobararray (int[]matriz) {
			boolean[]num=new boolean[10];
			for(int num=matriz) {
				
			}
		}
		//esta en la array y comprobar q no se repita los numeros
		static boolean comprobarsudoku(int[][] sudoku) {
			for(int i=0;i<9;i+=3) {
				for(int j=0;j<9;j+=3) {
				}
			}
		}

	}


