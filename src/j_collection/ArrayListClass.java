package j_collection;

import java.util.ArrayList;

public class ArrayListClass {
	
	public static void main(String[] args) {
		/*
		 * Collections Framework
		 * - 다수의 데이터를 다루기 위한 표준 방식
		 * - List
		 * - Map
		 * - Set
		 * 
		 * ArrayList의 주요 메서드
		 * - boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * - void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * - Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.  
		 * *add는 밀려나는 것, set은 덮어쓰는 것
		 * - Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * - int size() : 저장된 객체의 수를 반환한다.
		 * - Object remove(int index) : 지정된 위치의 객체를 제거한다. 
		 */
		
//		 ArrayList sample = new ArrayList(); //ArrayList는 아무 타입이나 저장할 수 있다.
//		 
//		 sample.add("abc");
//		 sample.add(100);
//		 System.out.println(sample);
//		 sample.add(new Scanner(System.in));
//		 //ArrayList의 단점은 인덱스를 꺼내 사용 시 어떤 타입을 가졌는지 예상을 할 수 없다.
//		 
//		 ArrayList<Integer> list = new ArrayList<>(); //<> : generic
//		 list.add(new Integer(10));
//		 list.add("abc"); //컴파일 에러 발생
//		 list.add(20);
		 /*
		  * 래퍼 클래스
		  * - byte 		: Byte
		  * - short 	: Short
		  * - int 		: Integer
		  * - long	 	: Long
		  * - float 	: Float
		  * - double 	: Double
		  * - boolean 	: Boolean
		  * - char 		: Charater
		  */
		 
//		 System.out.println(list);
		 
//		 list.add(1, 30);
//		 System.out.println(list);
//		 
//		 list.add(1, 40);
//		 System.out.println(list);
		 
//		 int before = list.set(2, 40); //set은 기존의 값을 리턴해준다(리턴한 값을 before변수에 저장)
//		 System.out.println("before : " + before);
//		 System.out.println("after : " + list.get(2));
//		 System.out.println(list);

//		 for(int i = 0; i < list.size(); i++){
//			 System.out.println(i + " : " + list.get(i));
//		 }
		 
//		 list.remove(1);
//		 System.out.println(list);
		 //tip. remove메서드를 사용하여 여러개의 인덱스를 제거할 경우 뒤에서부터 제거해야한다.
//		 for(int i = list.size() - 1; i >= 1; i--){
//			 list.remove(i);
//		 }
//		 System.out.println(list);
		 
		 //list에 1~100사이의 랜덤값을 10개 저장해주세요.
//		 ArrayList<Integer> ranNum = new ArrayList();
//		 int sum = 0;
//		 double avg = 0;
//		 
//		 for(int i = 0; i< 10; i++){
//			 int random = (int)(Math.random()*100+1);
//			 ranNum.add(random); 
//			 
//			 sum += ranNum.get(i);
//			 avg = ((double)sum / ranNum.size());
//		 }
//		 System.out.println(ranNum);
//		 System.out.println(sum + ", " + Math.round(avg*100)/100.0);
		 
		 //최소값과 최대값을 구해주세요.
//		 int max = ranNum.get(0);
//		 int min = ranNum.get(0);
//		 
//		 for(int i = 0; i < ranNum.size(); i++){
//			 for(int j = 0; j < ranNum.size(); j++){
//				 if(ranNum.get(i) > max){
//					 max = ranNum.get(i);
//				 }
//				 if(ranNum.get(i) < min){
//					 min = ranNum.get(i);
//				 }
//			 }
//		 }
//		 System.out.println("MAX : " + max + " / MIN : " + min);
		 
		 //list를 오름차순으로 정렬해주세요

//		 int front = 0;
//		 int back = 0;
//		 
//		 for(int i = 0; i < ranNum.size(); i++){
//			 for(int j = 1; j < ranNum.size(); j++){
//				 front = ranNum.get(i);
//				 back = ranNum.get(j);
//				 if(front < back){
//					 front = front;
//				 }else if(front > back){
//					 front = back;
//				 }
//			 }			 
//		 }
//		 System.out.println(ranNum);
		 
//		for(int i = 0; i < ranNum.size()-1; i++){
//			min = i;
//			for(int j = i+1; j < ranNum.size(); j++){
//				if(ranNum.get(j) < ranNum.get(min)){
//					min = j;
//				}
//			}
//			int temp = ranNum.get(i);
//			ranNum.set(i, ranNum.get(min));
//			ranNum.set(min, temp);
//		}
//		System.out.println(ranNum);
		
		
		//2차원 
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(10);
		list3.add(20);
		list3.add(30);	
		
		list3 = new ArrayList<>();
		list3.add(40);
		list3.add(50);
		
		list2.add(list3);
		
		for(int i = 0; i < list2.size(); i++){
//			ArrayList<Integer> list4 = list2.get(i);
//			for(int j = 0; j < list4.size(); j++){
//				System.out.println(list4.get(j) + "\t");
//			}
//			System.out.println();
			for(int j = 0; j < list2.get(i).size(); j++){
				System.out.println(list2.get(i).get(j));
			}
		}
		 
	}//main end_block
}


















