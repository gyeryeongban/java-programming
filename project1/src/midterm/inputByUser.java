package midterm;

import java.util.Scanner;

public class inputByUser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int number = scanner.nextInt();
		
		System.out.print("문자 입력: ");
		String text = scanner.next();
		
		System.out.println(number);
		System.out.println(text);
		
		scanner.close();
	}

}
