package CatchMe_GAME;

import java.util.Arrays;

public class InGame { //여기서 본 게임 프로세스 구성
	Scan input = new Scan();

	String[] stage1 = {"●","●","●","●","●","●","●","●","●","●"}; 
	static String player = "♧";
	static String tagger = "▣";
	
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
		
		while(Rootine < 10){ //플레이어와 술래의 이전 이동 정보를 저장하고, 다음 이동 입력 만큼 그곳에서 이동하도록하기(단, 이전 이동했을 때의 stage에 지정된 배열 정보는 지운다)	
						
			playerRun += playerRun;
			taggerRun += taggerRun;
			
			System.out.print("도망갈 위치를 입력하세요!! (입력 가능 범위 : 1 ~ 10)>> ");
			playerRun = input.nextInt();
			taggerRun = (int)((Math.random()*10+1)-1);
			
			
			stage1[playerRun - 1] = player; //♧표시가 stage해당 배열에 저장
			temp1 = stage1[playerRun - 1];
			
//			if(playerRun == 1){ //1을 입력했을 때는 player만 가도록 한다. (원활한 플레이를 위하여)
//				System.out.println(Arrays.toString(stage1));
//				continue;
//			}
			
			stage1[taggerRun] = tagger; //▣표시가 stage해당 배열에 저장
			temp2 = stage1[taggerRun];

//			if(taggerRun > playerRun){ //술래의 이동거리가 player보다 높게 선언되면 player의 이동거리와 같게 만든다.
//				taggerRun = playerRun;				
//			}
			if(playerRun == (taggerRun+1)){
				System.out.println(Arrays.toString(stage1));
				System.out.println("술래에게 잡혔습니다....ㅠㅠ");
				Rootine = 0;
				continue;
			}			
			System.out.println(Arrays.toString(stage1));
			
			stage1[playerRun-1] = "●";
			stage1[taggerRun] = "●";
			
			Rootine++;
			if(Rootine == 9){
				System.out.println("술래로부터 무사히 도망쳤습니다!!");
				
			}
			
		}//
		
	}	
}// InGame클래스 end블럭


/*====================================================================================*/
class Player extends InGame{ //player클래스 정의
	Scan input = new Scan();
	String[] temp = stage1;
//	InGame app = new InGame();
	
	String player; //player 식별 이모티콘 저장
	
	int movement; //player 이동 가능 거리
	int life; //목숨
	int level;
	
	Player(int movement, int life, int level){
		this.player = "♧";
		this.life = life; //목숨 3개로 초기화
//		this.movement = 3; //이동 가능 거리 파라미터 값 받아오기(player는 사용자가 값을 직접입력하여 이동할 수 있도록 한다. )
		this.level = level; //초기 레벨 1로 선언
	}	
}// Player클래스 end블럭


/*====================================================================================*/
class Tagger{ //술래 클래스 정의
	
	String tagger = "▣"; //player 식별 이모티콘 저장
	int movment; //술래 이동 가능 거리
	
	Tagger(int movement){
		this.movment = movement; //이동 가능 거리 파라미터 값 받아오기(술래는 파라미터 값으로 랜덤함수를 선언하도록 한다.)
	}	
}// Tagger클래스 end블럭


/*====================================================================================*/



















