package Chap04Example;

public class MethodOverloadingPractice01 {
	public static void printName(String firstName) {
		System.out.println("Hello, " + firstName);
	}
	
	public static void printName(String firstName, String lastName) {
		System.out.printf("Hello, %s %s", firstName, lastName);
	}

	public static void main(String[] args) {
		printName("Gyeryeong");
		printName("Gyeryeong", "Ban");
	}

}
