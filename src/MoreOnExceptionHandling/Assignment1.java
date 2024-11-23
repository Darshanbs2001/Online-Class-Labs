package MoreOnExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		try {
		//Create a Scanner object
		Scanner in =new Scanner(System.in);
		System.out.print("Enter a number: ");
		//take the integer
		int n=in.nextInt();
		//if the entered input is a number then print that number
	    System.out.printf("Your entered number is : %d",n);
		}
		//handling the input mismatch exception 
		catch(InputMismatchException e) {
			System.out.println("Please enter a valid integer value");
		}
	}
}
