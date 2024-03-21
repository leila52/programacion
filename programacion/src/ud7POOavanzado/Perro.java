package ud7POOavanzado;

public class Perro extends Animal{
	
	private String raza,microchip;
	
	public Perro(String nombre,String fechaNacimiento,double peso,String raza,String microchip) {
		super(nombre,fechaNacimiento,"",peso);
		if(raza.equals("PastorAleman")||raza.equals("Husky")||raza.equals("FoxTerrier")) {
			this.raza=raza;
		}else
			this.raza="no tiene raza";
		
		this.microchip=microchip;
				
		
	}
	public String getRaza() {
		return raza;
	}

	public String getMicrochip() {
		return microchip;
	}
	public String damedatosAnimal() {
		String datos;
		datos ="Perro: "+getNombre()+" su fecha :"+getFechaNacimiento()+" comentario"
		+getComentario()+" con un peso:"+getPeso()+" con una raza "+getRaza()+" microchip:"+getMicrochip();
		
		return datos;
	}

	
}
