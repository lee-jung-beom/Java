package mine;

public class my_mine2 {

	public static void main(String[] args) {
		//3차원 배열을 이용한 달력 만들기
		int[][][] num = new int[12][5][7];
		int temp = 0;
		int[] sum = new int[7];
		
		for(int i = 1; i < num.length; i++){
			System.out.println();
			System.out.println();
			System.out.println("\t\t\t\t" + i + "월");
			System.out.println();
			for(int j = 0; j < num[i].length; j++){
				for(int k = 0; k < num[i][j].length; k++){
					
				}
				System.out.println();
			}
		}
		
	} //main 블럭

}

 