package universidad;

public class Estudiante extends Persona {
	private String curso;
	
	//constructor
	public Estudiante(String curso,String nombre,String apellido,String dni,String estado_civil) {
		super(nombre,apellido,dni,estado_civil);
		this.curso=curso;
		
	}
	public String getcurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso=curso;
	}
	
	public String toString() {
		return super.toString()+ "curso=" + curso + "";
	}
	
 
}
