package ud7;

public class Comercial extends Empleado {
	private double comision;
	
	// constructor
	
	public Comercial(String dni,String nombre,double sueldo,double comision) {
		//clla,os al constructor de la clase padre
		super (dni,nombre,sueldo); 
		this.comision=comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	//sobreescribimos el metodo,ya q el comercial 
	//tiene comision adicional
	public double getSueldo() {
		
		return super.getSueldo()+comision;
	}
}
