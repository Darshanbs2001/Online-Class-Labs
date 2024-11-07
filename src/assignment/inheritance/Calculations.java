package assignment.inheritance;

//base class Shape abstract class with getArea  
//note that here we declare the method but we don't
//provide any implementation for it
abstract class Shape {
	abstract double getArea();

}

//creating the circle class as inheriting the shape
class Circle extends Shape {

	private double radius;
	// parameterized constructor with one argument
	// to initialize the radius value with the passed value

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	// since the getArea() needs to be
	// overriden so over ride it to give us the area of cirlce
	// given by pi*radius*radius

	@Override
	double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}

//Square class also needs to inherit the Shape class 
class Square extends Shape {
	private double length;

	// constructor for the initializing the length values
	public Square(double length) {
		super();
		this.length = length;
	}

	// over ride the base class method to return the area of
	// square given by lenght*length;
	@Override
	double getArea() {
		return this.length * this.length;
	}

}

//Rectangle class also inherites base class Shape
class Rectangle extends Shape {
	// A Rectangle has two attributes width, height
	private double width, height;

	// Constructor to initialize the width and height of the Retangle
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// Over ride the getArea method to
	// return the area of the Rectangle
	// given by width*height
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}

}

//main class 
public class Calculations {
	// main method
	public static void main(String[] args) {
		// creating the object of Cirlce class
		Circle c = new Circle(5.5);
		// Creating the object of Square class
		Square s = new Square(7);
		// Creating the object of Rectangel class
		Rectangle r = new Rectangle(4, 3);
		System.out.println("Area of Cirle : " + c.getArea());
		System.out.println("Area of Square :" + s.getArea());
		System.out.println("Area of Rectangle : " + r.getArea());

	}
}
