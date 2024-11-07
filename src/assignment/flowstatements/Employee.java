package assignment.flowstatements;

import java.util.Scanner;
//An Employee class to store all the 
//salary details
public class Employee {
	private double basicSalary;
	private double HRA;
	private double DA;
	//to initialize the employee with
	//given basicSalary
	public Employee(double basicSalary) {
		
		this.basicSalary = basicSalary;
		if(basicSalary>15000) {
			//condition for the basic Salary 
			//greater than 15000
			this.HRA=basicSalary*0.20;
			this.DA=basicSalary*0.60;
		}
		else {
			//if the basic salary is less or equal
			//to 15000 then this will get executed
			this.HRA=3000;
			this.DA=basicSalary*0.70;
		}
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public double getHRA() {
		return HRA;
	}
	public double getDA() {
		return DA;
	}
	public static void main(String[] args) {
		Employee e;
		Scanner in=new Scanner(System.in);
		double basicSalary;
		double grossSalary;
		int userInput;
		do{//this is run until the user inputs as -1
			System.out.println("Enter the employee salary details: ");
			basicSalary=in.nextDouble();
			e=new Employee(basicSalary);
			grossSalary=e.basicSalary+e.getDA()+e.getHRA();
			System.out.println("Daily allowance is :Rs "+e.getDA());
			System.out.println("Hourse Rental allowance is Rs: "+e.getHRA());
			System.out.println("Gross Salary for employee:Rs "+grossSalary);
			System.out.println("Press -1 to continue looping or else type any other number");
			userInput=in.nextInt();
		}while(userInput==-1);
	}
	
}
