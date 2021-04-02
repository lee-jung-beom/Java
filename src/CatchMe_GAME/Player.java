package CatchMe_GAME;

public class Player{ //player클래스 정의
//	Start start = new Start();
	
	String player; //player 식별 이모티콘 저장	
	static int life; //목숨
	static int level; //레벨
	
	Player(String player, int life, int level){ 
		this.player = player;
		this.life = life; //목숨 3개로 초기화
		this.level = level; //초기 레벨 1로 선언
	}	
	
	void showInfo(){
		Scan input = new Scan();
		InGame game = new InGame();
		
		System.out.println("유저 이모티콘 : " + player);
		System.out.println("생명 : " + this.life);
		System.out.println("레벨 : " + this.level);
		System.out.println("①되돌아가기");
		switch(input.nextInt()){
		case 1 : game.explainGame(); break;
		default : System.out.println("잘못된 숫자를 입력하였습니다.");
		}
	}
	
	void Life(){
		life--; //술래에게 잡히면 생명 1감소
		System.out.println("남은 목숨 : " + this.life);
		System.out.println();
		if(this.life == 0){
			System.out.println("GAME OVER");
		}
	}
	
	void Level(){
		level++; //스테이지 클리어하면 레벨 1 업
		System.out.println("레벨 UP↑ => LEVEL" + level);
	}
}// Player클래스 end블럭