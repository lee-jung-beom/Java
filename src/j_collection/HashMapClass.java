package j_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapClass {
	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 */
		
//		HashMap<String, Object> map = new HashMap<>(); //보통 key는 String을 사용한다
//		
//		map.put("age", 10);
//		map.put("name", "홍길동");
//		map.put("date", new Date());
//		
//		System.out.println(map); //HashMap은 순서라는 개념이 없기 때문에 입력 순서에 상관없이 출력된다
//		
//		map.put("name", "제임스");
//		System.out.println(map);
//		
//		map.remove("age");
//		System.out.println(map);
//		
//		Object value = map.get("name");
//		System.out.println(value);
//		
//		String str = (String)map.get("name");
//		System.out.println(str);
//		
//		Set<String> keys = map.keySet(); //Set은 중복된 값을 허용하지 않는다, Set에서 값을 꺼낼 수 있는 메서드가 존재하지 않는다 (사용빈도가 낮다)
		
//		for(String key : keys){ //향상된 for문
//			System.out.println(key + " : " + map.get(key));
//		}
		
		//테이블 가져오는 법 : HashMap을 많이 만들어서 ArrayList에 삽입한다.
		
		HashMap<String, Object> row = new HashMap<>();
		
		ArrayList <HashMap<String, Object>> table = new ArrayList<>();
		
		row = new HashMap<>();
		row.put("LPROD_ID", "1");
		row.put("LPROD_GU", "P101");
		row.put("LPROD_NM", "컴퓨터제품");		
		table.add(row);		
		
		row = new HashMap<>();
		row.put("LPROD_ID", "2");
		row.put("LPROD_GU", "P101");
		row.put("LPROD_NM", "컴퓨터제품");
		table.add(row);
		
		row = new HashMap<>();
		row.put("LPROD_ID", "3");
		row.put("LPROD_GU", "P101");
		row.put("LPROD_NM", "컴퓨터제품");
		table.add(row);
		
		row = new HashMap<>();
		row.put("LPROD_ID", "4");
		row.put("LPROD_GU", "P101");
		row.put("LPROD_NM", "컴퓨터제품");
		table.add(row);
		
		row = new HashMap<>();
		row.put("LPROD_ID", "5");
		row.put("LPROD_GU", "P101");
		row.put("LPROD_NM", "컴퓨터제품");
		table.add(row);		
		
		System.out.println("LPROD_ID\t" + "LPROD_GU\t" + "LPROD_NM");
		for(int i = 0; i < table.size(); i++){
			HashMap<String, Object> _row = table.get(i);
			System.out.println(_row.get("LPROD_ID") + "\t\t" + _row.get("LPROD_GU") + "\t\t" + _row.get("LPROD_NM"));
		}
		
				
		
	}
}














