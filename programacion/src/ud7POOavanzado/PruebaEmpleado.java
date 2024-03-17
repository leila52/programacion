package ud7POOavanzado;

public class PruebaEmpleado {

	public static void main(String[] args) {
		 // Crear un empleado base más comisión
		        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Juan", "García", 123456789, 1000.0, 50, 789.99);
		        
		        // Crear un empleado por comisión
		        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Ana", "Martínez", 987654321, 30, 134.7);
		        
		        // Mostrar información de los empleados
		        System.out.println("Información del empleado base más comisión:");
		        System.out.println("Nombre: " + empleadoBaseMasComision.getNombre());
		        System.out.println("Apellido: " + empleadoBaseMasComision.getApellido());
		        System.out.println("Número de Seguridad Social: " + empleadoBaseMasComision.getNumSeguridadsocial());
		        System.out.println("Salario Base: " + empleadoBaseMasComision.getSalarioBase());
		        System.out.println("Ventas: " + empleadoBaseMasComision.getVentas());
		        System.out.println("Comisión: " + empleadoBaseMasComision.getComision());
		        System.out.println("Salario Total: " + empleadoBaseMasComision.getSalario());
		        System.out.println();
		        
		        System.out.println("Información del empleado por comisión:");
		        System.out.println("Nombre: " + empleadoPorComision.getNombre());
		        System.out.println("Apellido: " + empleadoPorComision.getApellido());
		        System.out.println("Número de Seguridad Social: " + empleadoPorComision.getNumSeguridadsocial());
		        System.out.println("Ventas: " + empleadoPorComision.getVentas());
		        System.out.println("Comisión: " + empleadoPorComision.getComision());
		        System.out.println("Salario Total: " + empleadoPorComision.obtenerSalario());
		    }
		

	}

