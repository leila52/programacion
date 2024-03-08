package universidad;

public class Empleado extends Persona{
private int año_incorporacion,num_despacho;
	
	//constructor
	public Empleado(int año_incorporacion,int num_despacho,String nombre,String apellido,String dni,String estado_civil) {
		super(nombre,apellido,dni,estado_civil);
		this.año_incorporacion=año_incorporacion;
		this.num_despacho=num_despacho;
		
	}

	public int getAño_incorporacion() {
		return año_incorporacion;
	}

	public void setAño_incorporacion(int año_incorporacion) {
		this.año_incorporacion = año_incorporacion;
	}

	public int getNum_despacho() {
		return num_despacho;
	}

	public void setNum_despacho(int num_departamento) {
		this.num_despacho = num_departamento;
	}

	public String toString() {
		
		return super.toString()+" año_incorporacion= " + año_incorporacion + ", num_despacho=" + num_despacho + " ";
	}
	

}
