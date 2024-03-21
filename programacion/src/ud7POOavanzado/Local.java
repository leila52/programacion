package ud7POOavanzado;

public class Local extends Inmueble{
	private int numeroVentanas;
	public Local(String direccion, double metrosCuadrados, int edadInmueble, boolean nuevo, int numeroVentanas) {
        super(direccion, metrosCuadrados, edadInmueble, nuevo);
        this.numeroVentanas = numeroVentanas;
    }
	
	//se sobreescribe
	public double calcularPrecioFinal() {
		double precioBase = super.calcularprecioBase();
        if (super.getMetrosCuadrados() > 50) {
            precioBase=precioBase+precioBase*0.01; 
        }
        if (numeroVentanas == 0 || numeroVentanas == 1) {
            precioBase =precioBase-precioBase*0.02;
        }
        if (numeroVentanas > 4) {
            precioBase =precioBase+precioBase*0.02;
        }
        return precioBase;
	}

}
