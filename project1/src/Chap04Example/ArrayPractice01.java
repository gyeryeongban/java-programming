package Chap04Example;

import java.util.Scanner;

public class ArrayPractice01 {

	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5};
		
//		System.out.println(arr[0]);
//		
//		arr[2] = arr[0]++ - arr[1];	
//		System.out.println(arr[2]);
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
//		double sum = 0.0;
//		
//		for (int i = 0; i < gradeArr.length; i++) {
//			sum += gradeArr[i];
//		}
//		
//		double average = sum / gradeArr.length;
//		System.out.println("Sum: " + sum);
//		System.out.format("Average: %.2f", average);
		
//		int[] arr = {90, 70, 80, 79, 82, 16, 19, 99, 89, 87};
//		
//		int max = arr[0];
//		
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		
//		System.out.println("The max is " + max);
		
//		String[] myArr;
//		myArr = new String[3];
//		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("Enter the three strings:");
//		
//		for (int i = 0; i < 3; i++) {
//			myArr[i] = s.nextLine();
//		}
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print(myArr[i] + " ");
//		}
//		
//		s.close();
		
//		int[][] matrix = {
//				{1, 2, 3, 4},
//				{5, 6, 7, 8},
//				{9, 10, 11, 12}
//		};
//		
//		System.out.println(matrix[0][2]);
//		
//		int[][] matrix = {
//				{1, 2, 3},
//				{4, 5, 6},
//				{7, 8, 9}
//				};
//		
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.println(matrix[i][j]);
//			}
//		}
		
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
 	}

}
