package myJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {

	private static JDBCUtil instance; //JDBCUtil은 하나만 있어야하기 때문에 static을 사용한다.
		
	private JDBCUtil(){
		
	}
	
	public static JDBCUtil getInstance() {
		if(instance == null){
			instance = new JDBCUtil();
		}
		return instance;
	}
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "ant";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	
}
