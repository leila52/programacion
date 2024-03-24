package Veterinariatrabajo3trim;

public class Perro extends Animal{
	private String raza,microchip;
		
		public Perro(String nombre,String fechaNacimiento,String comentarios,
				double peso,String raza,String microchip) {
			super(nombre,fechaNacimiento, comentarios,peso);
			if(raza.equals("PastorAleman") || raza.equals("Husky") || raza.equals("FoxTerrier")) {
				this.raza=raza;
			}else
				this.raza="PastorAleman";
			this.microchip=microchip;
		}
		public String getRaza() {
			return raza;
		}
		public String getMicrochip() {
			return microchip;
		}

		public  String DameDatosAnimal() {
			String datos;
			datos="Perro:Nombre "+getNombre()+"con raza: " + getRaza() + "\n" +
	                "Fecha de Nacimiento: " + getFechaNacimiento() + "\n" +
	                "Peso: " + getPeso() + "Microchip: " + getMicrochip()  +
	                "Comentarios: " + getComentarios();
		return datos;
			
		
}
		
	}