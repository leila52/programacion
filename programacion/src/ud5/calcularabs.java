package ud5;
public class calcularabs {
//math es una clase utilitaria de forma que no tiene constructores
	//y sus metodos son estaticos
	//sintaxis para usar el metodo es:clase.método
	public static void main(String[] args) {
		// calcular valor absoluto
		int num=Math.abs(-5);
		System.out.println(num);
		//obtener el valor maximo entre dos numeros
		num=Math.max(89,5);
		System.out.println(num);
		//obtener ls potencia
		double resultado=Math.pow(2, 3);
		System.out.println(resultado);
		//raiz 1/2
		double resultad=Math.pow(2, 0.5);
		System.out.println(resultad);
		//raiz cuadrada
		System.out.println(Math.sqrt(9));
		//numero pi
		System.out.println(Math.PI);
		//DEVUELVE NUMERO REDONDEADO al maxi
		System.out.println(Math.ceil(1.566));
		//devuelve el numero redondeado a la baja
		System.out.println(Math.floor(1.566));
		// si es meno q 0.5 devuelve para abajo y si no redonde para arriba
		System.out.println(Math.round(1.56));
		System.out.println(Math.round(1.499));
	}
}