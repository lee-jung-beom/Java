package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCTest {
	public static void main(String[] args) {
		
		JDBCUtil jdbc = JDBCUtil.getInstance();
		
		String sql = "SELECT * FROM CART WHERE CART_MEMBER = ?";
		ArrayList<Object> param = new ArrayList<>();
		param.add("a001");
		
		List<Map<String, Object>> list = jdbc.selectList(sql, param);
		
		for(int i = 0; i < list.size(); i++){
			Map<String, Object> row = list.get(i);
			for(String key : row.keySet()){
				System.out.print(key + " : " + row.get(key) + "\t");
			}
			System.out.println();
		}	
		
	}
}
