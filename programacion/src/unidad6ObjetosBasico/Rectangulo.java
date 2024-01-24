package unidad6ObjetosBasico;

public class Rectangulo {
	private double base;
	private double altura;
	
	public Rectangulo() {
		base=5;
		altura=2;
	}
	//sobrecarga de constructores
		public Rectangulo(double baseNUeva, double alturaNueva) {
			base=baseNUeva;
			altura=alturaNueva;
		}
	
	
	
	public void cambiarBase(double NuevaBase) {
		//cambiamos el atributo al valor q pasamos por parametro
		base=NuevaBase;
	}
	public void cambiarAltura(double NuevaAltura) {
		altura=NuevaAltura;
	}
	public double damebase() {
		return base;
	}
	public double damealtura() {
		return altura;
	}
	public double calcularPerimetro() {
		return base*2+ altura*2;
	}
	public double calcularArea() {
		return base*altura;
	}
	//definimos metodos
	public void perimetro () {
		System.out.println("el perimetro es : "+ calcularPerimetro());
	}
	public void area() {
		System.out.println("el are del rectangulo es : "+ calcularArea());
	}
	
}
