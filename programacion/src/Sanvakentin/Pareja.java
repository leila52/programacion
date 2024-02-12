package Sanvakentin;

public class Pareja {
	private Persona persona1;
	private Persona persona2;
	private Regalo regaloparaPersona1;
	private Regalo regaloparaPersona2;
	
	public Pareja (Persona persona1, Persona persona2) {
		this.persona1=persona1;
		this.persona2=persona2;
		regaloparaPersona1=null;
		regaloparaPersona2=null;
	} 
	public void setRegaloparapersona1(Regalo regalo1) {
		this.regaloparaPersona1=regalo1;
	}
	public void setRegaloparapersona2(Regalo regalo2) {
		this.regaloparaPersona2=regalo2;
	}
	public double CosteTotal() {
		double total;
		total=regaloparaPersona1.dameprecio()+regaloparaPersona2.dameprecio();
		return total;
	}
	public String mostrardetalles() {
		return "El primer regalo: "+regaloparaPersona1.toString()+ 
				"\n El segundo regalo: "+ regaloparaPersona2.toString()+
				"\n El total del precio de los regalos es de : "+ CosteTotal();
		
	}
	public String toString() {
		return "son pareja "+this.persona1 + " \n y "+this.persona2 + 
				" \n se han hecho estos regalos"+ mostrardetalles();
	}
	
}
