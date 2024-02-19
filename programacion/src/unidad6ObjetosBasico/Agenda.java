package unidad6ObjetosBasico;

public class Agenda {
	private final int TAM = 10;
	private int cont;
	private Contacto [] contactos;
	
	public Agenda() {
		this.contactos  = new Contacto [10];
		this.cont=0;
	}
	public void anadirContacto( Contacto c) {
		if(cont < TAM) {
			contactos[cont] = c;
			cont++;
			System.out.println("se ha añadido correctamente");
		}else
			System.out.println("no se ha añadido esta llena");

	}
	public boolean existecontacto(Contacto c) {
		for(int i=0;i < TAM;i++) {
			if(!contactos[i].equals(null)) {
				if(contactos[i].getNombre().equals(c) && contactos[i].getNumero().equals(c) ) {
					return true;
				}
			}
		}return false;
	}
	public void listarContactos() {
		String cadena="";
		for(int i=0; i< TAM ; i++) {
			if(contactos[i] != null) {
			cadena+=contactos[i].toString()+"\n";
			System.out.println(cadena);
			}
		}	
	}
	public void buscaContacto( String nombre) {
		for(int i=0;i < TAM;i++) {
			if(contactos[i].equals(null)) {
				System.out.println("no existe");
			}else {
				if(contactos[i].getNombre().equals(nombre)) {
					System.out.println(contactos[i].getNumero());
				}
			}
		}
	}
	
	public void eliminarContacto(Contacto c) {
		for(int i=0; i<cont;i++) {
			if(contactos[i] != null && contactos[i].getNombre().equals(c) && contactos[i].getNumero().equals(c)) {
				contactos[i] = null;
				cont--;
				System.out.println("se ha eniminado correctamente");
			}
	}
	System.out.println("no se ha podido eliminar ya q no esta en la agenda");
	}
	
	public void agendallena() {
		if(cont == TAM) {
			System.out.println("la agenda esta llena");
		}else {
			System.out.println("todavia esta sin llenar ");
		}
	}
	public void huecoslibres() {
		if(cont < TAM) {
			int diferencia= TAM - cont;
			System.out.println("quedan libres "+ diferencia+" huecos");
		}else {
			System.out.println("no quedan huecos");
		}
	}
}
