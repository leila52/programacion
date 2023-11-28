package und4;

import java.util.Scanner;

public class booleanoej6 {

	public static void main(String[] args) {
		 //habilitamos la lectura por teclado
	   	 Scanner entrada = new Scanner(System.in);
	   	 //definimos el array
	   	 double[] numero = new double[10];
	   	 
	   	 double suma = 0, resta = 0, multiplicacion = 1, division = 1;
	   	 
	   	 boolean hayUnCero=false;
	   	 
	   	 
	   	 //rellenamos el array
	   	 for(int i = 0; i < 10; i++) {
	   		 System.out.println("Introduce 10 valores");
	   		 numero[i]=entrada.nextDouble();
	   		 if (numero[i]==0) {
	   			 hayUnCero=true;
	   		 }

	   	 }
	   	 //calculamos los resultados
	   	 for(int i=0;i<10;i++) {
	   		 suma = suma + numero[i];
	   		 resta = resta - numero[i];
	   		 multiplicacion = multiplicacion * numero[i];
	   		 if (hayUnCero==false) {
	   			 division = division / numero[i];
	   		 }
	   		 
	   	 }
	   	 
	   	 System.out.println("La suma es " + suma);
	   	 System.out.println("La resta es" + resta);
	   	 System.out.println("La multiplicacion es " + multiplicacion);
	   	 if (hayUnCero==false) {
	   		 System.out.println("La division es " + division);
	   	 }else {
	   		 System.out.println("La división no se puede realizar");
	   	 }


	}

}
