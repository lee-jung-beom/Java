package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 석차 구하기 : 점수를 비교해 작은 정수의 등수를 증가시키는 방식
		 * 선택정렬: 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * 버블정령: 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수를 뒤로 밀고 중간에 삽입하는 방식 
		 * 
		 */
		
//		int[] arr = new int[10];
//		
//		for(int i = 0; i< arr.length; i++){
//			arr[i] = (int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
		
		//석차 구하기
//		int[] rank = new int[arr.length];
//		for(int i = 0; i < arr.length; i++){
//			rank[i] = 1;
//		}
//		
//		for(int i = 0; i < arr.length; i++){
//			for(int j=0; j<arr.length; j++){
//				if(arr[i] < arr[j]){
//					rank[i]++;
//				}
//			}
//		}
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(arr[i] + " : " + rank[i] + "등");
//		}
		
		//선택정렬: 가장 작은 것을 찾아서 앞으로 보내는 방식
//		int size = arr.length;
//		int min = 0;
//		int temp;
//		
//		for(int i = 0; i < size-1; i++){
//			min = i;
//			for(int j = i+1; j < size; j++){
//				if(arr[min] > arr[j]){
//					min = j;
//				}
//			}
//			temp = arr[min];
//			arr[min] = 
//		}
		
		//선택 정렬 이해하기 위한 표
		/*
		 * i,j
		 * 0,1  0,2  0,3  0,4 
		 * 1,2  1,3  1,4  1,5
		 * 2,3  2,4  2,5  2,6 
		 * 3,4  3,5  3,6  3,7 
		 */
		
//		for(int i = 0; i < arr.length -1; i++){
//			int min = i;
//			for(int j = i + 1; j < arr.length; j++){
//				if(arr[j] < arr[min]){
//					min = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
	
		
		//버블정렬
		/* 
		 * 0,1  1,2  2,3  3,4  4,5  5,6  6,7  7,8  8,9
		 * 0,1  1,2  2,3  3,4  4,5  5,6  6,7  7,8  
		 * 0,1  1,2  2,3  3,4  4,5  5,6  6,7  
		 * 0,1  1,2  2,3  3,4  4,5  5,6  
		 * 0,1  1,2  2,3  3,4  4,5  
		 * 0,1  1,2  2,3  3,4  
		 * 0,1  1,2  2,3    
		 * 0,1  1,2    
		 * 0,1      
		 */
//		int[] arr = new int[10];
//		
//		for(int i = 0; i< arr.length; i++){
//			arr[i] = (int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
		
//		int max;
//		
//		for(int i = 0; i < arr.length; i++){
//			for(int j = i+1; j < arr.length; j++){
//				if(arr[i] > arr[j]){
//					arr[j]= arr[i]; //앞의 큰 정수가 뒤의 인덱스에 저장된다		
//				}
//				
//			}
//			arr[i] = temp;
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
//		for (int i = 0; i < arr.length - 1; i++) {
//			boolean flag = true;
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//					flag = false;
//				}				
//			}
//			if (flag) {
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		//삽입정렬
		int[] arr = new int[10];
		
		for(int i = 0; i< arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			int j = 0;
			for(j = i - 1; j >= 0; j--){
				if(temp < arr[j]){
					arr[j + 1] = arr[j];
				}else{ 
					break;
				}
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	} //main블럭

}
