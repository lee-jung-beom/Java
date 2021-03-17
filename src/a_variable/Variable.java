//default패키지는 아무 패키지도 아닌 곳에 속한 클래스를 의미
package a_variable; //이 클래스(Variable)가 어느 패키지(a_variable)에 위치해있는지, 즉 클래스의 위치 정의

import java.util.Scanner;

//import java.util.Scanner; //java에서 Scanner클래스 호출(이것의 의미는 java안에 util패캐지 안의 Scanner클래스)

public class Variable { //이 클래스는 Variable을 의미, "{"는 블록이라 의미한다, 블록 안의 내용이 클래스의 내용이다
	//클래스는 복잡한 데이터, 자바는 클래스로 구성한다
	//클래스의 구성은 '변수, 메서드'로 구성된다
	
	
	public static void main(String[] args) { //이것이 메서드이다, '('소괄호가 있으면 무조건 메서드이다, 현재 메서드의 이름은 'main'
		//메서드란 명령문의 집합, 모든 코드는 메서드 안에서 작성한다(메서드 밖에서는 실행하는 코드 작성 불가능)
		//'main'라는 이름의 메서드는 프로그램의 시작과 끝의 기능을 한다
		//
		/*
		 * 데이터의 종류(예시)
		 * - 정수: 10, -5
		 * - 실수: 3.14, -1.5
		 * - 문자: 'a', '3'
		 * - 논리: true, false
		 * 
		 * 
		 * 자료형
		 * -정수: byte(1), short(2), *int(4), long(8)
		 * -실수: float(4), *double(8)
		 * -문자: char(2)
		 * -논리: boolean(1)
		 * 
		 * 붉은 줄: 컴파일 에러
		 * 처음으로 변수에 값을 정하는 것을 초기화라 한다 
		 */
		
//		int i = 1;
//		
//		double pi = 3;
//		
//		int abc = 30;
//
//		long l = 40L; //접미사 L을 붙여야 long타입이 된다
//		float f = 5.5f; //접미사 f를 붙여야 float타입이 된다
//		char c = '한'; //따옴표 안에 한글자만 넣어야 한다, 넣을 글자가 없다면 공백이라도 넣어야 글자가 완성되었다고 컴퓨터가 인식한다
//		boolean b = false;
//		
//	
//		
////		 long i; //한 블력안에서 변수의 이름은 중복 불가능
//		System.out.println("변수의 값은 " + i + "이다.");
//		System.out.println("pi변수의 값은 " + pi + "이다.");
//		System.out.println(f);
//		System.out.println(l);
//		System.out.println(c);
//		System.out.println(b);
//		
//		byte bt = 9;
//		short st = 10;
//		int a = 3;
//		long l = 3903L;
//		double d = 9.9;
//		float f = 3.7f;
//		char c = '램';
//		boolean b = false;
//		
//		bt = -128;
//		st = 11;
//		a = 2147483647;
//		l = 2147483648L;
//		d = 8.7;
//		f = 2.99f;
//		c = '호';
//		b = true;
//		
//		
////		콘솔 실행 단축키: Ctrl + f11
////		노랑 줄: 이클립스의 경고문(문제가 될 수도 있는 코드임을 알림)
//		System.out.println(bt);
//		System.out.println(st);
//		System.out.println(a);
//		System.out.println(l);
//		System.out.println(d);
//		System.out.println(f);
//		System.out.println(c);
//		System.out.println(b);
//		
//		/*
//		 * 타입 선택의 기준
//		 * 
//		 * 정수
//		 * - byte, short: 메모리를 절약해야 할 때
//		 * - int: 기본
//		 * - long: int의 범위를 벗어날 때
//		 * 
//		 * 실수
//		 * - float: 메모리를 절약할 때
//		 * - double: 기본
//		 */
//		
////		참조형 변수는 변수 안에 주소 값을 저장한다(그 주소가 위치한 곳에는 실제 변수가 가져야 할 값이 위치해 있다)
////		String이라는 것이 하나의 클래스이다
//		String str = "문자....."; //쌍따옴표(")로 묶여 있는 것이 문자열
//		System.out.println(str);
		
		/*
		 * 형 변환(type casting): 데이터 타입을 변경하는 것
		 * 
		 * 
		 */
		
//		int small = 10;
//		long big = 10L;
//		
//		small = (int)big;
//		big = small; //표현범위가 작은쪽에서 큰쪽으로의 형변환은 생략이 가능하다
//		
		/*
		 * 명명규칙
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('-', '$')를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다.
		 * - [낙타식 표기법을 사용한다. (mySampleVariable)]
		 * - [클래스의 첫 글자는 대문자로 한다. (MySampleClass)]
		 *  
//		 */
//		int 아 = 19;
//		System.out.println(아);
		
		/*
		 * 상수
		 * - 처음 담긴 값을 변경 할 수  없는 그릇
		 * - 리터럴에 의미를 부여하기 위해 사용한다 
		 * 
		 */
		
//		final int MAX_NUMBER = 10;
////		MAX_NUMBER = 19;
//		System.out.println(MAX_NUMBER);
	
		/*
		 * 여러가지 출려방법
		 */
//		String str = "문자열";
//		int i = 123;
//		
//		System.out.print("print는 줄바꿈을 하지 않는다.\n"); //줄바꿈 X
//		System.out.println("줄바꿈을\t한다."); //'\t'는 탭(빈칸)이다.
//		System.out.printf("문자열: %s, 숫자: %d", "하이", 5); //출력 포맷을 지정한다.
//		System.out.println();
//		System.out.println("A" + "\t" + 100);
//		System.out.println(10 + 20 + "\n" + "30");
//	
		
		/*
		 * 입력
		 */
//		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
//		다른 클래스를 사용하려면 같은 패키지 안에 있어야 한다
//		import 단축키: Ctrl + Shift + o
//		System.out.println("아무거나 입력해주세요: ");
//		String str2 = sc.nextLine(); //'nextLine()'은 문자열을 입력 받아주는 메서드
//		
//		System.out.println("입력받은 내용: " + str2);
//		
//		int i = sc.nextInt();
//		double d = sc.nextDouble();
//		//이런 것들은 버그가 있기 때문에 사용하지 않는 것을 권장한다(숫자 입력하고 문자를 입력하면 문자입력이 무시된다. )
//		
//		System.out.println("int 입력>");
//		int number = Integer.parseInt(sc.nextLine());
//		double number2 = Double.parseDouble(sc.nextLine());
//		double number2 = Double.valueOf(sc.nextLine());
//		System.out.println(number2);
		
//		Scanner sc1 = new Scanner(System.in);
		
		//
		//자신의 이름을 저장할 변수를 선언해주세요
		String myName; //'name'이라는 이름을 저장할 변수
		
		//위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아주세요.
		Scanner saveName = new Scanner(System.in);
		System.out.print("이름을 입력하시오: ");
		myName = saveName.nextLine();
		
		System.out.println();
		//자신의 나이를 저장할 변수를 선언해주세요.
		int age;
		
		//위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아주세요
		Scanner saveAge = new Scanner(System.in);
		System.out.print("나이를 입력하시오: ");		
		age = Integer.parseInt(saveAge.nextLine());
		
		System.out.println();
		
		System.out.println("이름: " + myName + ", " + "나이: " + age);
	
		/* 아래의 정보를 입력하면 그 아래처럼 출력 될 수 있도록
		 * 
		 * =====회원가입====
		 * 아이디>admin
		 * 비밀번호(4자리 숫자)>1234
		 * 이름>홍길동
		 * 나이>30
		 * 키>185.5
		 * ====================
		 * 회원가입 완료!!
		 * =====내 정보=====
		 * 아이디: admin
		 * 비밀번호: 1234
		 * 이름: 홍길동
		 * 나이: 30세
		 * 키: 185.5cm
		 */
		
		
	}

}
