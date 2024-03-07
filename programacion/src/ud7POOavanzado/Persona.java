package ud7POOavanzado;

public class Persona {
	private String nombre,apellido,dni,estado_civil;
	
	public Persona(String nombre,String apellido,String dni,String estado_civil) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.estado_civil=estado_civil;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String toString() {
		return "Persona con nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", estado_civil="
				+ estado_civil + "";
	}
	



}
