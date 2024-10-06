package Chap03Example;

import java.util.Scanner;

public class ConditionPractice01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the age: ");
		int age = scanner.nextInt();
		
		if (age >= 20 && age <= 30) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		scanner.close();
	}

}
