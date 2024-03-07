package ud7POOavanzado;

public class PersolaServicio extends Empleado {
	
	private String seccion;
	
	public PersolaServicio(int año_incorporacion, int num_despacho, String nombre, String apellido, String dni,
			String estado_civil, String seccion) {
		super(año_incorporacion, num_despacho, nombre, apellido, dni, estado_civil);
		this.seccion = seccion;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return super.toString()+ " con seccion= " + seccion + "";
	}

}
