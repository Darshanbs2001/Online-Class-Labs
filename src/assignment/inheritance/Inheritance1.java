package assignment.inheritance;

//base class Vehicle
class Vehicle {
	// Vehicle Attributes
	private String make, model;
	private int year, maximumSpeed;

	// Constructor to initialize the attributes
	public Vehicle(String make, String model, int year, int maximumSpeed) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.maximumSpeed = maximumSpeed;
	}

	// method to be over ridden by child class
	void drive() {
		System.out.println("The vehicle is moving");
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

}

//derived class class Car 
class Car extends Vehicle {
	// call the super function to send the data to be
	// initialized in the base class
	public Car(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed);
	}

	// over ride the drive class to have car info
	@Override
	void drive() {
		System.out.println(super.getMake() + " " + super.getModel() 
		+ " Car is driving");
	}

	// over ride the toString method to display the care details
	@Override
	public String toString() {
		return "Car-details:\n Car Make: " + this.getMake() 
		+ "\n Car Model: " + this.getModel()
		+ "\n Year of production: " + this.getYear() 
		+ "\n Top Speed: " + this.getMaximumSpeed();
	}

}

//Derived class Bike 
class Bike extends Vehicle {
	// Call the super function again to initailize the attributes
	// with bike values
	public Bike(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed);
	}

	// over ride the drive to get bike info
	@Override
	void drive() {
		System.out.println(super.getMake() 
		+ " " + super.getModel() 
		+ " Bike is driving ");
	}

	// over ride the getString method to
	// display the bike details
	@Override
	public String toString() {
		return "Bike-details:\n Bike Make: " 
				+ this.getMake() + "\n Bike Model: " + this.getModel()
				+ "\n Year of production: " + this.getYear() 
				+ "\n Top Speed: " + this.getMaximumSpeed();
	}
}

//main class
public class Inheritance1 {
	// main method
	public static void main(String[] args) {
		// Create a Car object
		Car c = new Car("suzuki", "creta", 2012, 190);
		// Create a Bike object
		Bike b = new Bike("Hero", "splender", 1998, 90);
		// call the car.drive method so that car
		// Can arrive
		c.drive();
		// print the car details
		System.out.println(c);
		// call the bike.drive method so that bike
		// Can arrive
		b.drive();
		// print the Bike details
		System.out.println(b);
	}
}
