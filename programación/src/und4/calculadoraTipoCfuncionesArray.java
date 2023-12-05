package und4;
import java.util.Scanner;
public class calculadoraTipoCfuncionesArray {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		double[] num=new double [5];
		//relleno del array
		rellenaArray(num);
		//sumar
		double result1;
		result1=sumaElemento(num);
		System.out.println("la suma de todos es "+result1);
		//resta
		double result2;
		result2=restaElemento(num);
		System.out.println("La resta de todos es : "+result2);
		//multiplicacion
		double result3;
		result3 = multiplicarElementos(num);
		System.out.println("La multipiclacion de todos los valores es "+result3);
		//division
		double result4;
		result4 = dividirElementos(num);
		System.out.println("La division de todo los elementos es :"+result4);
		//calcular la media
		double result5;
		result5=calcularPromedio(num);
		System.out.println("el promedio de todos los elementos es:"+result5);
		//maximo
		double result6;
		result6=encontrarMaximo(num);
		System.out.println("el numero máximo es :"+result6);
		//minimo
		double result7;
		result7=encontrarMinimo(num);
		System.out.println("el numero minimo es :"+result7);
		//suma acumulada
		double result8;
		result8=sumaAcumulada(num);
		System.out.println("la suma acumulada :"+result8);
		//array invertida
		double result9;
		result9=InvertirArray(num);
		System.out.println("la array invertida es: "+result9);
		//el numero a buscar
		double result10;
		System.out.println("Ingrese un numero para buscar:");
		double numeroBuscar=entrada.nextDouble();
		System.out.println("El numero "+numeroBuscar+"esta en : "+ buscarNumero(num));
		
	}
	public static void rellenaArray(double[] num) {
		for (int i=0;i<5;i++) {
			System.out.println("Introduce un numero");
			num[i]=entrada.nextDouble();
		}
		return;
	}
	public static double sumaElemento(double[] num) {
		double acum=0;
		for (int i=0;i<num.length;i++) {
			acum = acum + num[i];
		}
		return acum;
	}
	public static double restaElemento(double[] num) {
		double resta=0;
		for (int i=0;i<num.length;i++) {
			resta =resta - num[i] ;
		}
		return resta;
	}
	public static  double multiplicarElementos(double []num) {
		double mult=1;
		for (int i=0;i<num.length;i++) {
			mult=mult*num[i];
		}
		return mult;
	}
	public static  double dividirElementos(double []num) {
		double divi=1;
		for (int i=0;i<num.length;i++) {
			if (num[i]!=0) {
				divi=divi/num[i];
			}
			else {
				System.out.println("Introduzca otro numero que no sea 0");
			}
		}
		return divi;		
	}
	public static double calcularPromedio(double[] num) {
		double promedio=sumaElemento(num)/num.length;
		return promedio;
		}
	public static double encontrarMaximo(double[]num) {
		double max=num[0];
		for(int i=1;i<num.length;i++) {
			if (num[i]>max)
				max=num[i];
		}
		return max;
	}
	public static double encontrarMinimo(double[]num) {
		double min=num[0];
		for(int i=1;i<num.length;i++) {
			if (num[i]<min)
				min=num[i];
		}
		return min;
}
	public static double sumaAcumulada(double []num) {
		double suma=0;
		for(int i=0;i<num.length;i++) {
			suma +=num[i];
		}
		return suma;
	}
	public static double InvertirArray(double[] num) {
		double [] numinv=new double[num.length];
		// Invierte el orden de los elementos en un array.
		for(int i=1;i<num.length;i++) {
			numinv[i]=num[num.length-1-i];
		}
		return numinv;
	}
	public static boolean buscarNumero(double[] num, double numero) {
		for(double nume:num) {
			if(nume == numero) {
				return true;
			}
		}
		return false;
}
}
