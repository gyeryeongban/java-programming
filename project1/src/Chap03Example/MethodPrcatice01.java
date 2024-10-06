package Chap03Example;

public class MethodPrcatice01 {
//	public static int add(int x, int y) {
//		return x + y;
//	}
	
	public static void add(int x, int y) {
		System.out.println(x + "(와)과 " + y + "의 합은 " + (x + y) + "입니다.");
	}
	
	public static void main(String[] args) {
		int a = 5, b = 6;
//		int sum = add(a, b);
//		System.out.println(a + "(와)과 " + b + "의 합은 " + sum + "입니다.");
		add(a, b);
	}

}
