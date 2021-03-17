package c_statement;


public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * -if문
		 * -switch문
		 * 
		 * if문
		 * - if(조건식){} : 조건식의 결과가 true이면 블럭 안의 문장을 수행한다
		 * - else if(조건식){} : 다수의 조건이 필요할 때 if문에 추가한다
		 * - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다 
		 * 
		 */
		
//		boolean b = true;
//		
//		if(b = false){
//			System.out.println("Fail!");
//		} else{
//			System.out.println("Succeeded!");
//		}
		
//		int a = 1;
//		
//		if(a == 1){
//			System.out.println("조건식의 연산결과가 true이면 수행된다.");
//		}
//		
//		if(a == 0){
//			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
//		}
//		
//		if(a == 1){
//			System.out.println("a가 1인 경우에 하고 싶은 것");
//		}else if(a == 2){
//			System.out.println("a가 2인 경우에 하고 싶은 것");
//		}else if(a == 3){
//			System.out.println("a가 3인 경우에 하고 싶은 것");
//		}else{
//			System.out.println("이 외의 경우에 하고 싶은 것");
//		}
//		
//		if(a < 10){
//			System.out.println("a가 10보다 작다.");
//		}else if(a <20){
//			System.out.println("a가 20보다 작다.");
//		}
		
//		int score = 70;
//		//문제1) 점수가 60점 이상이면 합격 그렇지 않으면 불합격이라고 출력하시오.
//		if(score >= 60){
//			System.out.println("합격");
//		}else{
//			System.out.println("불합격");
//		}
		
		//점수에 등급을 부여하는 프로그램
//		int score = 59;
//		String grade = null;
//		
		/*
		 * 기본값 : 직접 초기화 하지 않았을 때 초기화 되는 값
		 * - 참조형 타입 : null
		 * - boolean : false
		 * - char : " " 실제론 (0)
		 * - 나머지 타입 : 0
		 */
		
//		if(90 <= score){
//			grade = "A";
//		}else if(80 <= score){
//			grade = "B";
//		}else if(70 <= score){
//			grade = "C";
//		}else if(60 <= score){
//			grade = "D";
//		}else{
//			grade = "F";
//		}
//		
//		System.out.println("점수: " + grade);
		
//		int score = 90;
//		String grade = null;
//		
//		if(90 <= score){
//			grade = "A";
//			if(97 <= score){
//				grade += "+";
//			}else if(93 >= score){
//				grade += "-";
//			}
//		}else if(80 <= score){
//			grade = "B";
//			if(87 <= score){
//				grade += "+";
//			}else if(83 >= score){
//				grade += "-";
//			}
//		}else if(70 <= score){
//			grade = "C";
//			
//			if(77 <= score){
//				grade += "+";
//			}else if(73 >= score){
//				grade += "-";
//			}
//		}else if(60 <= score){
//			grade = "D";
//			
//			if(67 <= score){
//				grade += "+";
//			}else if(63 >= score){
//				grade += "-";
//			}
//		}else{
//			grade = "F";
//		}
//		
//		System.out.println("당신의 스코어 : " + score + ", 점수 : " + grade);
		
		/*
		 * switch문
		 * - switch(int/String){ case 1: break; }
		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 * 
		 */
		
//		int a = 10;
//		
//		switch(a){
//			case 10:
//				System.out.println("a가 10인 경우에 하고 싶은 것");
//				break;
//			case 20:
//				System.out.println("a가 20인 경우에 하고 싶은 것");
//				break;
//			default:
//				System.out.println("이 외의 경우에 하고 싶은 것");
//				break;
//		}
		//switch문은 조건이 확정적으로 정의 되어야 하기 때문에 활용성이 낮다. (하지만, 장점은 같은 조건에서 if문 보다 빠름)
		
//		String b = "a";
//		
//		switch(b){
//			case "a":
//				System.out.println("b가 \"a\"인 경우에 하고 싶은 것");
//				break;
//			case "b":
//				System.out.println("b가 \"b\"인 경우에 하고 싶은 것");
//				break;
//			default:
//				System.out.println("이 외의 경우에 하고 싶은 것");
//				break;
//		}
		//역슬래시(\)의 기능 (")안에 쌍따옴표 표시를 표시하고 싶은 경우
		
		
		//월에 해당하는 계절을 출력		
