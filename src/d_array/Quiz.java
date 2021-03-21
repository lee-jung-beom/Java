package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		//거스름돈 동전 개수
//		int money = (int)(Math.random()*500)*10;
//		int[] coin = {500, 100, 50 , 10};
//		System.out.println("거스름돈: " + money);
		
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요
		 * 
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100월 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 */
//		int money = (int)(Math.random()*500)*10; // 돈 액수 범위를 0 ~ 5000원으로 정의
//		System.out.println(money); 
//		int[] coin = {500, 100, 50, 10}; //4개의 인덱스에 각 동전 크기 저장
//		int[] change = new int[coin.length]; //각 동전을 전체 액수에서 나눈 값 저장	
//
//			for (int i = 0; i < change.length; i++) {
//				change[i] = money/coin[i];
//				money = money % coin[i];
//		}
//		System.out.println("거스름돈[500원, 100원, 50원, 10원]> " + Arrays.toString(change));
		
		//솔루션
//		for(int i = 0; i < coin.length; i++){
//			int count = money / coin[i];
//			money = money % coin[i];
//			System.out.println(coin[i] + "원 : " + count + "개");
//		}
		
		//그래프 그리기
//		int[] arr = new int[20];
//		for(int i = 0; i < arr.length; i++){
//			arr[i] = (int)(Math.random()*5)+1;
//		}
//		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5사이의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.
		 * 
		 * [4, 3, 2, 1, 1, 1, 4, 4, 5, 6, 3, 6, 2, 3, 1, 2, 3, 1, 2, 4]
		 * 1: ***** 5
		 * 2: **** 4
		 * 3: **** 4
		 * 4: **** 4
		 * 5: *** 3
		 */
//		int compare = 0; 
//		int count = 0; //각 숫자의 개수를 저장할 변수
//		int[] saveNumber = new int[20];
//		char star = '*';
//		
//		for(compare = 1; compare <= 5; compare++){ 
//				count = 0;			
//			for(int i = 0; i < arr.length; i++){
//				if(compare == arr[i]){
//					count++;
//				}				
//			}
//			for(int j = 0; j < count; j++){
//				System.out.print(star);
//			}
//		}
		
		//솔루션
//		int[] counts = new int[5];
//		for(int i = 0; i < arr.length; i++){
//			counts[arr[i] - 1]++;
//		}
//		for(int i = 0; i < counts.length; i++){
//			System.out.print(i + 1 + ":");
//			for(int j = 0; j < counts[i]; j++){
//				System.out.print("*");
//			}
//			System.out.println(" " + counts[i]);
//		}
		
		//중복되지 않는 배열
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++){
//			arr[i] = (int)(Math.random()*5)+1;
//		}
//		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		 * [4, 2, 1, 2, 5, 1, 4, 4, 2, 1]
		 * [4, 2, 1, 5] 
		 */
//		int count = arr.length;
//		
//		for(int i = 0; i < arr.length; i++){
//			for(int j = 0; j < arr.length; j++){
//				if(arr[i] == arr[j]){
//					count--;
//					break;
//				}else if(arr[i] != arr[j]){
//					count = arr.length;
//				}
//				
//			}
//			arr[i] = arr[i];
//			arr = new int[count];
//		}
//		System.out.println(Arrays.toString(arr));
//		int[] temp = new int[5];
//		int count = 0;
//		
//		for(int i = 0; i < arr.length; i++){
//			boolean flag = true;
//			for(int j = 0; j < temp.length; j++){
//				if(arr[i] == temp[j]){
//					flag = false;
//				}
//			}
//			if(flag){
//				temp[count++] = arr[i];
//			}
//		}
//		int[] result = new int[count];
//		for(int i = 0; i < result.length; i++){
//			result[i] = temp[i];
//		}
//		System.out.println(Arrays.toString(result));
//		
//		
//		arr = new int[100];
//		for(int i = 0; i < arr.length; i++){
//			arr[i] = (int)(Math.random() * 100)+1;
//		}
		
		
		/*
		 * <과제>
		 * 2 ~ 5사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.
		 * 5
		 * [5, 10, 15, 20, 25, 30]
		 * %를 사용하여 나머지가 0인 값이 떨어지는 것
		 */
		int Number = (int)(Math.random()*5 + 2); // 2~5 랜덤 수: 이것으로만 나누어 떨어지게 하자 
		// (Number * i) / Number -> i는 반복문을 사용하여 증가시킨다
		int[] saved = new int[7];
		
		
		for(int i = 1; i < 7; i++){
			int temp = (Number * i) % Number;
			if(temp == 0){
				saved[i] = Number * i; //출력하는 목적이 되는 값*
			}
		}
		System.out.println("임의의 정수> " + Number);
		System.out.println(Arrays.toString(saved));	
		
	} //main블럭

}
