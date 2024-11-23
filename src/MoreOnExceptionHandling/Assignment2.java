package MoreOnExceptionHandling;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		try {
		//create a Scanner object
		Scanner in =new Scanner(System.in);
		//prompt the user for the input
		System.out.println("Enter the number : ");
		String n=null;//take the input as string
		if(n==null) {
			throw new NullPointerException();
		}
		int num=Integer.parseInt(n);//convert the string to Integer Object
		System.out.println("The converted value is: "+num);
		}
		//handle the null pointer exception that occurs due n being null
		catch(NullPointerException e) {
			System.out.println("The value cannot be null");
		}
		//handle the NumberFormatException will be thrown if the string doesn't contain
		//a number in it by parseInt method
		catch(NumberFormatException e) {
			System.out.println("invalid number format");
		}
	}
}
