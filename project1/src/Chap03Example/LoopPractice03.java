package Chap03Example;

import java.util.Scanner;

public class LoopPractice03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number as size of rectangle: ");
		int size  = scanner.nextInt();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.printf("%4d", (j + 1) + i * size);
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
