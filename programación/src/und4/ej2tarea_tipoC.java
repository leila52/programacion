package und4;

import java.util.Scanner;

//Leer 10 números, almacenarlos en un array, luego tiene que salir el siguiente menú:
//a. el valor máximo y mínimo del array
//b. eliminar duplicados y sutituirlos por 0 (todos menos el primero)
//c. rotar array d. salir
public class ej2tarea_tipoC {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//definimos el array
		int[] num;
		//2.construimos el array de 10 posiciones
		num=new int[10];
		//3.metemos 10 en el array
		for(int i=0;i<10;i++) {
			System.out.println("introduce los números");
			num[i]=scanner.nextInt();
		}
		boolean salir=false;
		 do {
			System.out.println("a. el valor máximo y mínimo del array");
			System.out.println("b. eliminar duplicados y sutituirlos por 0 (todos menos el primero)");
			System.out.println("c.rotar array");
			System.out.println("d.salir");
			char opcion=scanner.nextLine().charAt(0);
			switch(opcion) {
			case 'a':
				int maxi=num[0];
				int min=num[0];
				for(int i=1;i<10;i++){
					if(num[i]>maxi) {
						maxi=num[i];
					}
					if(num[i]<min) {
						min=num[i];
					}
				}
				System.out.println("el maximo es : "+maxi);
				System.out.println("el minimo es : "+min);
			case 'b':
			case 'c':
				int nose =num[9];
				for(int i=9;i>0;i--) {
					num[i]=nose;
				}
				num[0]=nose;
				System.out.println("Array rotado:");
				for(int i=0;i<10;i++) {
					System.out.println(num[i]+" ");
				}
			case 'd':
				salir=true;
				break;
			default:
				System.out.println("Opción no es válida,intentelo otra vez");
			}while{
			
		}
	}
}
}
