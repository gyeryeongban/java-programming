package Chap04Example;

public class MethodPractice {
	public static void printX(int x) {
		System.out.println("Method 1");
		System.out.println(x);
		x++;
		System.out.println(x);
		System.out.println("Method 2");
	}

	public static void main(String[] args) {
		int x = 10;
		System.out.println("Main 1");
		System.out.println(x);
		printX(x);
		System.out.println(x);
		System.out.println("Main 2");

	}

}
