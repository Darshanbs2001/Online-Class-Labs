package ExceptionHandling;

import java.util.Scanner;

//exception for invalid operator 
class InvalidOperationException extends RuntimeException {

	public InvalidOperationException(String msg) {
		super(msg);
	}

}

//exception to be raised when we try to divide by 0
class ZeroDivisionException extends RuntimeException {

	public ZeroDivisionException(String msg) {
		super(msg);
	}

}

//main class
public class SimpleCalculator {
	// main method
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int a, b;
			System.out.println("Enter the two numbers: ");
			a = in.nextInt();
			b = in.nextInt();

			System.out.println(
					"select from the operation such \naddition(+) , \nsubtraction(-),\nmultiplication(*),\ndivision(/) ");
			String op = in.next();//get the operation to be performed as string
			double result = 0;
			switch (op.charAt(0)) {//check the character at 0th position using switch
			case '+':
				result = a + b;//addition of two numbers
				break;
			case '-':
				result = a - b;//subtraction of two numbers
				break;
			case '*':
				result = a * b;//multiplication of two numbers
				break;
			case '/':
				if (b == 0) {//if the denominator is zero then 
					throw new ZeroDivisionException("Number division by zero is not allowed");

				}
				result = a / b;//division of two numbers
				break;
			default://handle the unsupported symbols
				throw new InvalidOperationException(
						"Sorry unsupported operator entered please choose from the above list of operators");
			}
			//display the result 
			System.out.println("Result is : " + result);
		} catch (InvalidOperationException e) {
			System.out.println(e.getMessage());
		} catch (ZeroDivisionException e) {
			System.out.println(e.getMessage());
		}

	}
}
