package e_oop;

public class ClassMaker2 {	
	

	
	
	//인스턴스 변수 하나를 선언하고 명시적으로 초기화 해주세요.
	int n1 = 0;
	
	//위에서 선언한 인스턴스변수를 초기화 블럭을 사용해 초기화 해주세요.
	{
		n1 = 30;
	}
	
	//위에서 선언한 인스턴스변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(int p1){
		this.n1 = p1;
	}
	
	//위에서 선언한 인스턴스변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2(){
		this(50);
	}
	
	//초기화 순서 : 명시적 초기화 -> 초기화 블럭 -> 생성자
	
	public static void main(String[] args) {		
		ClassMaker2 c = new ClassMaker2();
		
		System.out.println(c.n1);
	}
	
}
