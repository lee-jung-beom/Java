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
		
//		ArrayList<String> top = new ArrayList<>();
//		top.add("이름");
//		top.add("국어");
//		top.add("영어");
//		top.add("수학");
//		
//		top.add("사회");
//		top.add("과학");
//		top.add("Oracle");
//		top.add("Java");
//		top.add("합계");
//		top.add("평균");
//		top.add("석차");	
//		
//		ArrayList<String> left = new ArrayList<>();
//		left.add("둘리");
//		left.add("도우너");
//		left.add("희동이");
//		left.add("콜라");
//		left.add("사이다");
//		left.add("과목합계");
//		left.add("과목평균");
//		
//		ArrayList<Integer> score = new ArrayList<>();
//		ArrayList<Integer> temp = new ArrayList<>();
//		
//		int sum = 0;
//		double avg = 0;
//		
//		int d_sum = 0;
//		double d_avg = 0;
//		
//		for(int i = 0; i < top.size(); i++){
//			System.out.print(top.get(i) + "\t");
//		}
//		System.out.println();
//		for(int i = 0; i < left.size()-2; i++){
//			System.out.print(left.get(i) + "\t");
//			for(int j = 0; j < top.size()-4; j++){
//				int record = (int)(Math.random()*101);
//				score.add(j, record);
//				
//				if(i <= left.size()-3){
//					System.out.print(score.get(j) + "\t");					
//				}
//				sum += score.get(j);
//				avg = sum / 7; 							
//			}
//			if(i <= left.size()-3){
//				System.out.print(sum + "\t" + avg); //sum은 배열구조로 나중에 변환시키자 (석차 부분 비교 위해서)					
//			}
//			sum = 0;
//			System.out.println();
//		}
//		
//		
//		System.out.print(left.get(5) + "\t");
//		for(int i =0; i < top.size(); i++){
//			
//		}
//		System.out.println();
//		System.out.print(left.get(6));		
//		for(int i =0; i < top.size(); i++){
//			
//		}
//		System.out.println();
		
		//
		ArrayList<String> students = new ArrayList<>();
		students.add("오태훈");
		students.add("조항민");
		students.add("김정명");
		students.add("이치우");
		students.add("이강명");
		students.add("이소룡");
		students.add("성룡");
		
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("국어");
		subjects.add("영어");
		subjects.add("수학");
		subjects.add("사회");
		subjects.add("과학");
		subjects.add("Oracle");
		subjects.add("Java");
		
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		ArrayList<Integer> sums = new ArrayList<>();
		ArrayList<Double> avgs = new ArrayList<>();
		ArrayList<Integer> ranks = new ArrayList<>();
		ArrayList<Integer> subSums = new ArrayList<>();
		ArrayList<Double> subAvgs = new ArrayList<>();
		
		for(int i = 0; i < students.size(); i++) {
			ranks.add(1);
			
			ArrayList<Integer> score = new ArrayList<>();
			for(int j = 0; j < subjects.size(); j++) {
				score.add((int)(Math.random() * 101));
			}
			scores.add(score);
		}
		
		for(int i = 0; i < scores.size(); i++) {
			int sum = 0;
			for(int j = 0; j < scores.get(i).size(); j++) {
				sum += scores.get(i).get(j);
			}
			sums.add(sum);
			avgs.add(Math.round((double)sum / scores.get(i).size() * 100) / 100.0);
		}
		
		for(int i = 0; i < sums.size(); i++) {
			for(int j = 0; j < sums.size(); j++) {
				if(sums.get(i) < sums.get(j)) {
					ranks.set(i, ranks.get(i) + 1);
				}
			}
		}
		
		for(int i = 0; i < ranks.size(); i++) {
			int min = i;
			for(int j = i + 1; j < ranks.size(); j++) {
				if(ranks.get(j) < ranks.get(min)) {
					min = j;
				}
			}
			
			String tempName = students.get(i);
			students.set(i, students.get(min));
			students.set(min, tempName);
			
			ArrayList<Integer> tempScore = scores.get(i);
			scores.set(i, scores.get(min));
			scores.set(min, tempScore);
			
			int tempSum = sums.get(i);
			sums.set(i, sums.get(min));
			sums.set(min, tempSum);
			
			double tempAvg = avgs.get(i);
			avgs.set(i, avgs.get(min));
			avgs.set(min, tempAvg);
			
			int tempRank = ranks.get(i);
			ranks.set(i, ranks.get(min));
			ranks.set(min, tempRank);
		}
		
		for(int i = 0; i < subjects.size(); i++) {
			int sum = 0;
			for(int j = 0; j < students.size(); j++) {
				sum += scores.get(j).get(i);
			}
			subSums.add(sum);
			subAvgs.add(Math.round((double)sum / students.size() * 100) / 100.0);
		}
		
		System.out.println("===================================================================================");
		System.out.print("이름");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		System.out.println("-----------------------------------------------------------------------------------");
		for(int i = 0; i < scores.size(); i++) {
			System.out.print(students.get(i));
			
			ArrayList<Integer> score = scores.get(i);
			for(int j = 0; j < score.size(); j++) {
				System.out.print("\t" + score.get(j));
			}
			System.out.println("\t" + sums.get(i) + "\t" + avgs.get(i) + "\t" + ranks.get(i));
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("과목합계");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subSums.get(i));
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subAvgs.get(i));
		}
		System.out.println();
		System.out.println("===================================================================================");
		
	} //main block
}


















