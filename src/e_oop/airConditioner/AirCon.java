package e_oop.airConditioner;

import java.util.Scanner;

public class AirCon {
	/*
	 * 과제. 임의의 사물을 대상으로 클래스를 만들어주세요.
	 * 사물이 가지고 있는 속성을 변수로 만들고,
	 * 변수와 관계된 동작들을 메서드로 만들어주시면 됩니다.
	 */
	
	/*
	 * <주제 : 에어컨>
	 * - 전원
	 * - 온도 조절
	 * - 바람 세기
	 *
	 */
	static Scanner sc = new Scanner(System.in);
	static int input;
	
	boolean powerValue;
	static int temper;	
	static char[] windPower = {'하', '중', '강'};
	
	final int max_temper = 28;
	final int min_temper = 18;
//	final char max_windPower = '강';
//	final char min_windPower = '하';
	
	
	AirCon() {		
		input = 0;
		powerValue = false;
		temper = 24;
	}	
	
	void power() {
		powerValue = !powerValue;
		System.out.println(powerValue? "ON" : "OFF");
	}	
	
	void temperature_UP() {
		if(powerValue){
			if(min_temper <= temper && temper <= max_temper){
				temper++;
			}
			System.out.println(temper);
		}		
	}

	void temperature_DOWN() {
		if(powerValue){
			if(min_temper <= temper && temper <= max_temper){
				temper--;
			}
			System.out.println(temper);
		}
	}

	void WindPower_UP(int wp) {
		if(powerValue){
			if(wp == 2 || wp == 1){
				wp++;
			}
			System.out.println(windPower[wp]);
		}			
	}
	
	void WindPower_DOWN(int wp) {
		if(powerValue){
			if(wp == 2 || wp == 3){
				wp--;
			}
			System.out.println(windPower[wp]);
		}		
	}
	
	 
	public static void main(String[] args) {
		AirCon ac = new AirCon();
		
		while (true) {
			System.out.println("①전원 ②온도UP ③온도DOWN ④바람세기UP ⑤바람세기DOWN");
			System.out.println("숫자를 입력하세요> ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				ac.power();
				break;
			case 2:
				ac.temperature_UP();
				break;
			case 3:
				ac.temperature_DOWN();
				break;
			case 4:
				ac.WindPower_UP(2);
				break;
			case 5:
				ac.WindPower_DOWN(2);
				break;
			default:
				System.out.println("Wrong number.");
				System.exit(0);
				break;
			}
		}		
		
	} //main메서드 블럭

} //TEST
