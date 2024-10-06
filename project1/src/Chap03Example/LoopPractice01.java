package Chap03Example;

import java.util.Scanner;

public class LoopPractice01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= number; i++) {
			if (i != number) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=");
			}
			sum += i;
		}
		System.out.print(sum);
		
		scanner.close();
	}

}
