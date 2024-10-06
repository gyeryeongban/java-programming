package project1;

public class Cat {
	String breed;
	String color;

	void eat() {
		System.out.println("eat() method");
	}
	
	void scratch() {
		System.out.println("scratch() method");
	}
	
	void meow() {
		System.out.println("meow() method");
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
	}

}
