package ud7POOavanzado;

public class Piso extends Inmueble {
	private int piso;
	
	public Piso(String direccion, double metrosCuadrados, int edadInmueble, boolean nuevo, int piso) {
        super(direccion, metrosCuadrados, edadInmueble, nuevo);
        this.piso = piso;
    }
	//se sobreescribe
	public double calcularPrecioFinal() {
		double precioBase=super.calcularprecioBase();
		if(piso>=3) {
			precioBase=precioBase+precioBase*0.03;
		}
		return precioBase;
	}

}
