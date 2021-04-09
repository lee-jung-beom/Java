package k_jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DELETE extends Eexecute{

	void delete(){
		try {
			DriverManager.getConnection(url, user, password);
			
			String sql = "DELETE FROM JavaTEST";
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
	
		
	}//class block	
}
