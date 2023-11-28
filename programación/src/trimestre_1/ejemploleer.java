package trimestre_1;
//chuletario
import java.util.Scanner;
//leer dos númeeros por teclado y mostrar suma
public class ejemploleer {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
				Scanner entrada=new Scanner(System.in);
				int num1,num2;
				System.out.println("introduce un numero 1");
				//Leemos num1 chuletario
				num1=entrada.nextInt();
				System.out.println("introduce un numero 2");
				//Leemos num1 chuletario
				num2=entrada.nextInt();
				System.out.println("la suma es :"+(num1+num2));


	}

}
