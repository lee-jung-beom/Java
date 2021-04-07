package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {
	HashMap<String, Object> row = new HashMap<>();
	ArrayList<HashMap<String, Object>> table = new ArrayList<>();
	ScanUtil input = new ScanUtil();
	static Board board = new Board();
//	int tempLength = 0;
	
	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * ---------------------------------------
		 * 번호		제목		작성자		작성일
		 * ---------------------------------------
		 * 5		안녕하세요	홍길동		4/7
		 * 4		안녕하세요	홍길동		4/7
		 * 3		안녕하세요	홍길동		4/7
		 * 2		안녕하세요	홍길동		4/7
		 * 1		안녕하세요	홍길동		4/7
		 * ---------------------------------------
		 * 1.조회		2.등록	0.종료
		 * 
		 * - 조회 후 수정 및 삭제 가능		
		 */
		
//		HashMap<String, Object> row = new HashMap<>();
//		ArrayList<HashMap<String, Object>> table = new ArrayList<>();		
		
//		System.out.println("----------------------------------------------------");
//		System.out.println("번호\t\t제목\t\t작성자\t\t작성일");
//		System.out.println("----------------------------------------------------");
		board.lookUp();
//		System.out.println("----------------------------------------------------");
//		System.out.println("1.조회\t\t2.등록\t\t0.종료");
		board.choiceBtn();
	}
	
	void boardLogic(){
//		HashMap<String, Object> row = new HashMap<>();
//		ArrayList<HashMap<String, Object>> table = new ArrayList<>();
		
	}
	
	void choiceBtn(){
		switch(input.nextInt()){
		case 1: board.lookUp(); break;
		case 2: board.register(); break;
		case 3: board.read(); break;
		case 0: board.quit(); break;
		}
	}
	
	void lookUp(){ //1.조회 메서드
		Board board = new Board();		
			
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("번호\t\t제목\t\t작성자\t\t작성일");
			System.out.println("-------------------------------------------------------------------------------");
			for(int i = 0; i < table.size(); i++){
				HashMap<String, Object> ROW = table.get(i);
				System.out.println(ROW.get("번호") + "\t\t" + ROW.get("제목") + "\t\t" + ROW.get("작성자") + "\t\t" + ROW.get("작성일"));
			}			
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("1.조회\t\t2.등록\t\t3.게시물 읽기\t\t0.종료");
			board.choiceBtn();
			
	}
	
	void register(){ //2.등록 메서드
		//번호(PK), 제목, 내용, 작성자, 작성일
//		HashMap<String, Object> row = new HashMap<>();
		row.put("번호", table.size());
		System.out.print("제목 : ");
		row.put("제목", input.nextLine());		
		System.out.println();
		System.out.print("내용 : ");
		row.put("내용", input.nextLine());
		System.out.println();
		System.out.print("작성자 : ");
		row.put("작성자", input.nextLine());
		System.out.println();
		row.put("작성일", new Date());
		table.add(row);
		System.out.println("1.조회\t\t2.등록\t\t0.종료");
		board.choiceBtn();
	}
	
	void read(){ //3.읽기 메서드
		System.out.println("읽을 게시물의 번호를 입력하세요>");
		row.get(input.nextInt());
	}
	
	void quit(){ //0.종료 메서드
		System.out.println("종료.");
		System.exit(0);
	}

}




















