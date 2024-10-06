package project1;

public class day2 {

	public static void main(String[] args) {
		double d = 0.1234;
		double e = 1234E-4;
		float f = 0.1234f;
		double w = .1234D;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(w);
		
		String c = "aaa\tbbb";
		System.out.println(c);
		
		String str = "Hello" + "World!" + "\t" + "123";
		System.out.println(str);
		
		int number  = 12345;
		
		int ones = number % 10;
		int tens = (number / 10) % 10;
		int hundreds = (number / 100) % 10;
		int thousands = (number / 1000) % 10;
		int tenThousands = (number / 10000);
		
		System.out.println("Ones: " + ones);
		System.out.println("Tens: " + tens);
		System.out.println("Hundreds: " + hundreds);
		System.out.println("Thousands: " + thousands);
		System.out.println("TenThousands: " + tenThousands);
		
		System.out.println(Math.pow(5, 3.1));
		
		int a  = 5;
		int b  = 3;
		
		b += 3;
		
		System.out.println(a);
		System.out.println(b);
		
		boolean ab = true;
		boolean cd = false;
		
		int i = 1;
		System.out.println(i++);
		System.out.println(++i);
		
		int j = 10;
		System.out.println(j--);
		System.out.println(--j);
	}

}
