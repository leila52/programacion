package Trabajo3evaluacion;

public class Carta {
	private int numero;
	private int palo;
	
	public Carta(int numero,int palo) {
		this.numero=numero;
		this.palo=palo;
	}
	public Carta(int id) {
		//nos dara un numero entre 0 y 9 q se saca con el restro de 10
		this.numero=(id-1)%10 +1;
		//nos da los 4 palos q hay dividiendolo
		this.palo=(id-1)/10;
		
	}
	public int getNumero() {
		return numero;
	}
	
	public int getPalo() {
		return palo;
	}
	
	public String getNombreNumero() {
		String[] nombres= {"as","dos","tres","cuatro","cinco","seis","siete","sota"
				,"caballo","rey"};
		return nombres[numero-1];
	}
	public String getNombrePalo() {
		String []palos= {"oros","copas","espadas","bastos"};
		return palos[palo];
	}
	public String getNombrecarta() {
		return getNombreNumero()+" de "+ getNombrePalo();
	}
	
	public int getValoreTute() {
		if(numero ==1)
			return 11;
		else if(numero==3)
			return 10;
		else if(numero>=8)
			//duda
			return 2+numero-8;
		else
			return 0;
	}
	public int getValorMus() {
		if(numero==1 || numero ==2) 
			return 1;
		else if(numero ==3 || numero >=8)
			return 10;
		else
			return numero;
		
	}
	public double getValor7yMedia() {
		if(numero >=8)
			return 0.5;
		else
			return numero;
	}
}
