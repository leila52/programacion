package ud7POOavanzado;

public class Cilindro extends Figura{
	private Circulo c;
	private double  altura;
	
	public Cilindro(String nombre ,Circulo c,double altura) {
		super(nombre);
		this.c=c;
		this.altura=altura;
		
		
	}
	
	public double obtenerArea() {
		
		double areacirculo =2*c.obtenerArea();
		double perimetrocirculo=2*Math.PI*c.dameradio();
		double rectangulo=altura*perimetrocirculo;
		return areacirculo+rectangulo;
	}
	public double obtenerVolumen() {
		return c.obtenerArea()*altura;
	}

}
