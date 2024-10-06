package midterm;

public class ternaryOperation {

	public static void main(String[] args) {
		int a = 10;  // 첫 번째 숫자
        int b = 20;  // 두 번째 숫자
        int c = 30;  // 세 번째 숫자

        // 삼항 연산자를 사용하여 두 숫자 중 큰 값을 찾음
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        // 결과 출력
        System.out.println("가장 큰 수는: " + max);
	}

}
