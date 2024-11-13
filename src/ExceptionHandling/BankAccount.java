package ExceptionHandling;

import java.util.Scanner;
//creating a custom exception for the insufficient balance
class InsufficientBalanceException extends RuntimeException{

	//constructor to initialize the super class message attribute
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
	
}
//BankAccount class
public class BankAccount {
	private int balance;
	//constructor to initialize the balance of the account
	public BankAccount(int balance) {
		
		this.balance = balance;
	}
	

	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	//method for making the deposit to the account
	public void deposit(int amount) {
		this.balance+=amount;
	}
	//method to withdraw the money from the account
	public void withdraw(int amount) {
		if(amount>balance) {
			throw new InsufficientBalanceException("sorry insufficient balance");
			//exception to be thrown if the account
			//has insufficient balance 
		}
		//balance is updated here
		this.balance-=amount;
	}


	//main method
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the current balance of the customer: ");
		//create the bank account with the initial balance as entered
		//by user
		BankAccount b=new BankAccount(in.nextInt());
		System.out.println("Enter the amount to deposit: ");
		//call the deposit method to deposit the money to the bank
		b.deposit(in.nextInt());
		System.out.println("Enter the amount to be withdrawn: ");
		try {//since the withdraw method may throw an exception we need
			//handle it using try and catch statement
		b.withdraw(in.nextInt());//withdraw the specified amount
		//display the updated balance 
		System.out.println("You current balance is: "+b.getBalance());
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}


	
}
