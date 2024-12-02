package MultidimensionalArray;

import java.util.Scanner;

public class Assignment1 {
	// method to assign the random values to the array
	static void assignRandomValues(int arr[][][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					// here we use the math.random method to generate the random
					// integer value
					arr[i][j][k] = (int) (Math.random() * 100);
				}
			}
		}
	}

//method to find the maximum of given array
	static int maximum(int arr[][][]) {
		int max = arr[0][0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (arr[i][j][k] > max) {
						max = arr[i][j][k];
					}
				}
			}
		}
		return max;
	}

//method to get the sum of the given array
	static int sum(int arr[][][]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					sum += arr[i][j][k];
				}
			}
		}
		return sum;
	}

//method to get the average of the given array
	static double average(int arr[][][]) {
		return sum(arr) / arr.length * arr.length * arr.length;
	}

//method to display the given array elements
	static void display(int arr[][][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
			}
		}
		System.out.println();
	}

//main method
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array: ");
		n = in.nextInt();
		int arr[][][] = new int[n][n][n];
		// initialize the array with random values
		assignRandomValues(arr);
		// display the array that is generated
		System.out.println("The random values are: ");
		display(arr);
		// find the maximum of the random array
		System.out.println("Maximum : " + maximum(arr));
		// find the average of the random array
		System.out.println("Average: " + average(arr));

	}
}
