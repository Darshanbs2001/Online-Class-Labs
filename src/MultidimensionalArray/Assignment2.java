package MultidimensionalArray;

import java.util.Scanner;

public class Assignment2 {
	//method to add to two matrix or arrays
	static Integer[][] addTwoMatrix(int rowSize,int colSize,Integer arr1[][],Integer arr2[][]) {
		Integer result[][]=new Integer[rowSize][colSize];
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				result[i][j]=arr1[i][j]+arr2[i][j];
				
			}
			
		}
		return result;
	}
	//display the given array
	static void display(Integer arr[][]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
		}
		System.out.println();
	}
	//method to take the input for the given array
	static void takeInput(Integer arr[][]) {
	Scanner in=new Scanner(System.in);	
	System.out.println("Enter the elements into the array: ");
		
	for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=in.nextInt();
			}
		}
	}
	//main method
	public static void main(String[] args) {
		int rowSize,colSize;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the row size of the array:");
		rowSize=in.nextInt();
		System.out.println("Enter the colum size of the array:");
		colSize=in.nextInt();
		Integer arr1[][]=new Integer[rowSize][colSize];
		Integer arr2[][]=new Integer[rowSize][colSize];
		takeInput(arr1);//take input for arr1
		takeInput(arr2);//take input for arr2
		System.out.println("The elements of the array - 1 are: ");
		display(arr1);//display the arr1 contents
		System.out.println("The elements of the array -2 are: ");
		display(arr2);//display the arr2 contents
		System.out.println("The result matrix is: ");
		//add arr1 and arr2
		Integer result[][]=addTwoMatrix(rowSize, colSize, arr1, arr2);
		display(result);//display the sum of two array
	}
}
