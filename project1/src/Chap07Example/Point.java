package Chap07Example;

public class Point {
	private int x, y;
	
	Point() {
		this.x = this.y = 0;
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
