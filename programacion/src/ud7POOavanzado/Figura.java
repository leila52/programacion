package ud7POOavanzado;

public abstract class Figura {
	private String nombre;
	
	public Figura(String nombre) {
		this.nombre=nombre;
	}
	public abstract double obtenerArea();
	public abstract double obtenerVolumen();
	
	public String getNombre() {
		return nombre;
	}
	
	
}
