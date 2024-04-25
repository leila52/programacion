package ud9;

public class UsoVentanaQueCambia {

	public static void main(String[] args) {
		Ventana1 v1=new Ventana1();
		Ventana2 v2=new Ventana2();
		
		v1.setVentana2(v2);
		v2.setVentana1(v1);

	}

}
