package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * - for문
		 * - while문
		 * - do-while문
		 * 
		 * for문 
		 * - for(초기화; 조건식; 증감식){}
		 * - 포함하고 있는 문장들을 정해진 횟수만큼 반복하는 문장
		 * 
		 */

//		for(int i = 5; i <= 10; i++){
//			//초기화: 조건식과 증감식에 사용할 변수 초기화
//			//조건식: 연산결과가 true이면 블럭안의 내용을 수행한다
//			//증감식: 변수를 증가/감소시켜 반복문을 제어한다.
//			System.out.println(i + "번째 반복");
//		}
//		
//		int sum = 0; //1부터 10까지 합계를 저장
//		
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		sum += 5;
//		sum += 6;
//		sum += 7;
//		sum += 8;
//		sum += 9;
//		sum += 10;
//		System.out.println("합계 : " + sum);
//		
//		sum = 0;
//		for(int i = 1; i <= 10; i++){
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		sum = 0;
//		for(int i = 10; i > 0; i--){
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		//1부터 100까지 짝수의 합을 출력해주세요.
//		sum = 0;
//		int n;
//		
//		for(int i = 2; i <= 100; i += 2){
//			 sum += i; 			
//		}
//		System.out.println(sum);
		
		//1부터 100까지 홀수의 합을 구하시오
//		int sum = 0;
//		
//		for(int i = 1; i <= 100; i += 2){
//			 sum += i; 			
//		}
//		System.out.println(sum);
		
		//구구단  출력
//		int n1, n2;
//		
//		for (n1 = 2; n1 <= 9; n1++) {
//			for (n2 = 1; n2 <= 9; n2++) {
//				System.out.println(n1 + " X " + n2 + " = " + n1 * n2);
//				if (n2 == 9) {
//					System.out.println("==============");
//				}
//			}
//		}
		
//		int n1, n2;
//		
//		for (n1 = 2; n1 <= 9; n1++) {
//			for (n2 = 1; n2 <= 9; n2++) {
//				System.out.print(n1 + " X " + n2 + " = " + n1 * n2 + "    ");
//				if (n2 == 9) {
//					System.out.println("==============");
//				}
//			}
//		}
		
//		int n1, n2;
//		
//		for (n1 = 2; n1 <= 9; n1++) {
//			for (n2 = 1; n2 <= 9; n2++) {
//				System.out.print(n1 + " X " + n2 + " = " + n1 * n2 + "    ");
//				if(n2 == 9){
//					System.out.println();
//				}
//			}
//		}		
		
//		int n1, n2;
//		
//		for (n1 = 1; n1 <= 9; n1++) {
//			for (n2 = 2; n2 <= 9; n2++) {
//				System.out.print(n2 + " X " + n1 + " = " + n1 * n2 + "\t");
//			}
//			System.out.println();
//		}		
		
		/*
		 * while문
		 * - while(조건식){}
		 * - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
		 * - 반복함수가 정확하지 않은 경우에 주로 사용한다.
		 *  
		 */
		
//		int a = 1;
//		int count = 0;
//		//a에 2씩 몇번을 곱해야 1000이상이 될까?
//		while(a < 1000){
//			 a *= 2;
//			 count++;
//			 System.out.println("곱한 횟수: " + count + ", a의 값: " + a);
//		}	
		
		/*
		 * do-while문 
		 * - do{}while(조건식);
		 * - 최소한 한번의 수행을 보장한다.
		 * - 사용할 경우: 사용자가 그만하고 싶을 때까지
		 */		
		
		//숫자 맞추기 게임
//		int answer = (int) (Math.random()*100) + 1;
//		int input = 0;
//		Scanner s = new Scanner(System.in);
//		
//		do{
//			System.out.println("1~100사이의 수를 입력해주세요> ");
//			input = Integer.parseInt(s.nextLine());
//			
//			if(answer < input){
//				System.out.println(input + "보다 작습니다.");
//			}else if(input < answer){
//				System.out.println(input + "보다 큽니다.");
//			}else{
//				System.out.println("정답입니다.");
//			}
//		}while(input != answer);
		
		//이름붙은 반복문
//		outer : for(int i = 2; i<= 9; i++){
//			for(int j = 1; j <= 9; j++){
//				if(j ==5){
//					System.out.println("==========");
////					break; //가장 가까운 반복문 하나를 빠져나간다.
////					break outer; //outer라는 이름의 반복문을 빠져나간다.
////					continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다.
//					continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다.
//				}
//				System.out.println(i + " * " + j + " = " + i*j);
//			}
//			System.out.println();
//		}
		
		//사각형 별모양 만들기
//		for(int i = 0; i < 3; i++){
//			for(int j = 0; j < 5; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//삼각형 별모양 만들기
		int count = 0;
		
//		for(int i = 0; i < 5; i++){
//			for(int j = 0; j < count; j++){
//				System.out.print("*");
//			}		
//			count++;
//			System.out.println();
//		}
		
		for(int i = 0; i < 5; i++){
			for(int j = 5; j > count; j--){
				System.out.print("*");
			}		
			count++;
			System.out.println();
		}
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= count; j++) {
//				System.out.print(" ");		
//			}		
//			for (int j = 0; j <= count; j++) {
//				System.out.print("*");		
//			}		
//			
//			count++;
//		}
		
	} // main 블럭

}
