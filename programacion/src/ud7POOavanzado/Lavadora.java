package ud7POOavanzado;

public class Lavadora extends Electrodomestic {
	private final double CARGADEDEFECTO =5;
	private double carga;
	
	//por defecto
	public Lavadora() {
		this.carga=CARGADEDEFECTO;
	}
	//constructor con precio base
	public Lavadora(double precioBase,double peso) {
		super(precioBase,peso);
		this.carga=CARGADEDEFECTO;
	}
	
	//constructor con todo
	
	public Lavadora (double carga,double precioBase,String color,char consumoEnergetico,double peso) {
		super(precioBase ,color,consumoEnergetico,peso);
		this.carga=carga;
	}
	
	public double getCarga() {
		return carga;
	}
	
	public double precioFinal() {
		//llamamos a la de electrodomesticos para añadirlo
		double precioFinal=super.precioFinal();
		if(this.carga>30) {
			precioFinal +=50;
		}return precioFinal;
	}
}
