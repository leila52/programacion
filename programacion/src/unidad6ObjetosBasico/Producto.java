package unidad6ObjetosBasico;

public class Producto {
	private String nombre;
	private double precio;
	private int cantidad;
	
	public Producto(String nombre,double precio,int cantidad){
		this.nombre=nombre;
		this.precio=precio;
		this.cantidad=cantidad;
		
	}
	//getters
	public String damenombre(){
		return nombre;
	}
	public double dameprecio() {
		return precio;
		
	}
	public int damecantidad() {
		return cantidad;
	}
	//setters
	public void cambiarnombre(String nombre) {
		this.nombre=nombre;
	}
	public void cambiarprecio( double precio) {
		this.precio=precio;
	}
	public void cambiarcantidad(int cantidad) {
		this.cantidad=cantidad;
	}
	
	//tostring
	public String tostring() {
		return "el producto de nombre:"+nombre+" ,con este precio: "+precio+" con esta cantidad"+cantidad;
	}
}
