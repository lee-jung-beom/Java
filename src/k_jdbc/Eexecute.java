package k_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Eexecute {
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "ant";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	static SELECT sel = new SELECT();
	static CREATE crt = new CREATE();
	
	public static void main(String[] args) {
//		sel.select();
		crt.create();
	}
}
