package assign;

import e_oop.ScanUtil;

public class assign_e_oop {
	/*
	 * 과제. 임의의 사물을 대상으로 클래스를 만들어주세요.
	 * 사물이 가지고 있는 속성을 변수로 만들고,
	 * 변수와 관계된 동작들을 메서드로 만들어주시면 됩니다.
	 */
	// 주제 : 에어컨
	// 전원(on/off)
	// 온도 조절(18~30)
	// 시간 예약(30분단위로, 30 ~ 4시간)
	// 제습
	// 풍향
	// 바람세기
	
	boolean p = false; //전원 조작을 위한 변수
	
	//전원 조작
	void power(){ 
		
	}
	
	public static void main(String[] args) {
		System.out.println("======================");
		System.out.println("①전원\t②온도조절\t③시간예약\n"
						+ "④제습기능\t⑤풍향기능\t⑥바람세기");
		System.out.println("======================");
		System.out.println("번호를 입력하세요>");
		int input = ScanUtil.nextInt();
	
	
	}
	
}
