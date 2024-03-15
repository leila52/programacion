package ud7POOavanzado;

public class EmpleadoPorComision extends EmpleadoBaseMasComision {
		
    public EmpleadoPorComision(String nombre, String apellido, int numSeguridadSocial,
                               int ventas, double comision) {
        super(nombre, apellido, numSeguridadSocial, 0, ventas, comision);
    }
    
    
    public double obtenerSalario() {
        return getVentas() * getComision(); 
    }
}

