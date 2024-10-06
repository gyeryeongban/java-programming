package midterm;

import java.util.Scanner;

public class primeNumber {
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int count = 0;
		
		while (true) {
			int number = scanner.nextInt();
			
			if (number < 0) {
				break;
			}
			
			if (isPrime(number)) {
				System.out.print(number + " ");
				count++;
			}
		}
		
		System.out.println("소수의 개수: " + count);
				
		scanner.close();
	}

}
