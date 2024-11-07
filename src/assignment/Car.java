package assignment;

import assignment.inheritance.Car;

public class Car {
	private String model;
	private String make;
	private short year;
	private int price;

//constructor to instantiate the objects with different values
	public Car(String model, String make, short year, int price) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
		this.price = price;
	}

	@Override
//this method is used to override the default before of the toString method to 
//print the object values
	public String toString() {
		// TODO Auto-generated method stub
		return "\tmake: " + this.make + "\n\tmodel: " + this.model +
				"\n\tyear: " + this.year + "\n\tprice: " + this.price;
	}

	public static void main(String args[]) {
		// create the Car object with passing the values
		Car c1 = new Car("Tata", "Nexon", (short) 2020, 200000);
		Car c2 = new Car("Toyota", "XUV", (short) 2015, 350000);
		System.out.println("Car-1 details:\n"+c1);
		System.out.println("Car-2 details:\n"+c2);
	}
}
