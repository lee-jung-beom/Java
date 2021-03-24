package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		
		/*
		 * 사용자 정의 데이터 타입
		 * - 데이터의 최종 진화 형태이다. (기본형 -> 배열 -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다. 
		 * 
		 */
				
		//클래스
		Student student; //Student클래스의 변수 선언
		student = new Student(); //초기화(객체 생성/인스턴스화)
		
		student.kor = 80;
		student.eng = 90;
		student.math = 70;
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum / 3.0;
		student.name = "갈라파고스";
		
		System.out.println(student.name + " / " + student.sum + " / " + student.avg);
		
		Student student1;
		student1 = new Student();
		
		student1.kor = 10;
		student1.eng = 20;
		student1.math = 30;
		student1.sum = student1.kor + student1.eng + student1.math;
		student1.avg = student1.sum / 3.0;
		student1.name = "토마토";
		
		System.out.println(student1.name + " / " + student1.sum + " / " + student1.avg);
		
	} //main블럭

}

class Student{
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
	
}