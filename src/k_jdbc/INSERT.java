package k_jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class INSERT extends Eexecute{
	
	void insert(){
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "INSERT INTO JavaTEST2 VALUES (?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 1);
			ps.setString(2, "Hello World!");			
			
			int result = ps.executeUpdate();
			
			System.out.println(result + "개의 행이 영향을 받았습니다. ");		
			
//			java.util.Date date= new java.util.Date();
//			date.setYear(2021);
//			ps.setDate(1, new Date(getTime()));
//			ps.setDate(1, Date.valueOf("2021-04-09"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
//			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
	}
	
}
