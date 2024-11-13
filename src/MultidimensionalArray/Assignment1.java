package MultidimensionalArray;

import java.util.Scanner;

public class Assignment1 {
	static void assignRandomValues(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100);
		}

	}

	static int maximum(int arr[]) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	static int sum(int arr[]) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	static double average(int arr[]) {
		return sum(arr) / arr.length;
	}

	static void display(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array: ");
		n=in.nextInt();
		int arr[]=new int[5];
		assignRandomValues(arr);
		System.out.println("The random values are: ");
		display(arr);
		System.out.println("Maximum : "+maximum(arr));
		System.out.println("Average: "+average(arr));
		
	}
}
