package ud4;
//Que muestre por pantalla los números del 1 al 100, utilizar recursividad.
public class ej3hoja5 {

	public static void main(String[] args) {
		muestraNum(1);
		

	}
	public static void muestraNum(int num) {
		System.out.println(num);
		//caso base
		if(num<100)
			muestraNum(num+1);
		return; 
	}
}
