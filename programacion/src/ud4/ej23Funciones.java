package ud4;
import java.util.Scanner;
// Que realice los diferentes métodos de ordenación de 
//arrays utilizando las funciones:
// Relleno de un array
//Copia un array a otro.
//Mostrar en pantalla todos los valores.
public class ej23Funciones {
//habilitamos scanner
	static Scanner entrada=new Scanner(System.in);	
	public static void main(String[] args) {
		int[] numerosarray;
		int[] numerosarray
		int Tam=0;
		
		System.out.println("introduce el tamaño que quieras la array");
		Tam=entrada.nextInt();
		array=new int[Tam];
		rellenaArray(array);
		int[] array2=new int[Tam];
		muestraArray(array);
	}
	public static void rellenaArray(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.println("Introduce valor");
			array[i]=entrada.nextInt();
		}
		return;
	}
	public static void copiaarray(int[] array2) {
		for (int i=0;i<Tam;i++) {
			array2[i]=array[i];
		}
	}
	
	public static void muestraArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		return;
	}
}
