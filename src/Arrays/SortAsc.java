package Arrays;

import java.util.Scanner;

public class SortAsc {
    static void sort(int arr[]) {
    	int temp;
    	for(int i=0;i<arr.length;i++) {
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[i]>arr[j]) {
    				temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    	}
    }
    static void displayArray(int arr[]) {
    	for(int i:arr) {
    		System.out.print(i+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array: ");
		n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the "+n+" elements into the array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("The array before the sorting is: ");
		displayArray(arr);
		System.out.println("The array after sorting is: ");
		sort(arr);
		displayArray(arr);
		
		

	}
}
