package Veterinariatrabajo3trim;

public class Reptil extends Animal{
	private String especie;
	private boolean venenoso;
	
	public Reptil(String nombre, String fechaNacimiento, String comentarios, double peso, String especie, boolean venenoso) {
        super(nombre, fechaNacimiento, comentarios, peso);
        this.especie = especie;
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
        datos = "Reptil: Nombre " + getNombre() + " de especie: " + getEspecie() + "\n" +
                "Fecha de Nacimiento: " + getFechaNacimiento() + "\n" +
                "Peso: " + getPeso() + "\n" +
                "¿Venenoso?: " + (venenoso ? "Sí" : "No") + "\n" +
                "Comentarios: " + getComentarios();
        return datos;
	}

}
