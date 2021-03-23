package mine;

import java.util.Arrays;

public class check {

	public static void main(String[] args) {
		String[] names = {"1", "2", "3", "4", "5", "6"};
		int[][] score = new int[6][7];
		
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				score[i][j] = (int)(Math.random()*100);
			}
			System.out.println(Arrays.toString(score));
		}
		
//		System.out.println(Arrays.toString(score));
	}

}
