package Chap04Example;

import java.util.Scanner;

public class MethodPractice02 {
	public static void checkNumber(double number) {
		if (number > 0) {
			System.out.println(number + " is positive.");
		} else if (number < 0) {
			System.out.println(number + " is negative.");
		} else {
			System.out.println(number + " is zero.");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the one number: ");
		double number = scanner.nextDouble();
		
		checkNumber(number);
		
		scanner.close();
	}

}
