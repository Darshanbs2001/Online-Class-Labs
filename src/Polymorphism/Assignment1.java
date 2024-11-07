package Polymorphism;

class Vehicle {
	void start() {
		System.out.println("Vehical started");
	}
}

class Car extends Vehicle {

	@Override
	void start() {
		System.out.println("Car started");
	}

}

class Motorcycle extends Vehicle {

	@Override
	void start() {
		System.out.println("Motorcycle started");
	}

}
class Garage{
	void serviceVehicle(Vehicle vehicle) {
		 vehicle.start();
		 System.out.println("Vehical serviced");
	}
}
public class Assignment1 {
	public static void main(String[] args) {
		Car c=new Car();
		Motorcycle m=new Motorcycle();
		Garage g=new Garage();
		g.serviceVehicle(c);
		g.serviceVehicle(m);

		
	}
}
