package Veterinariatrabajo3trim;

public class Pajaro extends Animal{
	private String especie;
	private boolean cantor;
	public Pajaro(String nombre, String fechaNacimiento, String comentarios, double peso, String especie, boolean cantor) {
        super(nombre, fechaNacimiento, comentarios, peso);
        if(especie.equals("Canario")|| especie.equals("Periquito")||especie.equals("Agapornis")) {
        	this.especie = especie;
        }else {
        	this.especie ="Canario";
        }
        
        this.cantor = cantor;
    }
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public boolean isCantor() {
		return cantor;
	}
	public void setCantor(boolean cantor) {
		this.cantor = cantor;
	}
	public String DameDatosAnimal() {
		String datos;
		if(isCantor()==true) {
	        datos = "Pájaro: su nombre " + getNombre() + " de especie: " + getEspecie() + "\n" +
	                "su fecha de nacimiento: " + getFechaNacimiento() + "\n" +
	                "con peso: " + getPeso() + "\n" +
	                "es cantor " + "\n" +
	                "su comentarios: " + getComentarios();
		}else {
			datos = "Pájaro: su nombre " + getNombre() + " de especie: " + getEspecie() + "\n" +
	                " su fecha de nacimiento: " + getFechaNacimiento() + "\n" +
	                " con peso: " + getPeso() + "\n" +
	                " no es cantor " + "\n" +
	                " su comentarios: " + getComentarios();
		}
        return datos;
	}

}
