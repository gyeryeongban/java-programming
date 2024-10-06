package midterm;

public class switchCase {

	public static void main(String[] args) {
		int temperature = 41;
		
		if (temperature > 30) {
			System.out.println("It's a hot day.");
		} else if (temperature > 20) {
			System.out.println("It's a warm day.");
		} else {
			System.out.println("It's a cold day.");
		}
		
		switch (temperature) {
			case 1:
				System.out.println("It's a hot day.");
				break;
			case 2:
				System.out.println("It's a warm day.");
				break;
			case 3:
				System.out.println("It's a cold day.");
				break;
		}
	}

}