//		int month = 10;
//		String season = null;
//		
//		switch(month){
//			case 3: case 4: case 5:
//				season = "봄";
//				break;
//			case 6: case 7: case 8:
//				season = "여름";
//				break;
//			case 9: case 10: case 11:
//				season = "가을";
//				break;
//			case 12: case 1: case 2:
//				season = "겨울";
//				break;
//			default:
//				season = "NULL";
//				break;
//		}
//		System.out.println("계절은 " + season + "이다....");
		
//		int score = 50;
//		String grade = null;
//		
//		switch(score / 10){
//			case 9: grade = "A";
//			break;
//			case 8: grade = "F";
//			break;
//			case 7: grade = "C";
//			break;
//			case 6: grade = "D";
//			break;
//			default: grade = "F";
//			break;
//		}
//		System.out.println("등급: "+ grade);
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요
//		Scanner sc = new Scanner(System.in);
		
//		System.out.print("숫자 입력: ");
//		int input = sc.nextInt();
		
//		switch(input){
//			case 0: System.out.println("0"); break;
//			default: System.out.println("Not 0");
//		}
		
//		if(input == 0){
//			System.out.println("0");
//		}else{
//			System.out.println(input);
//		}
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
//		System.out.println("숫자 입력: ");
//		int input = sc.nextInt();
		
//		switch(input % 2){
//			case 0: System.out.println("짝수"); break;
//			default: System.out.println("홀수");
//		}
		
//		if(input % 2 == 0){
//			System.out.println("짝수");
//		}else{
//			System.out.println("홀수");
//		}
		
		//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
//		System.out.println("점수 입력: ");
//		int score_1 = sc.nextInt();
//		int score_2 = sc.nextInt();
//		int score_3 = sc.nextInt();
//		
//		int sum = score_1 + score_2 + score_3;
//		int avg = (score_1 + score_2 + score_3) / 3;
//		
//		System.out.println("총점: " + sum);
//		System.out.println("평균: " + avg);
//		
//		String level = null;
//		
//		if(avg >= 90){
//			System.out.println("A");
//		}else if(avg >= 80){
//			System.out.println("B");
//		}else if(avg >= 70){
//			System.out.println("C");
//		}else if(avg >= 60){
//			System.out.println("D");
//		}else{
//			System.out.println("F");
//		}
		
		//1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
//		double num = (double)(Math.random())*100;
//		double num1 = (double)(Math.random())*100;
//		double num2 = (double)(Math.random())*100;
//		int num_a = (int)Math.round(num);
//		int num_b = (int)Math.round(num1);
//		int num_c = (int)Math.round(num2);
//			
//		System.out.println("무작위 정렬: " + num_a + " " + num_b + " " + num_c);
		
//		if(num_a / num_b == 0 && num_a / num_c == 0){
//			if(num_b / num_c == 0){
//				System.out.println("정렬: " + num_a + " " + num_b + " " + num_c);
//			}
//		}else if(num_a / num_b == 0 && num_a / num_c == 0){
//			if(num_c / num_b == 0){
//				System.out.println("정렬: " + num_a + " " + num_c + " " + num_b);
//			}
//		}else if(num_b / num_a == 0 && num_b / num_c == 0){
//			if(num_a / num_c == 0){
//				System.out.println("정렬: " + num_b + " " + num_a + " " + num_c);
//			}
//		}else if(num_b / num_a == 0 && num_b / num_c == 0){
//			if(num_c / num_a == 0){
//				System.out.println("정렬: " + num_b + " " + num_c + " " + num_a);
//			}
//		}else if(num_c / num_a == 0 && num_c / num_b == 0){
//			if(num_a / num_b == 0){
//				System.out.println("정렬: " + num_c + " " + num_a + " " + num_b);
//			}
//		}else{
//				System.out.println("정렬: " + num_c + " " + num_b + " " + num_a);
//		}
		
		int x = (int)(Math.random()*100) + 1;
		int y = (int)(Math.random()*100) + 1;
		int z = (int)(Math.random()*100) + 1;
		
		if(x > y){
			int t = x;
			x = y;
			y = t;
		}
		if(x > z){
			int t = x;
			x = z;
			z = t;
		}
		if(y > z){
			int t = y;
			y = z;
			z = t;
		}
		System.out.println(x + " < " + y + " < " + z);		
		
	} // 초기 블록 

}
