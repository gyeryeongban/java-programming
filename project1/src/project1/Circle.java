package project1;

public class Circle {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "Domino";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle dount = new Circle();
		dount.radius = 2;
		dount.name = "Dunkin";
		area = dount.getArea();
		System.out.println(dount.name + "의 면적은 " + area);
	}

}
