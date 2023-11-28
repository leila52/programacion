package ud3;
//que imprima la suma de todos los numeros pares que van del1 al 100 y diga cuantos hay

public class hoja2ej9 {

	public static void main(String[] args) {
		//declarar variables
		//inicio
		int cont=0;
		int suma=0;
		int contNumPares=0;
		
		while (cont<100) {
			cont= cont+2;
			suma=suma+cont;
			contNumPares=contNumPares+1;
		}
		System.out.println("hay "+contNumPares+" numeros y la suma es "+suma);

	}

}
