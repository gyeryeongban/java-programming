package Chap07Example;

public class Car extends Vehicle {
	private int gear;
	
	public void changeGear(int newGear) {
		gear = newGear;
		System.out.println("Gear changed to " + gear);
	}
}
