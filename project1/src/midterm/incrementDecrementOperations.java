package midterm;

public class incrementDecrementOperations {

	public static void main(String[] args) {
		int d = 3;
		
		int a = d++;
		System.out.println(a + "," + d);
		
		a = ++d;
		System.out.println(a + "," + d);
		
		a = d--;
		System.out.println(a + "," + d);
		
		a = --d;
		System.out.println(a + "," + d);
	}

}
