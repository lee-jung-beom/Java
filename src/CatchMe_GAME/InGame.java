package CatchMe_GAME;

import java.util.Arrays;

public class InGame { //여기서 본 게임 프로세스 구성
	
	Player user = new Player("♧", 3, 1); //파라미터 : 이모티콘, 목숨, 레벨
	Tagger tag = new Tagger("▣");
	
	Scan input = new Scan();

	String[] stage1 = {"●","●","●","●","●","●","●","●","●","●"}; 
//	static String player = "♧";
//	static String tagger = "▣";
	
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
	
	
	void Processing(){//☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
				
		
		int Rootine = 0; //while문을 위한 루틴(stage1에서 10회동안 술래를 피하면 게임 성공)
		
		String temp1;	
		String temp2;	
		
		int playerRun = 0;
		int taggerRun = 0;
		
		System.out.println();
		System.out.println("[STAGE1]");

		System.out.println(Arrays.toString(stage1)); //초기 stage 출력
		System.out.println();
		
		while(Rootine <= 10){ //플레이어와 술래의 이전 이동 정보를 저장하고, 다음 이동 입력 만큼 그곳에서 이동하도록하기(단, 이전 이동했을 때의 stage에 지정된 배열 정보는 지운다)	
			Start startGame = new Start();
			
			playerRun += playerRun;
			taggerRun += taggerRun;
			
			System.out.print("도망갈 위치를 입력하세요!! (입력 가능 범위 : 1 ~ 10)>> ");
			playerRun = input.nextInt();
			taggerRun = (int)((Math.random()*10+1)-1);
			
			
			stage1[playerRun - 1] = user.player; //♧표시가 stage해당 배열에 저장
			temp1 = stage1[playerRun - 1];
			
//			if(playerRun == 1){ //1을 입력했을 때는 player만 가도록 한다. (원활한 플레이를 위하여)
//				System.out.println(Arrays.toString(stage1));
//				continue;
//			}
			
			stage1[taggerRun] = tag.tagger; //▣표시가 stage해당 배열에 저장
			temp2 = stage1[taggerRun];

//			if(taggerRun > playerRun){ //술래의 이동거리가 player보다 높게 선언되면 player의 이동거리와 같게 만든다.
//				taggerRun = playerRun;				
//			}
			if(playerRun == (taggerRun+1)){
				System.out.println(Arrays.toString(stage1));
				System.out.println("술래에게 잡혔습니다....ㅠㅠ");
				Rootine = 0;
				user.Life(); //목숨 메서드*****
				System.out.println();
				continue;
			}			
			System.out.println(Arrays.toString(stage1));
			System.out.println();
			
			stage1[playerRun-1] = "●";
			stage1[taggerRun] = "●";
			
			Rootine++;
			if(Rootine == 10){
				System.out.println();
				System.out.println("술래로부터 무사히 도망쳤습니다!!");
				user.Level();
				System.out.println();
				startGame.start(); //원래는 스테이지2를 제작하여야 함
			}
			
		}//
		
	}	
}// InGame클래스 end블럭


/*====================================================================================*/
class Player{ //player클래스 정의
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


/*====================================================================================*/
class Tagger{ //술래 클래스 정의
	
	String tagger; //player 식별 이모티콘 저장
	
	Tagger(String tagger){
		this.tagger = tagger; 
	}	
}// Tagger클래스 end블럭


/*====================================================================================*/
//test

















