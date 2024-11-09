package AbstractClassesAndInterfaces;

import java.util.Scanner;
//create the abstract call shape
//with abstract method calculateArea
abstract class Shape {
	abstract void calculateArea();
}
//Rectangle class inherits the Shape class
//it needs to override the calculateArea since its abstract
class Rectangle extends Shape {
	//since a rectangle has length and height 
	//declare two integers length and height
	private int length;
	private int height;
	//constructor to initialize the length and height
	public Rectangle(int length, int height) {

		this.length = length;
		this.height = height;
	}
	//provide the implementation to the calculateArea 
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of a Rectangle: " + (this.height * this.length));
	}

}
//Circle class inherits Shape class
//now it also needs to override the calculateArea method
class Circle extends Shape {
	//A circle has a radius only 
	//so declare a integer variable as radius
	private int radius;
	//constructor to initialize the raidus values
	public Circle(int radius) {

		this.radius = radius;
	}
	//provide the implementation to the calculateArea method
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle: " + (3.142 * this.radius * this.radius));
	}

}

public class Assignment1 {
	public static void main(String[] args) {
		//scanner class for user inputs
		Scanner in =new Scanner(System.in);
		//ask for length and height as integer input
		System.out.println("Enter the length and height values: ");
		int height=in.nextInt();
		int length=in.nextInt();
		//create a reactangle class with the provided values
		Rectangle r=new Rectangle(length,height);
		r.calculateArea();//print the area of rectangle
		//ask for the radius as integer input for the circle
		System.out.println("Enter the radius of the circle: ");
		int radius=in.nextInt();
		//create the object for the given input radius
		Circle c=new Circle(radius);
		c.calculateArea();//print the area of the circle
	}
}
