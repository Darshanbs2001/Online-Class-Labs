package Arrays;

import java.util.Scanner;

public class Assignment1 {
	//method to find the sum of the given array
	static int sum(int arr[]) {
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		return sum;
	}
	//method to find the average of the given array
	static double avg(int arr[]) {
		return sum(arr)/arr.length;
	}
	//main method
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the "+n+" elements into the array:");
		//take the input for the array 
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		//finding the sum and printing it
		System.out.println("Sum ="+sum(arr));
		//finding the average and printing
		System.out.println("Average="+avg(arr));
		

	}
}
