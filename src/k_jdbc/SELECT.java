package k_jdbc;

import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class SELECT extends Eexecute{
	
	void select(){
				
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * "
				        	+ "FROM emp";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			
			int columnCount = metaData.getColumnCount(); //쿼리문이 다 실행되고 나서, 그 쿼리문으로 부터 가지고온 테이블의 컬럼의 수를 연산하여 변수(여기서는 columnCount)에 저장한다.
			
			for(int i = 1; i < columnCount; i++){
				System.out.print(metaData.getColumnName(i) + "\t");
			}
			System.out.println();
			while(rs.next()){
				for(int i = 1; i < columnCount; i++){
					Object value = rs.getObject(i);
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
	}
	
}
