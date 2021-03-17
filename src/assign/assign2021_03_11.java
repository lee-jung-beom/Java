package assign;

import java.util.Scanner;

public class assign2021_03_11 {

	public static void main(String[] args) {
		/* 아래의 정보를 입력하면 그 아래처럼 출력 될 수 있도록
		 * 
		 * =======회원가입======
		 * 아이디>admin
		 * 비밀번호(4자리 숫자)>1234
		 * 이름>홍길동
		 * 나이>30
		 * 키>185.5
		 * ===================
		 * 회원가입 완료!!
		 * =====내 정보=====
		 * 아이디: admin
		 * 비밀번호: 1234
		 * 이름: 홍길동
		 * 나이: 30세
		 * 키: 185.5cm
		 */

		Scanner input = new Scanner(System.in);

		//
//		String id; //아이디
//		String password; //비밀번호
//		String name; //이름
//		int age; //나이
//		float height; //키//
		
		System.out.println("=====회원가입=====");
		System.out.print("아이디>");
		String id = input.nextLine();
		System.out.println();
		
		System.out.print("비밀번호>");
		String password = input.nextLine();
		System.out.println();
		
		System.out.print("이름>");
		String name = input.nextLine();
		System.out.println();
		
		System.out.print("나이>");
		int age = input.nextInt();
		System.out.println();
		
		System.out.print("키>");
		double height = input.nextDouble();
		System.out.println("===================");
		
		System.out.println("회원가입 완료!!");
		System.out.println("=======내 정보=======");		
		
		
		//출력
		System.out.println("아이디: " + id);
		System.out.println("비밀번호: " + password);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
	
	}

}
