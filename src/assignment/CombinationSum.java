package assignment;

import java.util.Scanner;

public class CombinationSum {
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the three numbers: ");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		System.out.println((a+" + "+b)+" = "+(a+b));
		System.out.println(b+" + "+c+" = "+(b+c));
		System.out.println(a+" + "+c+" = "+(a+c));

	}
}
