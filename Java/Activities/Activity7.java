package activities;

//interface1
interface BicycleParts {
	public int tyre = 2;
	public int maxSpeed = 25;
}

//interface2
interface BicycleOperations {
	public void applyBrake(int Decrement);

	public void speedUp(int increment);

}

//base class implementing interface 1 and interface 2

class Bicycle implements BicycleParts, BicycleOperations {

	public int gears;
	public int currentSpeed;

	public Bicycle(int gears, int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}

	// implementation of applyBrake

	public void applyBrake(int decrement) {

		System.out.println("Current speed of Bicycle: " + this.currentSpeed);
		currentSpeed -= decrement;
		System.out.println("Current speed after applying brake: " + currentSpeed);
	}
//implementation of speedUp

	public void speedUp(int increment) {

		System.out.println("Current speed of Bicycle: " + this.currentSpeed);
		currentSpeed += increment;
		System.out.println("Current speed after accelerating: " + currentSpeed);
	}

//Base class method Bicycle description
	public String bicycleDesc() {
		return ("No of gears are :" + gears + "\nSpeed of bicycle is :" + maxSpeed);
	}
}

//Derived class
class MountainBike extends Bicycle {

	public int seatHeight;

	// Constructor
	public MountainBike(int gears, int currentSpeed, int startHeight) {
		super(gears, currentSpeed);
		seatHeight = startHeight;
	}

	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	public String bicycleDesc() {
		return (super.bicycleDesc() + "\nSeat height is " + seatHeight);
	}
}

public class Activity7 {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3, 0, 25);
		System.out.println(mb.bicycleDesc());
		mb.speedUp(20);
		mb.applyBrake(5);

	}

}
