package AbstractClassesAndInterfaces;

import java.util.Scanner;

abstract class Shape {
	abstract void calculateArea();
}

class Rectangle extends Shape {

	private int length;
	private int height;

	public Rectangle(int length, int height) {

		this.length = length;
		this.height = height;
	}

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of a Rectangle: " + (this.height * this.length));
	}

}

class Circle extends Shape {
	private int radius;

	public Circle(int radius) {

		this.radius = radius;
	}

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle: " + (3.142 * this.radius * this.radius));
	}

}

public class Assignment1 {
	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		System.out.println("Enter the length and height values: ");
		int height=in.nextInt();
		int length=in.nextInt();
		Rectangle r=new Rectangle(length,height);
		r.calculateArea();
		System.out.println("Enter the radius of the circle: ");
		int radius=in.nextInt();
		Circle c=new Circle(radius);
		c.calculateArea();
	}
}
