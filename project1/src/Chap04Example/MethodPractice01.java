package Chap04Example;

import java.util.Scanner;

public class MethodPractice01 {
	public static void printMax(int a, int b) {
		if (a == b) {
			System.out.print(a);
		} else if (a < b) {
			System.out.print(b);
		} else {
			System.out.println("같다");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		printMax(num1, num2);
		
		scanner.close();
	}

}
