package d_array;

import java.util.Arrays;

public class multiDimensionalArray {

	public static void main(String[] args) {
		//2차원
//		int[][] array2;
		
		//3차원
//		int[][][] array3;
		
		
//		int[][] arr = new int[2][3];
		/*
		 * 변수 = 주소1(100번지)
		 * 
		 * 100번지 
		 * {주소2(200번지), 주소3(300번지)}
		 * 
		 * 200번지 
		 * {0, 0, 0}
		 * 
		 * 300번지
		 * {0, 0, 0}
		 * 
		 */
		
		//2차원 배열을 선언하는 2가지 방법
//		int arr2[][] = new int[][]{{1,2,3}, {4,5,6}};
//		int[] arr3[] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
//		int[][] arr4 = new int[3][]; //가변배열 : 2차원 배열 중 두 번째 배열은 아직 선언되지 않음
//		arr4[0] = new int[3];
//		arr4[1] = new int[4];
//		arr4[2] = new int[10];
//		
//		System.out.println(arr[0][1]);
		
//		arr[0] = 10; //값을 저장할 수 없다
//		arr[1] = new int[5]; //1차원에 값을 저장하고 싶으면 배열을 저장해야 한다
		//아니면 밑의 코드와 같이 2차원까지 선언하여 값을 저장하도록 한다
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[1][0] = 100;
		
//		System.out.println(arr.length); //1차원 배열의 길이
//		System.out.println(arr[0].length); //1차원에 접근 후 2차원 배열의 길이를 선언한다
		
//		int[][] arr = new int[2][3];
//		
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[1][0] = 100;
//		
//		for(int i = 0; i < arr.length; i++){
//			for(int j = 0; j < arr[i].length; j++){
//				System.out.print(" " + arr[i][j]);
//			}
//		}
		
		//5과목의 합계, 평균 구하기
		int[][] scores = new int[3][5];
		int[] sum = new int[scores.length];
		double[] avg = new double[scores.length];		
		
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random()*101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
//		scores[0][0] + scores[0][1] + scores[0][2]...
//		scores[1][0] + scores[1][1] + scores[1][2]...
		
//		int saveNumber = 0;
//		int temp = 0;
//		
//		int SUM = 0;
//		int AVG = 0;
//		
//		for(int i = 0; i < scores.length; i++){
//			for(int j = 0; j < scores[i].length; j++){
//				saveNumber += scores[i][j]; 
//				
//			}
//			sum[i] = saveNumber;
//
//			avg[i] = (double)sum[i]/scores[i].length;
//			
//			System.out.println("합계> " + sum[i] + "  //  " + "평균> " + (double)avg[i]);
//		}
		
		
		
	} //main블럭

}
