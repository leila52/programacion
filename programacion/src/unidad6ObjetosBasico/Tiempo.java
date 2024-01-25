package unidad6ObjetosBasico;

public class Tiempo {
	private int hora;
	private int minutos;
	private int segundos;
	//constructores setter
	 public Tiempo(int hour,int min, int sec) {
		 cambiarHora(hour,min,sec);
		
	 }
	 public Tiempo(int houro,int minu) {
		 cambiarHora(houro,minu,00);
		 
	 }

	public Tiempo(int houro) {
		cambiarHora(houro,00,00);
		 
	}
	public void cambiarHora(int hour,int min, int sec) {
		if(hour<24 && hour >=00) 
			 hora=hour;
		 else
			 hora=00;
		 if(min>=0 && min<=59)
			minutos=min;
		 else
			 minutos=00;
		 if(min>=0 && min<=59)
			segundos=sec;
		 else
			 segundos=00;	
	}
	public void aumentaunsegundo() {
		segundos++;
		if (segundos ==60) {
			segundos=00;
			minutos++;
		}if(minutos==60) {
			minutos=00;
			hora++;
		}if(hora==24) {
			hora=00;
		}	
			
	}
	public String dameHora(){
		return hora+":"+minutos+":"+segundos;
		
		
		
	}
}
