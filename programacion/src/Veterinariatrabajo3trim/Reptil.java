package Veterinariatrabajo3trim;

public class Reptil extends Animal{
	private String especie;
	private boolean venenoso;
	
	public Reptil(String nombre, String fechaNacimiento, String comentarios, double peso, String especie, boolean venenoso) {
        super(nombre, fechaNacimiento, comentarios, peso);
        if(especie.equals("Tortuga")|| especie.equals("Iguana")||especie.equals("DragonDeComodo")) {
        	this.especie = especie;
        }else {
        	this.especie ="Lagarto";
        }
        this.venenoso = venenoso;
    }

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public String DameDatosAnimal() {
        String datos;
        if(isVenenoso()==true) {
        datos =  "Reptil : su nombre " + getNombre() + " de especie: " + getEspecie() + "\n" +
	                "su fecha de nacimiento: " + getFechaNacimiento() + "\n" +
	                "con peso: " + getPeso() + "\n" +
	                "es muy venenoso " + "\n" +
	                "su comentarios: " + getComentarios();
        }else {
        	 datos =  " Reptil : su nombre " + getNombre() + " de especie: " + getEspecie() + "\n" +
 	                " su fecha de nacimiento: " + getFechaNacimiento() + "\n" +
 	                " con peso: " + getPeso() + "\n" +
 	                "  no es venenoso " + "\n" +
 	                " su comentarios: " + getComentarios();
        }
        return datos;
	}

}
