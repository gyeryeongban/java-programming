package midterm;

public class star {

	public static void main(String[] args) {		
		// 정사각형
		int size = 5; // 정사각형의 한 변의 길이

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // 사각형
        int width = 7; // 사각형의 너비
        int height = 4; // 사각형의 높이

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // 직각삼각형
        int height2 = 5; // 삼각형의 높이

        for (int i = 1; i <= height2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	}

}
