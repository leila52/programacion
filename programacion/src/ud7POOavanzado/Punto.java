package ud7POOavanzado;

public class Punto extends Figura{
	private double x;
	private double y;
	
	public Punto(String nombre,double x,double y) {
		super(nombre);
		this.x=x;
		this.y=y;
	}
	public double damex() {
		return x;
	}
	public double damey() {
		return y;
	}
	public double obtenerArea() {
		return 0;
	}
	public double obtenerVolumen() {
		return 0;
	}
}
