package Arrays;

import java.util.Scanner;

public class Assignment1 {
	static int sum(int arr[]) {
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		return sum;
	}
	static double avg(int arr[]) {
		return sum(arr)/arr.length;
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the "+n+" elements into the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		for(int i:arr) {
			System.out.println(i);
		}
		
		System.out.println("Sum ="+sum(arr));
		System.out.println("Avg="+avg(arr));
		

	}
}
