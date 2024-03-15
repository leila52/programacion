package ud7POOavanzado;

public class Empleado {
	
	private String nombre,apellido;
	private int numSeguridadsocial;
	private double salarioBase;
	
	public Empleado(String nombre, String apellido, int numSeguridadsocial, double salarioBase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numSeguridadsocial = numSeguridadsocial;
		this.salarioBase = salarioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumSeguridadsocial() {
		return numSeguridadsocial;
	}

	public void setNumSeguridadsocial(int numSeguridadsocial) {
		this.numSeguridadsocial = numSeguridadsocial;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
}
