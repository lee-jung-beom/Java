package j_collection;

import java.util.ArrayList;

public class Score {
	public static void main(String[] args) {
		/*
		 * 2021-03-23 시험문제(그대로 출제할 거임)
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100 사이의 랜덤값으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 이름		국어		영어		수학		사회		과학		Oracle		Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90			90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90			90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90			90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90			90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90			90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450			450			
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00		90.00	
		 */
		ArrayList<String> subject = new ArrayList<>();
		subject.add("이름");
		subject.add("국어");
		subject.add("영어");
		subject.add("수학");
		subject.add("사회");
		subject.add("과학");
		subject.add("Oracle");
		subject.add("Java");
		subject.add("합계");
		subject.add("평균");
		subject.add("석차");
		
		ArrayList<String> name = new ArrayList<>();
		name.add("사나고");
		name.add("희동이");
		name.add("둘리");
		name.add("도우너");
		name.add("루피");
		
		ArrayList<String> SumAvg = new ArrayList<>();
		SumAvg.add("과목합계");
		SumAvg.add("과목평균");
		
		ArrayList<Integer> score = new ArrayList<>();		
		
		int sum = 0;
		double avg = 0;
		
		int d_sum = 0;
		int d_avg = 0;
		
		for(int i = 0; i < subject.size(); i++){
			System.out.print(subject.get(i) + "\t");
		}
		System.out.println();
		for(int i = 0; i < name.size(); i++){
			System.out.print(name.get(i) + "\t");
			for(int j = 0; j < subject.size()-4; j++){
				int randomScore = (int)(Math.random()*100 + 1);
				score.add(j, randomScore);
				System.out.print(score.get(j) + "\t");				
				
				sum += score.get(j);
				avg = sum / 8.00;
			}
			
			System.out.print(sum + "\t" + Math.round(avg)*100.0/100);
			System.out.println();
		}
		for(int i = 0; i < SumAvg.size(); i++){
			System.out.print(SumAvg.get(i));
			System.out.println();
		}
		
		
	} //main block
}
