package ud7POOavanzado;

public class EmpleadoBaseMasComision extends Empleado {
    private int ventas;
    private double comision;
    
    public EmpleadoBaseMasComision(String nombre, String apellido, int numSeguridadSocial, double salarioBase, int ventas, double comision) {
        super(nombre, apellido, numSeguridadSocial, salarioBase);
        this.ventas = ventas;
        this.comision = comision;
    }
    
    
    public double getSalario() {
        return getSalarioBase() + (ventas * comision);
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}

