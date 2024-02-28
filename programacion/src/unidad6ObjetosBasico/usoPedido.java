package unidad6ObjetosBasico;

public class usoPedido {

	public static void main(String[] args) {
		Cliente cli=new Cliente("leila","1277");
		Producto p1=new Producto("mosca",45.6,4);
		Producto p3=new Producto("cebolla",5.6,7);
		Pedido pedi=new Pedido("12-23-24",cli);
		
		if(pedi.agregarproducto(p3)==true) {
			System.out.println("se ha añadido perfectamente");
			
		}else
			System.out.println("no se lleno");
		if(pedi.agregarproducto(p1)==true) {
			System.out.println("se ha añadido perfectamente");
			
		}else
			System.out.println("no se lleno");
		Producto ns =pedi.buscaProducto("mosca");
		System.out.println("el producto q buscas es "+ns);
		
		System.out.println("el total es:"+pedi.calcularPreciototal());
	}

}
