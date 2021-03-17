package assign;

import java.util.Scanner;

public class assign2021_03_15 {

	public static void main(String[] args) {
		//탄수화물 중독 자가진단 테스트
		/*
		 * 아침을 배불리 먹은 후 점심시간 전에 배가 고프다
		 * 밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다
		 * 음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다
		 * 정말 배고프지 않더라도 먹을 때가 있다
		 * 저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다
		 * 스트레스를 받으면 자꾸 먹고 싶어진다
		 * 책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다
		 * 오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다
		 * 과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다
		 * 다이어트를 위해 식이조절을 하는데 3일도 못간다
		 *  
		 * 3개: 주의! 위험한 수준은 아니지만 관리 필요
		 * 4~6개: 위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함
		 * 7개 이상: 중독! 전문의 상담이 필요함
		 */
		
//		String q1 = "아침을 배불리 먹은 후 점심시간 전에 배가 고프다";
//		String q2 = "밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다";
//		String q3 = "음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다";
//		String q4 = "정말 배고프지 않더라도 먹을 때가 있다";
//		String q5 = "저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다";
//		String q6 = "스트레스를 받으면 자꾸 먹고 싶어진다";
//		String q7 = "책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다";
//		String q8 = "오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다";
//		String q9 = "과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다";
//		String q10 = "다이어트를 위해 식이조절을 하는데 3일도 못간다";
//		
//		String answer1 = "주의! 위험한 수준은 아니지만 관리 필요";
//		String answer2 = "위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함";
//		String answer3 = "중독! 전문의 상담이 필요함";
//		
//		int count = 0; //선택한 항목의 갯수를 저장하는 변수
//		
//		Scanner choice = new Scanner(System.in); // 'o'표시를 하여 10개의 각 항목을 체크할 수 있도록 한다
//		
//		System.out.println("항목 체크 시 \'o\'표시를 하시오.");
//		System.out.print(q1 + ">");
//		char tak0 = choice.next().charAt(0);
//		System.out.print(q2 + ">");
//		char tak1 = choice.next().charAt(0);
//		System.out.print(q3 + ">");
//		char tak2 = choice.next().charAt(0);
//		System.out.print(q4 + ">");
//		char tak3 = choice.next().charAt(0);
//		System.out.print(q5 + ">");
//		char tak4 = choice.next().charAt(0);
//		System.out.print(q6 + ">");
//		char tak5 = choice.next().charAt(0);
//		System.out.print(q7 + ">");
//		char tak6 = choice.next().charAt(0);
//		System.out.print(q8 + ">");
//		char tak7 = choice.next().charAt(0);
//		System.out.print(q9 + ">");
//		char tak8 = choice.next().charAt(0);
//		System.out.print(q10 + ">");
//		char tak9 = choice.next().charAt(0);
//
//		if(tak0 == 'o'){
//			count++;
//		}
//		if(tak1 == 'o'){
//			count++;
//		}
//		if(tak2 == 'o'){
//			count++;
//		}
//		if(tak3 == 'o'){
//			count++;
//		}
//		if(tak4 == 'o'){
//			count++;
//		}
//		if(tak5 == 'o'){
//			count++;
//		}
//		if(tak6 == 'o'){
//			count++;
//		}
//		if(tak7 == 'o'){
//			count++;
//		}
//		if(tak8 == 'o'){
//			count++;
//		}
//		if(tak9 == 'o'){
//			count++;
//		}		
//		
//		if(count == 3){
//			System.out.println();
//			System.out.println(answer1);
//		}else if(4 <= count && count <=6){
//			System.out.println();
//			System.out.println(answer2);
//		}else if(count >= 8){
//			System.out.println();
//			System.out.println(answer3);
//		}else{
//			System.out.println();
//			System.out.println(">안전<");
//		}
		
		Scanner s = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("아침을 배불리 먹은 후 점심시간 전에 배가 고프다(Y/N)");
		String answer = s.nextLine();
		
		if(answer.equals("Y")) count ++;
		
		if(count < 3){
			System.out.println("안전");
		}else if(count == 3){
			System.out.println("주의");
		}else if(4 <= count && count <= 6){
			System.out.println("위험!");
		}else{
			System.out.println("중독!");
		}
		
	} //초기 블럭

}
