package und4;

public class arraybidimensional {

	public static void main(String[] args) {
		int[][] matriz=new int [3][3];
		int num=2;
		//matriz[0][0]=2;
		//matriz[0][1]=4;
		//matriz[0][2]=6;
		//matriz[1][0]=8;
		//....
		//matriz[2][2]=18;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz[i][j]=num;
				num=num+2;
			}
		}
	}

}