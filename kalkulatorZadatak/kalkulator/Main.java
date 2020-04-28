package kalkulator;

public class Main {

	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 5;
		
		System.out.println(addNums(num1, num2));
		System.out.println(subtractNums(num1, num2));
		System.out.println(multiplicateNums(num1, num2));
		System.out.println(divideNums(num1, num2));
	}
	
	public static int addNums(int num1, int num2) {
		int result = num1 + num2;
		System.out.print("Zbir: ");
		return result;
	}
	
	public static int subtractNums(int num1, int num2) {
		int result = num1 - num2;
		System.out.print("Razlika: ");
		return result;
	}
	
	public static int multiplicateNums(int num1, int num2) {
		int result = num1 * num2;
		System.out.print("Proizvod: ");
		return result;
	}
	
	public static int divideNums(int num1, int num2) {
		int result = num1 / num2;
		System.out.print("Kolicnik: ");
		return result;
	}
	
}
