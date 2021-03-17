package d_array;


public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경할 수 없다.
		 *  
		 */
		
//		int[] array;
//		array = new int[5];
//		
//		/*
//		 * 변수 = 주소(100번지)
//		 * 
//		 * 100번지
//		 * {0,0,0,0,0}
//		 */
//		
//		array = new int[]{1, 2, 3, 4, 5};
//		
//		array = {1, 2, 3, 4, 5};
//		int[] array2 = {1, 2, 3, 4, 5};
		
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		System.out.println(array[3]);
//		System.out.println(array[4]);
		//변수 뒤의 []괄호는 배열의 길이, 변수명 뒤의 []괄호는 인덱스 번호
		
//		array[0] = 1;
//		array[1] = 3;
//		array[2] = 12;
//		array[3] = 8;
//		array[4] = 9;
		
//		for(int i = 0; i < array.length; i++){
//			System.out.print(" " + array[i]);
//		}
		
//		for(int i = 0; i < array.length; i++){
//			array[i] = (i + 1) * 10;
//			System.out.println(array[i]);
//		}
		
		// 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
//		int[] numArray = new int[10];
		
		// 배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
//		for(int i = 0; i < numArray.length; i++){
//			numArray[i] = (int)(Math.random()*100+1);
//			System.out.println(numArray[i]);
//		}	
		
		//배열에 저장된 모든 값의 합계의 평균을 출력해주세요.
//		int sum = 0;
//		
//		for(int i = 0; i < numArray.length; i++){
//			numArray[i] = (int)(Math.random()*100 + 1);
//			sum += numArray[i];
//		}
		//소수점 단위까지 평균을 구하려면
//		double avg = (double) sum / numArray.length;
//		System.out.println("평균값> " + sum / numArray.length);
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		
//		int[] numArray = new int[10];
//		int max = numArray[0];
//		int min = numArray[0];
//		for(int i = 0; i < numArray.length; i++){
//			
//			numArray[i] = (int)(Math.random()*100 + 1);		
//					
//				if(max < numArray[i]){
//					max = numArray[i];
//				}			
//							
//				if(min > numArray[i]){
//					min = numArray[i];
//				}			
//		}
//		System.out.println(min + ", " + max);
		
		
		
//		int[] shuffle = new int[10];
//		for(int i = 0; i < shuffle.length; i++){
//			shuffle[i] = i + 1;
//		}
//		
//		System.out.println(Arrays.toString(shuffle));		
		//배열의 값을 섞어 주세요.
//		int random = (int)(Math.random()*shuffle.length);
//		int temp = shuffle[0];
//		shuffle[0] = shuffle[random];
//		shuffle[random] = temp;
		
//		for(int i = 0; i < shuffle.length * 10; i++){
//			int random = (int)(Math.random() * shuffle.length);
//			int temp = shuffle[0];
//			shuffle[0] = shuffle[random];
//			shuffle[random] = temp;
//		}
//		System.out.println(Arrays.toString(shuffle));
		
		
		//오늘의 마지막 문제
		//1~10사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int[] index = new int[500];
		int randomNumber = 0;
		int[] count = new int[10];
		
		for(int i = 0; i < index.length; i++){
			randomNumber = (int)(Math.random()*10+1);
			index[i] = randomNumber; //i가 증가할 때 마다 randomNumber의 랜덤 정수가 각 index배열에 초기화된다.
//			System.out.println(index[i]);
			count[randomNumber - 1]++;
			System.out.println(count);			
		}		
		
	} // main 블럭
}
