package EscapeGame;

public class SecondFloor extends MainProcess{
	Scan sc = new Scan();
	Story story = new Story();
	
	void secondFloor(){
		input = sc.nextInt();
		
		System.out.println("현재 장소 : 2층 홀");
		System.out.println("선택지>\n[① 1층으로 내려간다.] [② 좌측 복도로 이동한다.] [③우측 복도로 이동한다.] [④ 홀에 있는 책상 서랍을 열어본다.]");
		
		switch(input){			
			case 1 : story.Firstfloor(); break;
			case 2 : ; break;
			case 3 : ; break;
			case 4 : ; break;
			default : System.out.println("다시 입력하십시오.");
		}
	}
}
