package CatchMe_GAME;

import java.util.Arrays;



public class InGame { //여기서 본 게임 프로세스 구성	
//	Stage stage = new Stage();
	Scan input = new Scan();
//	Player player = new Player(input.nextInt());	
	
		
	void sumMethod(){ //이곳에 이 클래스에서 작성한 모든 메서드를 통합하여 간략하게 정리 해준다.
		explainGame();
	}
	
	void explainGame(){ //sub1
		System.out.println(">>술래잡기 게임의 게임방법은 Player가 '술래(컴퓨터)'로부터 도망가면 됩니다<<");
		System.out.println();
		System.out.println("Player와 술래 식별표시");
		System.out.println("[♧  : Player / ▣  : 술래]");
		System.out.println();
		System.out.println("게임 방법을 확인하고, ①을 입력하여 게임을 시작하십시오.");
		switch(input.nextInt()){
		case 1 : Processing(); break;
		}
	}
	
	void Processing(){
//		Player player = new Player(input.nextInt());
		
		System.out.println();
		System.out.println("[STAGE-I]");
	
//		for(int i = 0; i < 20; i++){ //stage1
//			System.out.print(" ● ");
//		}
		String[] stage1 = {"●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●"}; //stage1, 20칸
		System.out.println(Arrays.deepToString(stage1));		
		System.out.println();
		System.out.print("player 이동 거리 입력 >> ");
		Player player = new Player(input.nextInt());
		switch(input.nextInt()){
		case 1 : 
		}
		
	}
	
}// InGame클래스 end블럭


/*====================================================================================*/
//class Stage{
//	
//	void Stage1() {
//		String[] stage1 = {"●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●"}; //20칸 
//	}
	
//	void Stage2() {
//
//	}
//
//	void Stage3() {
//
//	}
//}// Stage클래스 end블럭


/*====================================================================================*/
class Player{ //player클래스 정의
	
	String player = "♧"; //player 식별 이모티콘 저장
	int life; //목숨
	int movment; //player 이동 가능 거리
	int level;
	
	Player(int movement){
		this.life = 3; //목숨 3개로 초기화
		this.movment = movement; //이동 가능 거리 파라미터 값 받아오기(player는 사용자가 값을 직접입력하여 이동할 수 있도록 한다. )
		level = 1; //초기 레벨 1로 선언
	}
	
	
	
}// Player클래스 end블럭


/*====================================================================================*/
class Tagger{ //술래 클래스 정의
	
	String player = "▣"; //player 식별 이모티콘 저장
	int movment; //술래 이동 가능 거리
	
	Tagger(int movement){
		this.movment = movement; //이동 가능 거리 파라미터 값 받아오기(술래는 파라미터 값으로 랜덤함수를 선언하도록 한다.)
	}
	
}// Tagger클래스 end블럭


/*====================================================================================*/



















