package ud7POOavanzado;

public class Profesor extends Empleado{
	

	private int num_departameto;
	
	public Profesor(int año_incorporacion, int num_despacho, String nombre, String apellido, String dni,
			String estado_civil, int num_departameto) {
		super(año_incorporacion, num_despacho, nombre, apellido, dni, estado_civil);
		this.num_departameto = num_departameto;
	}

	public int getNum_departameto() {
		return num_departameto;
	}

	public void setNum_departameto(int num_departameto) {
		this.num_departameto = num_departameto;
	}
}
	
	
	
