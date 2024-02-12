package Sanvakentin;

public class Persona {
	private String DNI;
	private String nombre;
	
	public Persona(String dni,String nom){
		DNI=dni;
		nombre=nom;
	}
	public String damenombre() {
		return nombre;
	}
	public String damedni() {
		return DNI;
	}
	public String toString() {
		return "la persona "+nombre+
				" con este dni: "+DNI;
	}
}
