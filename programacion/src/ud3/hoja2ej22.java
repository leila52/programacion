package ud3;

import java.util.Scanner;

//que calcule la media de 10 numeros
public class hoja2ej22 {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		int num;
		int media;
		int cont;
		media = 0;
		for(cont=0;cont<=10;cont=cont+1) {
		System.out.println("introduce un numero ");
		//Leemos num1 chuletario
		num=entrada.nextInt();
		media= media+ num;

	}
		media= media/ cont;
		System.out.println("la media es :" + media);
	}
}
