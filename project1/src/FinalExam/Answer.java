package FinalExam;

public class Answer {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
		arr[i] = i * 2;
		}
		System.out.println(arr[3]);
		System.out.println(arr[0] + arr[arr.length - 1]);
	}

}
