package I_api;

import java.util.Scanner;


public class SetComma {
	public static void main(String[] args) {
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		//1,234,567
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		String temp = "";
		String temp2 ="";
		
		int count = 0;
		
		System.out.print("숫자 입력> ");
		String input = sc.nextLine();
		
		for(int i = input.length()-1; i >= 0; i--){
			count++;
			temp = String.valueOf(input.charAt(i));	
			sb.append(temp);
			if(count == 3){				
				sb.append(",");
				count = 0;
			}else if(i == 1){
				sb.append("");
				count = 0;
			}
//			temp = String.valueOf(input.charAt(input.length()-1-i));
		}		
//		System.out.println(sb);		
		String reverse = sb.reverse().toString();
		System.out.println(reverse);		
	}
}
