package Polymorphism;
//base class vehicle which has only method
//start
class Vehicle {
	void start() {
		System.out.println("Vehical started");
	}
}
//Car class inherits the vehicle class
//overrides the start method with car started
class Car extends Vehicle {

	@Override
	void start() {
		System.out.println("Car started");
	}

}
//Motor class inherits the vehicle class
//overrides the start method with motorcycle started
class Motorcycle extends Vehicle {

	@Override
	void start() {
		System.out.println("Motorcycle started");
	}

}
//class gargae is created to permit
//them for service any vehicle
class Garage{
	void serviceVehicle(Vehicle vehicle) {
		 vehicle.start();
		 System.out.println("Vehical serviced");
	}
}
public class Assignment1 {
	public static void main(String[] args) {
		Car c=new Car();//create car object
		Motorcycle m=new Motorcycle();//create motorcycle object
		Garage g=new Garage();//create garage object
		g.serviceVehicle(c);//call the serviceVehical method for car
		g.serviceVehicle(m);//call the serviceVehical method for motorcycle

		
	}
}
