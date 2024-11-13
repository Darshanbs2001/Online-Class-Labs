package MultidimensionalArray;

import java.util.Scanner;

public class Assignment2 {
	static Integer[][] addTwoMatrix(int rowSize,int colSize,Integer arr1[][],Integer arr2[][]) {
		Integer result[][]=new Integer[rowSize][colSize];
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				result[i][j]=arr1[i][j]+arr2[i][j];
				
			}
			
		}
		return result;
	}
	static void display(Integer arr[][]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
		}
		System.out.println();
	}
	static void takeInput(Integer arr[][]) {
	Scanner in=new Scanner(System.in);	
	System.out.println("Enter the elements into the array: ");
		
	for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=in.nextInt();
			}
		}
	}
	public static void main(String[] args) {
		int rowSize,colSize;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the row size of the array:");
		rowSize=in.nextInt();
		System.out.println("Enter the colum size of the array:");
		colSize=in.nextInt();
		Integer arr1[][]=new Integer[rowSize][colSize];
		Integer arr2[][]=new Integer[rowSize][colSize];
		takeInput(arr1);
		takeInput(arr2);
		System.out.println("The elements of the array - 1 are: ");
		display(arr1);
		System.out.println("The elements of the array -2 are: ");
		display(arr2);
		System.out.println("The result matrix is: ");
		Integer result[][]=addTwoMatrix(rowSize, colSize, arr1, arr2);
		display(result);
		

	}
}
