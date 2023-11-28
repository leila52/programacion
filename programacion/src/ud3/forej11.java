package ud3;

import java.util.Scanner;

//Que pida dos números y muestre todos los números que van desde el primero al
//segundo. Se debe controlar que los valores son correctos
public class forej11 {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
				Scanner entrada=new Scanner(System.in);
				int acum,num1,num2;
				System.out.println("Introduce un numero1");
				//leemos num1
				num1=entrada.nextInt();
				System.out.println("Introduce un numero2");
				//leemos num2
				num2=entrada.nextInt();
				if (num1>num2) {
					System.out.println("Error, vuelve a introducir dos numero");
				}else {
					while(num1<=num2) {
				    System.out.println("los numeros son : " +num1);
					num1=num1+1;
					}
				}

	}

}
