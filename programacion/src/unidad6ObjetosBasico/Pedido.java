package unidad6ObjetosBasico;

public class Pedido {
	private Cliente cliente;
	private Producto [] productos;
	private String fecha;
	private int cont;
	
	public Pedido(String fecha, Cliente cliente) {
		this.cont=0;
		this.fecha=fecha;
		this.cliente=cliente;
		this.productos=new Producto[10];
	}
	public boolean agregarproducto(Producto produ) {
		if(cont< productos.length) {
			productos[cont]=produ;
			cont++;
			return true;
		}
		else
			return false;
	}
	public Producto buscaProducto(String nombre) {
		for(int i=0;i< cont;i++) {
			if(nombre.equals(productos[i].damenombre())) {
				return productos[i];
			}
				
		}
		return null;
	}
	public double calcularPreciototal() {
		double total=0;
		for(int i=0;i<cont;i++) {
			total+=productos[i].dameprecio()*productos[i].damecantidad();
		}
		return total;
	}
}
