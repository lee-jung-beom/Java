package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 2021-03-23 시험문제(그대로 출제할 거임)
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100 사이의 랜덤값으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 이름		국어		영어		수학		사회		과학		Oracle		Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90			90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90			90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90			90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90			90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90			90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450			450	
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00		90.00	
		 */
		
//		String[] subjectName = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java", "합계", "평균", "석차"};
		int[][] score = new int[5][7]; //5레코드, 7칼럼 
		String[] name = {"보라돌이", "뚜비", "나나", "뽀", "그린"};		
		int[] sum = new int[score.length]; 
		double[] avg = new double[score.length];
		
		int[] sum_down = new int[score[0].length];
		double[] avg_down = new double[score[0].length];

		System.out.println("이름\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차");
		for(int i = 0; i < score.length; i++){
			System.out.printf("%s", name[i]);
			for(int j = 0; j < score[i].length; j++){
				score[i][j] = (int)(Math.random()*100);
				sum[i] += score[i][j]; //과목 합계
				avg[i] = sum[i] / score[i].length; //과목 평균
		
//				sum_down[score[i].length] += score[i][j];
//				avg_down[score[i].length] = score[i][j]/score.length;
		
				System.out.printf("\t%d", score[i][j]);
			}			
			System.out.printf("\t%d", sum[i]);
			System.out.printf("\t%.2f", (double)avg[i]);
			System.out.println();
		}
		
		System.out.print("과목합계");
		for(int i = 0; i < score[0].length; i++){
			for(int j = 0; j < score.length; j++){
				sum_down[i] += score[j][i];
			}
			System.out.printf("\t%d", sum_down[i]);		
		}
		
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < score[0].length; i++){
			for(int j = 0; j < score.length; j++){
				avg_down[i] = sum_down[i] / score.length; 
			}	 
			System.out.printf("\t%.2f", (double)avg_down[i]);			
		}
	
		
		
	} // main블럭

}
