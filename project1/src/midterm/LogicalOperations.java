package midterm;

public class LogicalOperations {
	public static int xor(int a, int b) {
        return (a | b) & ~(a & b);
    }
	
	public static void main(String[] args) {
//		boolean a = true;
//		boolean b = true;
//		
//		System.out.println((a | b) & ~(a & b));		    

        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        int result = xor(a, b);  // should be 6 (0110 in binary)
        System.out.println("Result of " + a + " XOR " + b + " is " + result);
	}

}
