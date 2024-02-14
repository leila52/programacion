package Sanvakentin;

public class Regalo {
	
	private String nombre;
	private double precio;
	private String descripccion;
	
	
	//cinstructor
	public Regalo(String nom, double pre , String desc) {
		nombre=nom;
		precio=pre;
		descripccion=desc;
	}
	public String damenombre() {
		return nombre;
	}
	public double dameprecio() {
		return precio;
	}
	public String damedescripcion() {
		return descripccion;
	}
	public String toString() {
		return "el nombre del regalo "+nombre+
				" con un precio de "+precio +
				" y es "+descripccion;
	}

}
