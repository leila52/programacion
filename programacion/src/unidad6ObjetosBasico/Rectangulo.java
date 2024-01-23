package unidad6ObjetosBasico;

public class Rectangulo {
	private int base;
	private int altura;
	
	public Rectangulo() {
		base=5;
		altura=2;
	}
	//sobrecarga de constructores
		public Rectangulo(int baseNUeva, int alturaNueva) {
			base=baseNUeva;
			altura=alturaNueva;
		}
	
	
	
	public void cambiarBase(int NuevaBase) {
		//cambiamos el atributo al valor q pasamos por parametro
		base=NuevaBase;
	}
	public void cambiarAltura(int NuevaAltura) {
		altura=NuevaAltura;
	}
	public int damebase() {
		return base;
	}
	public int damealtura() {
		return altura;
	}
	
	//definimos metodos
	public void perimetro () {
		System.out.println("el perimetro es : "+ (base*2+ altura*2));
	}
	public void area() {
		System.out.println("el are del rectangulo es : "+ (base*altura));
	}
	
}
