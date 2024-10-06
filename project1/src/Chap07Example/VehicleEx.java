package Chap07Example;

public class VehicleEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		System.out.println("Testing Vehicle...");
		vehicle.increaseSpeed(10);
		vehicle.decreaseSpeed(5);
		
		Car car = new Car();
		System.out.println("\nTesting Car...");
		car.increaseSpeed(20);
		car.changeGear(2);
		car.decreaseSpeed(10);
		
		Bicycle bicycle = new Bicycle();
		System.out.println("\nTesting Bicycle...");
		bicycle.increaseSpeed(15);
		bicycle.toggleRacingMode();
		bicycle.decreaseSpeed(5);
	}

}
