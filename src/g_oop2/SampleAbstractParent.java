package g_oop2;

public abstract class SampleAbstractParent {
	
	void method(){
		//일반 메서드
	}
	
	//추상 메서드를 하나라도 가지고 있으면 클래스는 추상 클래스가 되어야 한다.
	abstract void abstractMethod(); //추상클래스는 부모클래스의 역할만 한다
	
}

class SampleAbstractChild extends SampleAbstractParent{

	@Override
	void abstractMethod() { //추상 메서드가 오버라이딩 되었다., 상속 받은 자식클래스마다 내용이 다를 수 있기 때문
		
		
	}
	//오버라이딩 : 상속받은 메서드의 내용을 만들어주는 것
}
