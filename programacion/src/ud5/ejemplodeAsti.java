package ud5;
public class ejemplodeAsti {
	public static void main(String[] args) {
		char letra='a';
		//ascii
		//casting o forzado de tipos de char a int 
		char siletra=(char)(letra+1);
		
		System.out.println(letra+1);
		System.out.println(siletra);
		//mostrar todo el abecedario
		for (int i=97;i<=122;i++) {
			char siqletra=(char)(i);
			System.out.print(siqletra+",");
		}
		char letramayu=(char)(letra-32);// "\n" nueva linea
		System.out.println("\n"+letramayu);
	}
}