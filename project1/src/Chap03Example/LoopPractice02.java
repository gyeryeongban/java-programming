package Chap03Example;

import java.util.Scanner;

public class LoopPractice02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		while (true) {
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();
			
			if (number % 3 == 0) {
				System.out.println("Total sum = " + sum);
				break;
			} else {
				sum += number;
				System.out.println("Current sum = " + sum);
				continue;
			}
		}
		
		scanner.close();
	}

}
