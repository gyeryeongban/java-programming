package Chap03Example;

import java.util.Scanner;

public class NestedLoopPractice01 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = i; j < 5; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		
		int width = 5;
		int height = 3;
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the dan: ");
		int dan  = scanner.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\t", dan, i, dan * i);
		}
		
		scanner.close();
	}

}
