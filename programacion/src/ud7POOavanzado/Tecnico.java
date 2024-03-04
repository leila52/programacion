package ud7POOavanzado;

public class Tecnico extends Empleado {
	private String tecnologia;
	
	public Tecnico(String dni,String nombre,double sueldo, String tecnologia) {
		super (dni,nombre,sueldo);
		this.tecnologia=tecnologia;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
}
