package mine;

import java.util.Scanner;

public class my_mine_GUI {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println(A.rom);
		System.out.println(A.ram("remian"));
		
		System.out.println("문자열을 입력하시오>");
		String m = B.input();
	}
}

class A{
	static int rom = 15;
	
	static String ram(String name){
		return name;
	}
}

class B{
	static Scanner sc = new Scanner(System.in);
	
	public static String input(){
		return sc.nextLine();
	}
	
}	
