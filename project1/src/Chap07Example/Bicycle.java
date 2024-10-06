package Chap07Example;

public class Bicycle extends Vehicle {
	private boolean isRacingBike;
	
	public Bicycle() {
		this.isRacingBike = false;
	}
	
	public void toggleRacingMode() {
		isRacingBike = !isRacingBike;
		System.out.println("Racing mode: " + (isRacingBike ? "On" : "Off"));
	}
}
