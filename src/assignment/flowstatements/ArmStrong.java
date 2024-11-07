package assignment.flowstatements;

import java.util.Scanner;
//Program to calculate the armstrong
//numbers in the given range
public class ArmStrong {
	//function to return the cube of 
	//a given number
	public static int cube(int n) {
		int cubed=n;
		for(int i=1;i<3;i++) {
			cubed*=n;
		}
		return cubed;
	}
	//function to print the armstrong number in
	// the given range
	public void printArmstrongNumber(int start, int end) {

		int sum = 0;
		for (int i = start; i <= end; i++) {
			int n = i;
			sum=0; 
			
			while (n != 0) {
				int rem = n % 10;
				sum += cube(rem);
				n = n / 10;

			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		ArmStrong a=new ArmStrong();
		Scanner in =new Scanner(System.in);
		int start,end;
		//get the starting number and 
		//ending number as input
		System.out.println("Enter the starting value: ");
		start=in.nextInt();
		System.out.println("Enter the ending value: ");
		end=in.nextInt();
		a.printArmstrongNumber(start, end);
	}
}
