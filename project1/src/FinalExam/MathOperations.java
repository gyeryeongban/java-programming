package FinalExam;

public class MathOperations {
	public int add(int a, int b) {
		return a + b;
	}
	
	public double add(double a, double b) {
		return a + b;
	}

	public String add(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {
		MathOperations mo = new MathOperations();
		System.out.println(mo.add(5, 3));
		System.out.println(mo.add(2.5, 3.1));
		System.out.println(mo.add("Hello, ", "World!"));
	}

}
