package EscapeGame;

public class Story extends MainProcess{
	/*
	 * - 2층으로 올라가면 SecondFloor클래스를 호출한다.
	 */
	Scan sc = new Scan();
	
	SecondFloor second = new SecondFloor();
	
	void Firstfloor(){		
		System.out.println("현재 장소 : 1층 홀");
		System.out.println("선택지>\n[① 2층으로 올라간다.] [② 좌측 복도로 이동한다.] [③ 우측 복도로 이동한다.] [④ 현관문을 열어본다.]");
		choice1();
	}
	
	void choice1(){
		input = sc.nextInt();
		switch (input) {
		case 1:
			second.secondFloor();
			break;
		case 2:
			;
			break;
		case 3:
			;
			break;
		case 4:
			System.out.println("현관문이 굳게 잠겨있어 열 수 없다.");
			break;
		default:
			System.out.println("다시입력하세요.");
		}
	}
	
}
