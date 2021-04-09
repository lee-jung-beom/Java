package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LPROD_JDBC {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "ant";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM LPROD";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				String lprodID = rs.getString("LPROD_ID");
				String lprodGU = rs.getString("LPROD_GU");
				String lprodNM = rs.getString("LPROD_NM");				
				
				System.out.println("LPROD_ID : " + lprodID + "\t\tLPROD_GU : " + lprodGU + "\t\tLPROD_NM : " + lprodNM);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
		

	}

}























