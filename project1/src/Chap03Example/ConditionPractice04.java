package Chap03Example;

import java.util.Scanner;

public class ConditionPractice04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int firstNumber = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
		int secondNumber = scanner.nextInt();
		
		System.out.print("Enter an operator (+, -, *, /): ");
		String operator = scanner.next();
		
		if (secondNumber == 0 && operator == "/") {
			System.out.println("Error: Division by zero is not allowed.");
		} else {
			if (operator.equals("+")) {
				int result = firstNumber + secondNumber;
				System.out.print("Result: " + result);
			
			} else if (operator.equals("-")) {
				int result = firstNumber - secondNumber;
				System.out.print("Result: " + result);
			
			} else if (operator.equals("*")) {
				int result = firstNumber * secondNumber;
				System.out.print("Result: " + result);
			
			} else if (operator.equals("/")) {
				int result = firstNumber / secondNumber;
				System.out.print("Result: " + result);
			}
		}
		
		scanner.close();
	}

}
