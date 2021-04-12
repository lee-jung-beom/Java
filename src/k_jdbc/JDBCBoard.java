package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import e_oop.ScanUtil;


public class JDBCBoard {
	//TB_JDBC_BOARD
	/*
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
	public static void main(String[] args) {
		JDBCBoard board = new JDBCBoard();
		board.lookUp();
	}
	
	ScanUtil input = new ScanUtil();
	
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "ant";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	void lookUp(){			
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT BOARD_NO, CONTENT, REG_DATE, TITLE, USER_ID "
					      + "FROM TB_JDBC_BOARD";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();			
			
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("번호\t\t작성일\t\t\t제목\t\t작성자");
			System.out.println("-----------------------------------------------------------------------------");	
			
			while(rs.next()){
				int board_no = rs.getInt(1);
				String content = rs.getString(2);
				Date reg_date = rs.getDate(3);
				String title = rs.getString(4);
				String user_id = rs.getString(5);
				
				System.out.println(board_no + "\t\t" + reg_date + "\t\t" + title + "\t\t" + user_id);
			}			
			System.out.println("-----------------------------------------------------------------------------");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
		System.out.println("1.조회\t\t2.등록\t\t3.종료");
		switch(input.nextInt()){
		case 1 : read(); break;
		case 2 : register(); break;
		case 0 : System.out.println("게시판을 종료합니다."); System.exit(0); break;
		}
	}
	
	void read(){ //조회
		System.out.println("조회할 게시물의 번호를 입력하세요>");
		int boardNo = 0;
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT BOARD_NO, CONTENT, REG_DATE, TITLE, USER_ID "
					+ "FROM TB_JDBC_BOARD "
					+ "WHERE BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, input.nextInt());
			
			rs = ps.executeQuery();				
			
			while(rs.next()){
				boardNo = rs.getInt();
				System.out.println("번호 : " + rs.getInt(1));
				System.out.println("내용 : " + rs.getString(2));
				System.out.println("날짜 : " + rs.getDate(3));
				System.out.println("제목 : " + rs.getString(4));
				System.out.println("사용자 : " + rs.getString(5));
			}		
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		System.out.println("1.수정\t\t2.삭제");
		switch(input.nextInt()){
		case 1 : Revise(); break;
		case 2 : Delete(); break;
		}
	}
	
	void Revise(int boardNo){
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE TB_JDBC_BOARD "
					+ "SET CONTENT = ?"
					+ ", TITLE = ?"
					+ "WHERE BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, input.nextLine());
			ps.setString(2, input.nextLine());
			ps.setInt(3, );
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void Delete(){
		
	}
	
	void register(){ //등록		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "INSERT INTO TB_JDBC_BOARD (BOARD_NO, CONTENT, REG_DATE, TITLE, USER_ID)"
					+ " VALUES((SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD), "
					+ "?, SYSDATE, ?,?)";
			
			ps = con.prepareStatement(sql);
			System.out.print("내용 : "); ps.setString(1, input.nextLine()); System.out.println();
			System.out.print("제목 : "); ps.setString(2, input.nextLine()); System.out.println();
			System.out.print("작성자 : "); ps.setString(3, input.nextLine()); System.out.println();
			
			int result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}			
		}
		lookUp();
	}
	
}



















