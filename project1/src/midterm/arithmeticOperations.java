package midterm;

public class arithmeticOperations {

	public static void main(String[] args) {
		// 1
		int number = 12345;
		
		int ones = number % 10;
		int tens = (number / 10) % 10;
		int hundreds = (number / 100) % 10;
		int thousands = (number / 1000) % 10;
		int tenThousands = (number / 10000);
		
		System.out.println("ones: " + ones);
		System.out.println("tens: " + tens);
		System.out.println("hundreds: " + hundreds);
		System.out.println("thousands: " + thousands);
		System.out.println("tenThousands: " + tenThousands);
		
		// 2
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a * c));
	}

}
