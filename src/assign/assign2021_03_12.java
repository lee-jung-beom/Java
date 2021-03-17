package assign;

import java.util.Scanner;

public class assign2021_03_12 {

	public static void main(String[] args) {
		//SimpleCalculator
		//두 개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력: ");
//		int in1 = sc.nextInt();
//		System.out.println();
//		
//		System.out.print("연산자 입력: ");
//		char logic = sc.next().charAt(0);
//		System.out.println();
//		int logicInput = (int)logic;
//		
//		System.out.print("정수 입력: ");
//		int in2 = sc.nextInt();
//		System.out.println();
//		
//		//유니코드 [+: 43, -: 45, *: 42, /: 47, %: 37]
//		
//		int solution = (Integer) ((logicInput == 43)? (in1 + in2) : 
//					   (logicInput == 45)? (in1 - in2) :
//					   (logicInput == 42)? (in1 * in2) :
//					   (logicInput == 47)? (in1 / in2) :
//					   (logicInput == 37)? (in1 % in2) :
//					   (0));
//		
//		System.out.println("결과 = " + solution);
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 숫자>");
		int x = Integer.parseInt(s.nextLine());
		System.out.print("연산자>");
		String op = s.nextLine();
		System.out.print("두번째 숫자>");
		int y = Integer.parseInt(s.nextLine());
		
		int result = op.equals("+") ? x + y
				:op.equals("+") ? x + y
						:op.equals("+") ? x + y
								:op.equals("+") ? x + y
										: x % y;
		
		System.out.println(x + " " + op + " " + y + " = " + result);
		
							
	}

}
