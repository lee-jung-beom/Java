package testGame;

public class Player{ //player클래스 정의
//	Start start = new Start();
	
	String player; //player 식별 이모티콘 저장	
	int life; //목숨
	int level; //레벨
	
	Player(String player, int life, int level){
		this.player = player;
		this.life = life; //목숨 3개로 초기화
		this.level = level; //초기 레벨 1로 선언
	}	
	
	void showInfo(){
		System.out.println("유저 이모티콘 : " + this.player);
		System.out.println("생명 : " + this.life);
		System.out.println("레벨 : " + this.level);
	}
	
	void Life(){
		this.life--; //술래에게 잡히면 생명 1감소
		System.out.println("남은 목숨 : " + this.life);
		System.out.println();
		if(this.life == 0){
			System.out.println("GAME OVER");
		}
	}
	
	void Level(){
		this.level++; //스테이지 클리어하면 레벨 1 업
		System.out.println("레벨 UP↑ => LEVEL" + this.level);
	}
}// Player클래스 end블럭
