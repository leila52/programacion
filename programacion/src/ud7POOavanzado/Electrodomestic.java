package ud7POOavanzado;

public class Electrodomestic {
	private double precioBase,peso;
	private String color;
	private char consumoEnergetico;
	private final String [] COLORESDISPONIBLES= {"blanco","negro","rojo","azul","gris"};
	private final double PRECIOPORCONSUMO[]= {100,80,60,50,30,10};
	private final double PRECIOPORPESO[]= {10,50,80,100};
	
	
	
	//constructor por defecto
	public Electrodomestic() {
		this.precioBase=100;
		this.color="blanco";
		this.consumoEnergetico='F';
		this.peso=5;
		
	}
	public Electrodomestic(double precioBase,double peso) {
		this.color="blanco";
		this.consumoEnergetico='F';
		this.precioBase=precioBase;
		this.peso=peso;
	}
	public Electrodomestic(double precioBase,String color,char consumoEnergetico,double peso) {
		this(precioBase,peso);
		//funcioncomprobar color
		comprobarColor(color);
		//funcion comprobar consumoenergetico
		comprobarConsumoEnergetico(consumoEnergetico);
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public double getPeso() {
		return peso;
	}
	public String getColor() {
		return color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	private void comprobarConsumoEnergetico(char letra) {
		if(letra >= 'A' && letra <='F') {
			this.consumoEnergetico=letra;
		}else
			this.consumoEnergetico='F';
	}
	private void comprobarColor(String color) {
		
	}
	public double precioFinal() {
		double precioFinal=this.precioBase;
		//precio por consumo energetico
		int indicedeconsumo=this.consumoEnergetico-'A';
		if(indicedeconsumo >=0 && indicedeconsumo <  PRECIOPORCONSUMO.length) {
			precioFinal += PRECIOPORCONSUMO[indicedeconsumo];
		}else
			precioFinal += PRECIOPORCONSUMO[PRECIOPORCONSUMO.length-1];
		 //por peso
		if(this.peso >= 0&& this.peso <20)
			precioFinal+= PRECIOPORPESO[0];
		else if(this.peso <50)
			precioFinal+= PRECIOPORPESO[1];
		else if(this.peso <80)
			precioFinal+= PRECIOPORPESO[2];
		else
			precioFinal+= PRECIOPORPESO[3];
		return precioFinal;
	}
	
	
	
	
	
	
	
	
	
}
