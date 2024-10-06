package FinalExam;

public class ArrayUtils {
	public static int findMax(int[] number) {
		int max = number[0];
		
		for (int i = 1; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] numbers = {11, 2, 30, 14, -5};
		System.out.println(findMax(numbers)); // Output: 30
	}

}
