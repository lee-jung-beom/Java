package h_exception;

import java.io.IOException;

public class ThrowException {
	public static void main(String[] args) {
		/*
		 * 예외 발생시키기
		 * - throw new Exception();
		 * - throw 예약어와 예외 클래스의 객체로 예외를 발생시킬 수 있다.
		 * 
		 */
		
		try {
			throw new IOException("예외가 발생한 이유를 만들자");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		throw new NullPointerException(); //자주 만나게 될 예외 : null을 참조했다는 의미(null은 참조형 타입의 기본 값)
		
//		String str = null;
//		System.out.println(str.equals("문자열 비교"));
		
		
		throw new IndexOutOfBoundsException(); //자주 만나게 될 예외
		
	}
}
