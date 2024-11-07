package assignment;

import java.util.Scanner;

public class LargestOf3 {
public static void main(String[] args) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a b c");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();//take 3 values a,b,c as input
	if(a>b && a>c) {//check wheather a is the biggest of 3
		System.out.println("a is the largest of 3");
	}
	else if(b>c) {//check wheather b is the larger than c since a is already smaller than b
		System.out.println("b is the largest of 3");
	}
	
	else {//if a and b are not larger then c is the largest
		System.out.println("c is the largest of 3");
	}
	if(a>b) {//checks if the a is greater than b
	 if(a>c) {//checks if the a is greter than c
		 System.out.println("a is the largest of 3");
	 }
	 else if(b>c){//checks if the 
		 System.out.println("b is the largest of 3");
	 }
	 else {
		 System.out.println("c is the largest of 3");
	 }
	}
}
}
