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
		denSuma=f1.dameDen()*this.denominador;
		numSuma=((f1.dameNum()*this.denominador)+(this.numerador*f1.dameDen()));
	Fraccion fresult= new Fraccion(numSuma,denSuma);
	return fresult;
	}
	public Fraccion resta(Fraccion f1) {
		int numresta;
		int denresta;
		denresta=f1.dameDen()*this.denominador;
		numresta=((f1.dameNum()*this.denominador)-(this.numerador*f1.dameDen()));
	Fraccion fresult= new Fraccion(numresta,denresta);
	return fresult;
	}
	public Fraccion multi(Fraccion f1) {
		int nummult;
		int denmult;
		denmult=f1.dameDen()*this.denominador;
		nummult=(f1.dameNum()*this.numerador);
	Fraccion fresult= new Fraccion(nummult,denmult);
	return fresult;
	}
	public Fraccion divi(Fraccion f1) {
		int numdivi;
		int dendivi;
		dendivi=f1.dameNum()*this.denominador;
		numdivi=f1.dameDen()*this.numerador;
	Fraccion fresult= new Fraccion(numdivi,dendivi);
	return fresult;
	}
	public boolean esIgual(Fraccion f1) {
		double resultado1frac=f1.dameNum() /f1.dameDen();
		double resultado2frac=this.numerador/this.denominador;
		if (resultado1frac==resultado2frac) {
			return true;
		}
		return false;
	}
	public void simplificar() {
		for(int i=0;i< denominador;i++) {
		numerador = numerador/2;
		denominador=denominador/2;
		System.out.println(numerador +"/"+ denominador);
		}
	}
	public void mostrar() {
		System.out.println(numerador+"/"+denominador);
	}
	//metodos 
	/*setters simplificar
	 * void simplificar()*/
}
