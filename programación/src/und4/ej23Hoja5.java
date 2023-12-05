package und4;
import java.util.Scanner;
//Que realice los diferentes métodos de ordenación de 
//arrays utilizando las funciones:
//Relleno de un array
//Copia un array a otro.
//Mostrar en pantalla todos los valores.
//Ordenar por burbuja.
public class ej23Hoja5 {
		//habilitamos scanner
		static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int[] array;
		int Tam=0;
		System.out.println("introduce el tamaño que quieras la array");
		Tam=entrada.nextInt();
		array=new int[Tam];
		int array2 =array;
		rellenaArray(array);
		copiaarray(array);
		muestraArray(array);
		Burbuja(array);
	}
	public static void rellenaArray(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.println("Introduce valor");
			array[i]=entrada.nextInt();
		}
		return;
	}
	public static int copiaarray(int[] array) {
		int[] array2=array;
		return;
	}
	
	public static void muestraArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		return;
	}
	public static void Burbuja(int[] array) {
		int num =array.length;
		for(int i=0;i<num-1;i++) {
			for(int j=0;j<num-i-1;j++) {
				if(array[j]> array[j+1]) {
					//se intercambian las arrays
					int burb=array[j];
					array[j]=array[j+1];
					array[j+1]=burb;
				}
			}
		}
	}

}
