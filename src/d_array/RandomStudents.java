package d_array;

import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {
		//2021년 03월 17일 과제 : RandomStudents
		/*
		 * 입력한 숫자만큼 우리반 학생들중 랜덤으로 뽑아서 출력하는 프로그램을 만들어주세요.
		 */
		String[] student = new String[]{"톰", "브라운", "아이작", "링컨", "뉴턴", "오라클", 
				"나디아", "소피아", "피카츄", "지우"}; //10명의 학생 
		
		
		Scanner s = new Scanner(System.in);		
		System.out.print("학생 수를 임의로 입력 해주세요> ");
		int input = s.nextInt();
		int[] number = new int[input];
//		int count = (int)(Math.random()*student.length);
		
		
		//반복문으로 student 인덱스를 검사하여 랜덤으로 이름을 뽑도록 하자.
//		student[]	
		for (int i = 0; i < input; i++) {
			number[i] = (int) (Math.random() * student.length);

			System.out.print(student[number[i]] + " ");
		}

		
	}// main블럭

}
