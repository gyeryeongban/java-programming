package Chap03Example;

import java.util.Scanner;

public class ScannerPractice01 {

	public static void main(String[] args) {
		System.out.println("Please enter name, age, city, MBTI information with space");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		int age = scanner.nextInt();
		String city = scanner.next();
		String MBTI = scanner.next();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("City: " + city);
		System.out.println("MBTI: " + MBTI);
		
		scanner.close();
		
		int num = 10;
		
		if (num > 15) {
			System.out.println("숫자가 15보다 큽니다.");
		}
		System.out.println("이 문장은 if 문 외부에 있습니다.");
	}

}
