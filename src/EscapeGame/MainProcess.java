package EscapeGame;

public class MainProcess{
	static int input;
	
	public static void main(String[] args) {
		Process pro = new Process();
		Story story = new Story();
		
		System.out.println("GAME START");
		System.out.println("①시작 ②끝내기");
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃                      ┃");
		System.out.println("┃                      ┃");
		System.out.println("┃                      ┃");
		System.out.println("┃                      ┃");
		System.out.println("┃       ┏━━┳━━┓        ┃");
		System.out.println("┃       ┃  ┃  ┃        ┃");
		System.out.println("┃_______┃__┃__┃________┃");
		System.out.println("저택에서 탈출하십시오.");
		pro.process();		
		
	}	
}
