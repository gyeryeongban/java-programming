package Chap06Example;

public class Rectangle {
	public int width, height;
	
	public Rectangle() {
		this(0, 0);
	}
	
	public Rectangle(int size) {
		this(size, size);
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5, 20);
		Rectangle rect2 = new Rectangle(5);
		Rectangle rect3 = new Rectangle();
		
		System.out.println("Width:" + rect1.width + ", height:" + rect1.height + ", area:" + rect1.getArea());
		System.out.println("Width:" + rect2.width + ", height:" + rect2.height + ", area:" + rect2.getArea());
		System.out.println("Width:" + rect3.width + ", height:" + rect3.height + ", area:" + rect3.getArea());
	}

}
