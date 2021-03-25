package e_oop;

public class Calculator {
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		double value1 = c.Plus(123456, 654321);
		double value2 = c.Multiply(value1, 123456);
		double value3 = c.Division(value2, 123456);
		double value4 = c.Subtract(value3, 654321);		
		double value5 = c.Remainder(value4, 123456);
		
		System.out.println(value1 + " / " + value2 + " / " + value3 + " / " + value4 + " / " + value5);
	}
		
	double Plus(double i, double j){
//		int Plus = ;
		return i + j;
	}
	double Subtract(double i, double j){
//		int Subtract = i - j;
		return i - j;
	}
	double Multiply(double i, double j){
//		int Multiply = i * j;
		return i * j;
	}
	double Division(double i, double j){
//		int Division = i / j;
		return i / j;
	}
	double Remainder(double i, double j){
//		int Remainder = i % j;
		return i % j;
	}
	
}
