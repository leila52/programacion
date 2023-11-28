package trimestre_1;
//Que solicite la media de X números, se dejarán de solicitar números hasta que se 
//introduzca el cero
import java.util.Scanner;

public class forej23 {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		double num =0;
		int cont =1;
		double acum = 0;
		double media =0;
		System.out.println("introduce un número: ");
		//Leemos un decimal
		num = entrada.nextDouble();
		while (num !=0) {
			acum = acum + num;
			System.out.println("Introduce un numero : ");
			//Leemos un decimal
			num = entrada.nextDouble();
			cont = cont +1;
		}
		if (cont!=1) {
			media = acum /(cont - 1);
			System.out.println("La media es : " + media );
		}else {
			System.out.println("No la puedo calcular");
		}


	}

}
