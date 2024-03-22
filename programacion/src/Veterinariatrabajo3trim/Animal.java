package Veterinariatrabajo3trim;

public abstract class Animal {
	
	private String nombre,especie;
	
	public Animal(String nombre,String especie) {
		this.nombre=nombre;
		this.especie=especie;
	}
	//metodo abstracto solo se define la cabecera
	public abstract void DameFichaAnimal();
	
	public String getNombre() {
		return nombre;
	}
	public String getEspecie() {
		return especie;
	}
	
	
}

