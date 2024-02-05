package unidad6ObjetosBasico;

public class ejemploforeach {

	public static void main(String[] args) {
		Integer []nums= {2,3,9,8,null};
		//integer es un objeto
		for(Integer n:nums) {
			System.out.println(n);
		}
		int []num= {2,3,9,8,3,9};
		for(int n:num) {
			System.out.println(n);
		}

		

	}

}
