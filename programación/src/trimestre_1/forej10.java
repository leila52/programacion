package trimestre_1;
//que imprima la suma de todos los numeros del 1 al 100
public class forej10 {

	public static void main(String[] args) {
		int i;
		int acum=0;
		int cont=0;
		for (i=1;i<=100;i=i+2) {
			acum = acum +i;
			cont=cont+1;
	}
	System.out.println("la suma es : "+ acum+ "cont: "+cont);


	}

}
