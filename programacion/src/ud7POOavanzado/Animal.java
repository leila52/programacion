package ud7POOavanzado;
//es una clase abstracta ya q tiene al menos un metodo abstracto
public abstract class Animal {
	
	private String nombre,fechaNacimiento,comentario;
	private double peso;
	
	public Animal(String nombre,String fechaNacimiento,String comentario,double peso) {
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
		this.comentario=comentario;
		this.peso=peso;
	}
	//metodo abstracto solo se define la cabecera
	public abstract String damedatosAnimal ();
	
	public String getNombre() {
		return nombre;
	}
	public String getComentario() {
		return comentario ;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public double getPeso() {
		return peso;
	}
	
	
}
