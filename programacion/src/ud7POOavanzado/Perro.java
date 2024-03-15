package ud7POOavanzado;

public class Perro extends Animal{
	
	private boolean muerde;
	
	public Perro(String nombre,String especie) {
		super(nombre,especie);
		muerde=false;
	}
	public void DameFichaAnimal() {
		System.out.println("Perro"+getNombre()+"-"+getEspecie()+"-"+muerde);
	}
}
