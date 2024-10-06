package Chap06Example;

public class Circle {
	double radius;
	String name;
	
	public Circle() {
		radius = 1;
		name = "No Name";
	}
	
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
	
	public Circle(int i) {
		radius = i;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "Domino");
		Circle donut = new Circle();
		
		System.out.println(pizza);
		System.out.println(donut);
	}
}
