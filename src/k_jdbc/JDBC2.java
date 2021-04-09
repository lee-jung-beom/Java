package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "ant";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * "
					+ "FROM CART "
					+ "WHERE CART_MEMBER = ?"
					+ " AND CART_QTY >= ?";
			ps = con.prepareStatement(sql); //그냥 statement와 preparedStatement의 차이점은 '?'를 사용할 수 있느냐 없느냐의 차이
			ps.setString(1, "a001"); //첫번 째 파라미터: 쿼리문 물음표 순서 / 두번 째 파라미터 : 컬럼 레코드 자료 
			ps.setInt(2, 10);
						
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
			
			int columnCount = metaData.getColumnCount(); //컬럼 수 
			
			for(int i = 1; i <= columnCount; i++){
				System.out.print(metaData.getColumnName(i) + "\t");
			}
			System.out.println();
			while(rs.next()){
				for(int i = 1; i <= columnCount; i++){
					Object value = rs.getObject(i); //getObject를 사용하면 타입에 상관없이 값을 가져올 수 있다.
					System.out.print(value + "\t");
				}
				System.out.println();
			}
			
		} catch (SQLException e) { 
			e.printStackTrace();
		}finally{
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
		
		//CRUD 다 만들기(4개의 클래스를 각각 만든다)
		//emp테이블 이용하기
	}
}
