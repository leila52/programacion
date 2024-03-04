package ud7POOavanzado;

public class usoEmpleado {

	public static void main(String[] args) {
		Comercial ep=new Comercial("1234","MARIA",5645,45);
		System.out.println("nombre: "+ ep.getNombre()+ " dni"+ep.getDni()+"cobro "+ep.getSueldo());
		
		
		Tecnico el=new Tecnico("1233","MANU",2500,"java");
		System.out.println("nombre"+el.getNombre()+"sueldo"+el.getSueldo()+"puesto: "+el.getTecnologia());
	}

}
