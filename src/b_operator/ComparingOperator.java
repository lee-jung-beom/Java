package b_operator;

public class ComparingOperator {
	
	public static void main(String[] args){
		/*
		 * 비교 연산자
		 * - <, >, <=, >=, ==, !=
		 * - 문자열 비교: equals()
		 * 
		 */
		
//		int x = 10;
//		int y = 20;
//		
//		boolean b = x < y;
//		
//		System.out.println(b);
//		b = x <= y - 15;
//		//산술연산과 비교연산이 같이 있을 경우 산술연산이 먼저 우선순위를 갖는다.
//		
//		String str1 = "abc";
//		String str2 = "abc";
//		
//		b = str1 == str2; //str1과 str2의 주소가 같은지 비교하는 것
//		System.out.println(b);
//
//		b = str1.equals(str2);
//		System.out.println(b);
//		b = !str1.equals(str2);
//		System.out.println(b);
		
		//다음의 문장들을 코드로 작성해주세요.
		int x = 1;
		int y = 2;
		String str1 = "기본형";
		String str2 = "참조형";
		
		
		//1. x는 y보다 작거나 같다.
		boolean b1 = (x <= y);
		System.out.println(b1); //'참'이 나와야 옳은 결과
		
		//2. x + 5와 y는 같다.
		boolean b2 = ((x+5) == y);
		System.out.println(b2); //'거짓'이 나와야 옳은 결과
		
		//3. y는 홀수이다.
		boolean b3 = (y%2 == 1);
		System.out.println(b3); //'거짓'이 나와야 옳은 결과
		
		//4. "기본형"과 "참조형"은 다르다.
		boolean b4 = !str1.equals(str2);
		System.out.println(b4); //'참'이 나와야 옳은 결과
	}
}















