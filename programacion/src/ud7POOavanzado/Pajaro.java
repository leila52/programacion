package ud7POOavanzado;

public class Pajaro extends Animal{
	private String especie;
	private boolean cantor;
	
	public Pajaro(String nombre,String fechaNacimiento,double peso,String especie) {
		super(nombre,fechaNacimiento,"",peso);
		this.especie=especie;
		this.cantor=true;
	}
	public String getEspecie() {
		return especie;
	}
	public boolean isCantor() {
		return cantor;
	}
	public String damedatosAnimal() {
		String datos;
		if(isCantor()==true) {
			datos ="Pajaro: "+getNombre()+" su fecha :"+getFechaNacimiento()+" comentario"
			+getComentario()+" con un peso:"+getPeso()+" con una especie "+getEspecie()+" es cantor ";
			return datos;
		}
		datos ="Pajaro: "+getNombre()+" su fecha :"+getFechaNacimiento()+" comentario"
				+getComentario()+" con un peso:"+getPeso()+" con una especie "+getEspecie()+" no es cantor ";
		return datos;
		
	}
	
	

}
