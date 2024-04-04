package universidad;

public class Empleado extends Persona{
private int año_incorporacion,num_despacho,id;
//el atrbuto pertenece a la clase no al objeto
//para ciertas acciones cada vez q utilizas un objeto lo vas a tener q incrementar
//variable global a todos los objetos
private static int idsiguiente=1;
	
	//constructor
	public Empleado(int año_incorporacion,int num_despacho,String nombre,String apellido,String dni,String estado_civil) {
		super(nombre,apellido,dni,estado_civil);
		this.año_incorporacion=año_incorporacion;
		this.num_despacho=num_despacho;
		//va incrementando 
		id=idsiguiente;
		idsiguiente++;
		
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
