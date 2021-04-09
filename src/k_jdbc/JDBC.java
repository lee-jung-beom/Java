package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 * - 자바와 데이터베이스르 연결해주는 라이브러리
		 * - ojdbc : 오라클 JDBC
		 * 
		 * JDBC 작성 단계
		 * 1. Connection 생성(DB연결)
		 * 2. Statement 생성(쿼리작성)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출(select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기
		 */
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "ant";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스.(드라이버 서로 다른 것들을 연결해주는 다리 역할)
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM member";
			ps = con.prepareStatement(sql);
			
			//select 
			rs = ps.executeQuery();
			
			//insert, update, delete
//			int result = ps.executeUpdate();		
			
			while(rs.next()){ //next를 호출하면 첫번째 '행'을 추출하게 된다. 그리고 또 next를 호출하면 그 다음 '행'이 추출되게 된다.
				String memId = rs.getString(1); //문자열을 나타내는 것을 불러올 때, 괄호 안에 1을 입력하여 첫번째 컬럼을 불러온다
				String memPass = rs.getString("MEM_PASS"); //컬럼의 이름으로도  불러올 수 있다.
				System.out.println("MEM_ID : " + memId + "/ MEM_PASS : " + memPass);
//				rs.getInt(columnIndex);
//				rs.getDate(columnIndex);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try{rs.close();} catch (Exception e) {}
			if(ps != null) try{ps.close();} catch (Exception e) {}
			if(con != null) try{con.close();} catch (Exception e) {}
		}
		
		
	}

}




















