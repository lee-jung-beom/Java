package CatchMe_GAME;

public class Start {//첫 시작화면 구성과 로직
	InGame game = new InGame();
	
	Scan input = new Scan();
	
	protected void start(){
		System.out.println("<< Catch Me >>");
		System.out.println("①게임 시작 ②게임 정보 ③종료");
		switch(input.nextInt()){
		case 1 : game.sumMethod(); break;//인게임
		case 2 : GameInfo(); break;
		case 3 : System.out.println("게임을 종료 합니다."); System.exit(0); 			
		}
	}
	
	private void GameInfo(){
		System.out.println("게임명 : 술래잡기");
		System.out.println("개발자 : 이 정 범");
		System.out.println("개발일 : 2021년 03월 31일");
		System.out.println("①시작화면으로 돌아가기");
		switch(input.nextInt()){
		case 1 : start(); break;
		}
	}
}// Start클래스 end블럭
