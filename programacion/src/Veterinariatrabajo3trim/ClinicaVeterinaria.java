package Veterinariatrabajo3trim;

import java.util.ArrayList;

public class ClinicaVeterinaria {
	private ArrayList<Animal> listaAnimal;
	
	//constructor
	public ClinicaVeterinaria() {
        listaAnimal = new ArrayList<>();
    }
	
	
	public void insertarAnimal(Animal animal) {
		listaAnimal.add(animal);
	}
	
	//buscar
	public Animal buscarAnimal(String nombre) {
		for(int i=0;i<listaAnimal.size();i++) {
			Animal animal=listaAnimal.get(i);
			if(animal.getNombre().equals(nombre)){
				return animal;
			}
		}
		return null;
	}
	
	public boolean modificarComentarioAnimal(String nombre,String nuevcoment) {
		for(int i=0;i<listaAnimal.size();i++) {
			Animal animal=listaAnimal.get(i);
			if(animal.getNombre().equals(nombre)) {
				animal.setComentarios(nuevcoment);
				return true;
			}
		}return false;
	}
	
	public String toString() {
		String fichadetodo="";
		for(int i=0;i<listaAnimal.size();i++) {
			fichadetodo +=listaAnimal.get(i).DameDatosAnimal()+"\n";
		}
		return fichadetodo;
		
	}

}
