package unidad6ObjetosBasico;

public class Tiempo {
	private int hora;
	private int minutos;
	private int segundos;
	
	 public Tiempo(int hour,int min, int sec) {
		 if(hour<24 && hour >=0) 
			 hora=hour;
		 else
			 hora=0;
		 if(min>=0 && min<=59)
			minutos=min;
		 else
			 minutos=0;
		 if(min>=0 && min<=59)
			segundos=sec;
		 else
			 segundos=0;
		
	 }
	 public Tiempo(int houro,int minu) {
		 
			hora=houro;
			minutos=minu;
			segundos=0;
		 
	 }

	public Tiempo(int houro) {
		 
			hora=houro;
			minutos=0;
			segundos=0;
		 
	}
	public void cambiarHora(int hour,int min, int sec) {
		hora=hour;
		minutos=min;
		segundos=sec;
	}
	public String dameHora(){
		return hora+":"+minutos+":"+segundos;
		
		
		
	}
	public double damehora() {
				return hora;
			}
	 public double damemin() {
			return minutos;
		}
	 public double dameseg() {
			return segundos;
		}
	 public void hora () {
			System.out.print(hora +":");
			System.out.print(minutos);
		}
}
