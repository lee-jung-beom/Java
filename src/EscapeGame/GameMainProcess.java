package EscapeGame;

import java.util.Scanner;

public class GameMainProcess {
	static int input = 0;
	
	private void Start(){		
		switch(input){
		case 1 :
			System.out.println("침팬지 : 끼끼끼~ 끼끼끼끼~ 끼끼....");
			System.out.println();
			System.out.println("침팬지가 동물원에서 탈출할 수 있도록 도와주십시오.");
			System.out.println();
			System.out.println("<장소 : 침팬지 우리>");
			System.out.println("①문 ②바나나 ③빈 병 ④철사");
			System.out.println("숫자를 입력하세요.>");
			break;
		case 2 : 
			System.out.println("=======게임정보=======");
			System.out.println("게임 이름\t[동물원 탈출하기]");
			System.out.println("개발자\t[이 정 범]");
			System.out.println("개발기간\t[2021-03-29 ~ 2021-04-1]");
		}
	}

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		GameMainProcess G = new GameMainProcess();
		System.out.println("GAME START");
		System.out.println("①시작 ②게임 정보");
		input = sc.nextInt();
		G.Start();
				
		
		
		
	}
}
