package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {
		//2021년 03월 17일 과제 : RandomStudents
		/*
		 * 입력한 숫자만큼 우리반 학생들중 랜덤으로 뽑아서 출력하는 프로그램을 만들어주세요.
		 */
//		String[] student = new String[]{"톰", "브라운", "아이작", "링컨", "뉴턴", "오라클", 
//				"나디아", "소피아", "피카츄", "지우"}; //10명의 학생 
//		
//		
//		Scanner s = new Scanner(System.in);		
//		System.out.print("학생 수를 임의로 입력 해주세요> ");
//		int input = s.nextInt();
//		int[] number = new int[input];		
		
		//반복문으로 student 인덱스를 검사하여 랜덤으로 이름을 뽑도록 하자		
//		for(int n1 = 0; n1 < student.length; n1++){
//			for(int n2 = 0; n2 < student.length; n2++){
//				if(student[n1] != student[n2]){
//					System.out.println(student[n1]);
//					break;
//				}				
//			}				
//		}
//		int i = (int) (Math.random() * student.length);
//		if(i <= input){
//			for (i = (int) (Math.random() * student.length); i < input; i++) {
////				number[i] = (int) (Math.random() * student.length);
//				
//				for (int n1 = 0; n1 < student.length; n1++) {
//					for (int n2 = 0; n2 < student.length; n2++) {
//						if (student[n1] != student[n2]) {
//							System.out.println(student[n1]);
//						}
//					}
//				}
//				System.out.print(student[number[i]] + " ");
////				break;
//			}
//		}else if(i > input){
//			System.out.println("입력한 수가 너무 큽니다.");
//		}		
		
		//내가 한 거  
//		for (int i = 0; i < input; i++) {
//			number[i] = (int) (Math.random() * student.length);
//			if (input < student.length) {
//				System.out.print(student[number[i]] + " ");
//			} else if (input >= student.length) {
//				System.out.println("입력이 전체 학생 수를 초과했습니다");
//				break;
//			}
//		}
		
		String[] students = {"최기문", "이경준", "최윤지", "오수연"};
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇 명 뽑을까요?>");
		int count = Integer.parseInt(s.nextLine());
		
		String[] pick = new String[count];
		int pickCount = 0;
		
		do{
			int random = (int)(Math.random()*students.length);
		
			boolean flag = true;
			for(int i = 0; i < pick.length; i++){
				if(students[random].equals(pick[i])){
					flag = false;
				}
			}
			if(flag){
				pick[pickCount++] = students[random];
			}
		}while(pickCount < count);	
		
		System.out.println(Arrays.toString(pick));
		
	}// main블럭

}
