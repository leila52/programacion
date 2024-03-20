package ud7POOavanzado;

public class Inmueble {
	private String direccion;
	private double metrosCuadrados;
	private int edadInmueble;
	private boolean nuevo;
	
	public Inmueble(String direccion, double metrosCuadrados, int edadInmueble,boolean nuevo) {
		this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.edadInmueble=edadInmueble;
        this.nuevo = nuevo;
	}
	public double calcularprecioBase() {
		double precioBase=1000;
		
		if(!nuevo) {
			if(edadInmueble<15) {
				precioBase=precioBase-precioBase*0.01;
			}else {
				precioBase=precioBase-precioBase*0.02;
			}
			
		}
		return precioBase;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public int getEdadInmueble() {
		return edadInmueble;
	}
	public void setEdadInmueble(int edadInmueble) {
		this.edadInmueble = edadInmueble;
	}
	public boolean isNuevo() {
		return nuevo;
	}
	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

}
