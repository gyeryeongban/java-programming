package Chap03Example;

import java.util.Scanner;

public class ConditionPractice02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		if (age < 13) {
			System.out.println("kid");
		} else if (age >= 13 && age <= 19) {
			System.out.println("tennager");
		} else if (age >= 20 && age <= 29) {
			System.out.println("twenties");
		} else if (age >= 30 && age <= 39) {
			System.out.println("thirties");
		} else if (age >= 40 && age <= 49) {
			System.out.println("forties");
		} else if (age >= 50 && age <= 59) {
			System.out.println("fifties");
		} else {
			System.out.println("sixties and over");
		}
		
		scanner.close();
	}
}
