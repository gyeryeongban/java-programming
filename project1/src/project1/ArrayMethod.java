package project1;

import java.util.Scanner;

public class ArrayMethod {
	public static int[] generatedArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 2;
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = scanner.nextInt();
		int[] generatedArray = generatedArray(size);
		System.out.println("Generated Array:");
		for (int value : generatedArray) {
			System.out.print(value + " ");
		}
		
//		String s = "test";
//		s[0] = 'e';
		
		String fruits = "apple,banana,cherry";
		String[] splitFruits = fruits.split(",");
		
		for (String fruit : splitFruits) {
			System.out.println(fruit);
		}
		
		String fruits2 = "apple, banana, cherry";
		String[] splitFruits2 = fruits2.split(", ");
		
		for (String fruit2 : splitFruits2) {
			System.out.println(fruit2);
		}
		
		String document = "The apple is sweet. I like apple.";
		String searchFor = "apple";
		int count = 0;
		int fromIndex = 0;
		
		while ((fromIndex = document.indexOf(searchFor, fromIndex)) != -1) {
			count++;
			fromIndex++;
		}
		System.out.println("The word '" + searchFor + "' appears " + count + " times.");		
 	}
	
}
