package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier {
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier(); 	

		System.out.println(am.publicVar);
		am.publicMethod();

//		System.out.println(am.protectedVar);
//		am.protectedMethod();

//		System.out.println(am.defaultVar);
//		am.defaultMethod();

//		System.out.println(am.privateVar);
//		am.privateMethod();
		
		AccessTest a = new AccessTest(); //상속을 받았으면 내것처럼 사용하도록 클래스 개체를 새로 만든다
		
		System.out.println(a.protectedVar);
		a.protectedMethod();

	}
}
