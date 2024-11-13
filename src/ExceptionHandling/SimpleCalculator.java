package ExceptionHandling;

import java.util.Scanner;

class InvalidOperationException extends RuntimeException {

	public InvalidOperationException(String msg) {
		super(msg);
	}

}

class ZeroDivisionException extends RuntimeException {

	public ZeroDivisionException(String msg) {
		super(msg);
	}

}

public class SimpleCalculator {
	public static void main(String[] args) {
		try {
		Scanner in =new Scanner(System.in);
		int a,b;
		System.out.println("Enter the two numbers: ");
		a=in.nextInt();
		b=in.nextInt();
		
		
			System.out.println("select from the operation such \naddition(+) , \nsubtraction(-),\nmultiplication(*),\ndivision(/) ");
			String op=in.next();
			double result=0;
			switch(op.charAt(0)) {
			case '+':result=a+b;
					 break;
			case '-':result=a-b;
					 break;
			case '*':result=a*b;
					 break;
			case '/':
					if(b==0) {
							throw new ZeroDivisionException("Number division by zero is not allowed"); 
					 	
					}
					result=a/b;
					 break;
			default: throw new InvalidOperationException("Sorry unsupported operator entered please choose from the above list of operators");
			}
		  System.out.println("Result is : "+result);
		}
		catch(InvalidOperationException e) {
			System.out.println(e.getMessage());
		}
		catch(ZeroDivisionException e) {
			System.out.println(e.getMessage());
		}

	}
}
