package e_oop;

public class ClassMaker {

	//전역변수 하나를 선언 및 초기화 해주세요.
	int field = 10;
	
	//리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요
	void method_1(){
		System.out.println(field);
	}
	
	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 리턴해주세요.
	int method_2(){
		
		return field;
	}
	
	//리턴타입은 없고 파라미터가 있는 메서드 하나를 만들어주세요.
	//메서드 안에서 파라미터를 출력해주세요.
	void method_3(int parameter){
		
		System.out.println(parameter);
		return; //메서드를 종료시키기 위해서 종종 이 방법을 사용한다.
	}

	//int타입의 리턴타입과 int타입의 파라미터 두 개가 있는 메서드 하나를 만들어주세요.
	//메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	int method_4(int parameter, int parameter1){
		
		return parameter * parameter1;
	}
	//return은 메서드를 종료 시키는 역할도 한다.
	
	
}
