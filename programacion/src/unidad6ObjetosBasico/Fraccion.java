package unidad6ObjetosBasico;

public class Fraccion {
	private int numerador;
	private int denominador;
	
	public Fraccion (int num , int den) {
		numerador=num;
		denominador=den;
	}
	//getter
	public int dameNum() {
		return numerador;
	}
	public int dameDen() {
		return denominador;
	}
	//metodos
	public Fraccion suma(Fraccion f1) {
		int numSuma;
		int denSuma;
		numSuma=f1.dameDen()*this.denominador;
		denSuma=((f1.dameNum()*this.denominador)+(this.numerador*f1.dameDen()));
	Fraccion fresult= new Fraccion(numSuma,denSuma);
	return fresult;
	}
	public void mostrar() {
		System.out.println(numerador+"/"+denominador);
	}
}
