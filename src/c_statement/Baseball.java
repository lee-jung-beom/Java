package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		 /*
		  * 숫자야구게임 만들기
		  * 123
		  * 135 : 1S(스트라이크) 1B(볼) 1O(아웃)
		  *  
		  */
		
		
		Scanner input_An = new Scanner(System.in);
		
		//정답인 3개의 랜덤변수 저장
		int n1 = (int)(Math.random()*9+1);
		int n2 = (int)(Math.random()*9+1);
		int n3 = (int)(Math.random()*9+1);
		
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		
		while (true) {
			n1 = (int) (Math.random() * 9 + 1);
			n2 = (int) (Math.random() * 9 + 1);
			n3 = (int) (Math.random() * 9 + 1);
			while (true) {
				if (n3 != n2 && n3 != n1) {
					if (n2 != n1 && n2 != n3) {
						if (n1 != n2 && n1 != n3) {
							System.out.println(n1 + " / " + n2 + " / " + n3);
							break;
						}
					}
				}
			}
			
			System.out.println("1 ~ 9까지의 숫자 3개를 입력하세요>");
			int A1 = Integer.parseInt(input_An.nextLine());
			int A2 = Integer.parseInt(input_An.nextLine());
			int A3 = Integer.parseInt(input_An.nextLine());			

			if (A1 == n1) {
				strike++;
				if(A2 == n2){
					strike++;
					if(A3 == n3){
						strike++;
					}
				}
			}
			if (A1 == n2 || A1 == n3) {
				ball++;
				if(A2 == n1 || A2 == n3){
					ball++;
					if(A3 == n1 || A3 == n2){
						ball++;
					}
				}
			}
			if(A1 != n1 && A1 != n2 && A1 != n3){
				out++;
				if(A2 != n1 && A2 != n2 && A3 != n3){
					out++;
					if(A3 != n1 && A3 != n2 && A3 != n3){
						out++;
						
					}
				}
			}
			
			
			System.out.println(strike + "S, " + ball + "B, " + out + "O");
		} //3개의 변수에 랜덤함수 중복 저장 안되게 처리		
			
		
	} //main 블럭

}
