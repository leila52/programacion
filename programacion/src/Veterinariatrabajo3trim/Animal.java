package Veterinariatrabajo3trim;

public abstract class Animal {
	
	private String nombre,fechaNacimiento,comentarios;
	private double peso;
	
	public Animal(String nombre,String fechaNacimiento,String comentarios,double peso) {
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
		this.comentarios=comentarios;
		this.peso=peso;
		
	}
	//metodo abstracto solo se define la cabecera
	public abstract String DameDatosAnimal();
	
	public String getNombre() {
		return nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getComentarios() {
		return comentarios;
	}
	public double getPeso() {
		return peso;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}

