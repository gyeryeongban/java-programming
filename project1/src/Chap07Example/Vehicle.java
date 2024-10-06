package Chap07Example;

public class Vehicle {
	protected int speed;
	
	public void increaseSpeed(int increment) {
		speed += increment;
		System.out.println("Speed increased to " + speed);
	}
	
	public void decreaseSpeed(int decrement) {
		speed -= decrement;
		System.out.println("Speed decreased to " + speed);
	}
}
