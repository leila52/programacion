package ud4;
//Que rellene un array con los números pares comprendidos entre 1 y 100 y los
//muestre en pantalla en orden ascendente.
public class ej4hoja4 {

	public static void main(String[] args) {
		//definimos el array de notas
		// paso uno
		int[] num;
		//2.construimos el array de 100 posiciones
		num=new int[50];
		//DECLARAMOS VARIBLES
		int numero=2;
		//3.metemos 100 notas en el array
		for(int i=0;i<50;i++) {
			num[i]=numero;
			numero= numero +2;
		}
		//muestro array
		for(int i=0;i<50;i=i+2) {
			System.out.println(num[i]);
		}

	}

}
