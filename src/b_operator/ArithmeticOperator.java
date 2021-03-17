package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * <주제>: 조작, 연산
		 * 
		 * 연산의 종류(3가지): 산술, 비교, 논리 연산
		 * - 사칙연산: +, -, *, /, %(나머지)
		 * - 복합연산자: +=, -=, *=, /=, %=
		 * - 증감연산자: ++, --
		 * 
		 */
		
//		int result = 10 + 20 - 30 * 40 / 50 % 60;
//		
//		// 나머지 연산
//		result = 10 / 3;
//		System.out.println(result);
//		result = 10 % 3;
//		System.out.println(result);
		
		//5개의 산술연사자를 사용해 5개의 연산을 수행 후 출력해주세요.
//		int a = 10+10;
//		int b = 10-10;
//		int c = 10*10;
//		int d = 10/10;
//		int e = 10%10;
//		
//		System.out.println(a +", "+ b +", "+ c +", "+ d +", "+ e);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		//복합연산자
//		int result = 10 + 20 - 30 * 40 / 50 % 60;
//		result += 3;
//		result -= 5;
//		result *= 2;
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		//result = result % 5;
		//result = result - 2 * 3;
//		result += 10;
//		result %= 5;
//		result -= (2*3);
		
		//증감 연산자
		//증강연산자(++): 변수의 값을 1 증가시킨다.
		//감소 연산자(--): 변수의 값을 1 감소시킨다.
		
//		int i =0; 
		
//		++i; //전위형: 변수의 값을 읽어오기 전에 1증가된다.
//		i--; //후위형: 변수의 값을 읽어온 후에 1 증가된다.
//		
//		i = 0;
//		
//		++i;
//		i++;
		
//		i = 0;
//		System.out.println("++i = " + ++i);
//		i = 0;
//		System.out.println("i++ = " + i++);
//		System.out.println(i);
//		
		/*
		 * 연산자 사용 시 주의점
		 * - 피연산자의 타입이 서로 같아야만 연산이 가능하다
		 * 		
		 */
		
//		int re = 10;
//		double rew = 3.14;
//		double result2 = (double)re + rew;
//		
//		System.out.println(result2);
//		
//		long lo_ng = 100L;
//		lo_ng = re + (int)lo_ng;
//		
//		System.out.println(lo_ng);
//		
//		byte _byte = 5;
//		short _short = 10;
//		
//		re = _byte + _short; //int보다 작은 타입은 int로 형변환된다, 연산의 크기가 최소 4바이트가 되어야만 연산이 가능하기 때문에
//		char _char = 'a';
//		char _char2 = 'b';
//		re = _char + _char2;
//		System.out.println(re);
//		
//		//오버플로우, 언더플로우
//		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
//		byte b = 127;
//		b++;
//		System.out.println(b);
//		b--;
//		System.out.println(b);
		
		//다음을 한 줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
//		int op = 123456 + 654321;
//		int sub = 123456;
//		int sub2 = 654321;
//
//		System.out.println(op);
//		System.out.println(op*(long)sub);
//		System.out.println((op*(long)sub) / sub);
//		System.out.println(((op*(long)sub)/sub) - sub2);
//		System.out.println((((op*(long)sub)/sub) - sub2)%sub);
		
//		long result = 123456 + 654321;
//		result *= 123456;
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 출력해주세요.
//		byte n1 = 1, n2 = 2, n3 = 4;
//		int n2 = 2;
///		int n3 = 3;
//		int sum = n1+n2+n3;
//		double res1 = (n1+n2+n3) / 3.0;
//		
//		System.out.println(sum + ", " + res1);
//		
//		//반올림 메서드
//		res1 = Math.round(res1*10) / 10.0;
//		System.out.println(res1);
		
		//랜덤
		//Math.random(); => 랜덤함수는 0.0 ~ 1.0 미만의 범위에서 랜덤 값을 발생시킨다
		double random = (double)(Math.random()) + 1;
		System.out.println(random);
		
		double i = 12.14;
		double i1 = Math.round(i);
	}

}
