package assignment;

import java.util.Scanner;

public class DegreeConverter {
	public static void main(String[] args) {
		System.out.println("Enter the temperature in degrees: ");
		double celsius;
		Scanner in=new Scanner(System.in);
		celsius=in.nextDouble();
		double fahrenheit;
		fahrenheit=((celsius*9)/5)+32;
		System.out.println("The "+celsius+" C is "+fahrenheit+" F");

	}
}
