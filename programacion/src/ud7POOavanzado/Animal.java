package ud7POOavanzado;
//es una clase abstracta ya q tiene al menos un metodo abstracto
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
