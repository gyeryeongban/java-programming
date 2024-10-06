package Chap03Example;

import java.util.Scanner;

public class ScannerPractice02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println(name);
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.println(age);
		
		scanner.close();
	}

}
