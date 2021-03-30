package EscapeGame;


public class Process extends MainProcess{
	Scan sc = new Scan();
	Story story = new Story();
	
	void process(){	
		input = sc.nextInt();
		switch(input){
		case 1 : story.Firstfloor(); break;
		case 2 : System.out.println("게임 종료...."); System.exit(0);
		}
	}
	
}
