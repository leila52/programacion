package ud7;

import java.net.MulticastSocket;

public class usoEmpleado {

	public static void main(String[] args) {
		Comercial ep=new Comercial("1234","MARIA",5645,45);
		System.out.println("nombre: "+ ep.getNombre()+ " dni"+ep.getDni()+"cobro "+ep.getSueldo());
		
		
		Tecnico el=new Tecnico("1233","MANU",2500,"java");
		System.out.println("nombre"+el.getNombre()+"sueldo"+el.getSueldo()+"puesto: "+el.getTecnologia());
	
		//aumentasr la capacidad de polimorfismo de objetos
		
		Empleado[] empleados =new Empleado[2];
		empleados[0]=ep;
		empleados[1]=el;
		for(int i=0; i<empleados.length;i++) {
			System.out.println(empleados[i]);
		}
		//quiero cambiar la comision del comer a 1200 a traves del array
		Comercial c=(Comercial)empleados[0];
		c.setComision(1200);
		
		
		//objeto instanceof clase
		//devuleve true si el objeto pertenece a la clase
		//y devulve false si no pertenece
		if(empleados[1] instanceof Comercial) {
			Comercial c2=(Comercial)empleados[1];
			c2.setComision(1200);
		}else {
			System.out.println("error");
		}
		
	}

}
