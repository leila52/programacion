package Veterinariatrabajo3trim;

public class Pajaro extends Animal{
	private String especie;
	private boolean cantor;
	public Pajaro(String nombre, String fechaNacimiento, String comentarios, double peso, String especie, boolean cantor) {
        super(nombre, fechaNacimiento, comentarios, peso);
        this.especie = especie;
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
        datos = "Pájaro: Nombre " + getNombre() + " de especie: " + getEspecie() + "\n" +
                "Fecha de Nacimiento: " + getFechaNacimiento() + "\n" +
                "Peso: " + getPeso() + "\n" +
                "¿Cantor?: " + (cantor ? "Sí" : "No") + "\n" +
                "Comentarios: " + getComentarios();
        return datos;
	}

}
