package Veterinariatrabajo3trim;

public class Gato extends Animal{
	private String raza,microchip;
	
	public Gato(String nombre, String fechaNacimiento, String comentarios, double peso, String raza, String microchip) {
		super(nombre, fechaNacimiento, comentarios, peso);
        if (raza.equals("Comun") || raza.equals("Siames") || raza.equals("Persa") || raza.equals("Angora") || raza.equals("ScottishFold")) {
            this.raza = raza;
        } else {
            this.raza = "Comun";
        }
        this.microchip = microchip;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getMicrochip() {
		return microchip;
	}

	public void setMicrochip(String microchip) {
		this.microchip = microchip;
	}
	public String DameDatosAnimal() {
		String datos;
        datos = "Gato: su nombre es :  " + getNombre() + " de  raza: " + getRaza() + "\n" +
                " su fecha de nacimiento: " + getFechaNacimiento() + "\n" +
                " con un peso: " + getPeso() + "\n" +
                " su microchip: " + getMicrochip() + "\n" +
                " y su comentarios: " + getComentarios();
        return datos;
	}

}
