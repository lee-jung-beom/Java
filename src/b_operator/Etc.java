package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트 연산자
		 * - |, &, ^, ~, <<, >>
		 * - 비트 단위로 연산한다.
		 * 
		 * 기타 연산자
		 * - (참조연산자): 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다.
		 * - (type): 형변환
		 * - ?:(삼항연산자): 조건식? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 * 
		 */
//		System.out.println(10 | 15); //System이라는 클래스에 out이라는 변수를 사용한다(참조연산자의 의미 예시)
		
//		int x = 10, y = 20;
//		int result = (x < y) ? x : y;
//		System.out.println(result);
//	
//		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자, 2면 여자
//		int regNo = 1;
//		String gender = (regNo == 2)? "남자" : "여자";
//		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
//		gender = (regNo == 1)? "남자" : (regNo == 2)? "여자" : "확인불가";
//		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
//		int n1, n2;
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("두 개의 숫자를 입력하시오: ");
//		n1 = input.nextInt();
//		n2 = input.nextInt();
//		
//		int bi = (n1 > n2)? n1 : n2;
//		System.out.println("출력된 숫자:" + bi);
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를, 2나 4면 여자를 출력해주세요.
		//그 외의 숫자를 입력하면 확인불가를 출력해주세요.
		int n1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오: ");
		n1 = input.nextInt();

		String outGen1 = "남자", outGen2 = "여자";
		
		String result = (n1 == 1 || n1 == 3)? outGen1 : (n1 == 2 || n1 == 4)? outGen2 : "확인불가";
		
		System.out.println("확인결과: " + result);
	}

}
