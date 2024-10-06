package Chap03Example;

import java.util.Scanner;

public class ConditionPractice03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the time of day: ");
		int time = scanner.nextInt();
		
		if (time <= 24) {
			if (time < 12) {
				System.out.println("Good Morning");
			} else if (time >= 12 && time <= 18) {
				System.out.println("Good Afternoon");
			} else if (time > 18) {
				System.out.println("Good Evening");
			}
		} else {
			System.out.println("Invalid hour of the day");
		}
		
		scanner.close();
	}

}
