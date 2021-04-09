package k_jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class CREATE extends Eexecute{
	
	void create(){
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "CREATE TABLE JavaTEST2"
					+ "("
					+ "testNumber NUMBER(4) NOT NULL,"
					+ "testName VARCHAR(10)"
					+ ")";
			ps = con.prepareStatement(sql);
			int rs = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
	}
	
}
