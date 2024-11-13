package ExceptionHandling;

import java.util.Scanner;
//creating a custom exception for the insufficient balance
class InsufficientBalanceException extends RuntimeException{

	//constructor to initialize the super class message attribute
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
	
}
public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}
	

	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int amount) {
		this.balance+=amount;
	}
	public void withdraw(int amount) {
		if(amount>balance) {
			throw new InsufficientBalanceException("sorry insufficient balance");
			
		}
		this.balance-=amount;
	}


	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the current balance of the customer: ");
		BankAccount b=new BankAccount(in.nextInt());
		System.out.println("Enter the amount to deposit: ");
		b.deposit(in.nextInt());
		System.out.println("Enter the amount to be withdrawn: ");
		try {
		b.withdraw(in.nextInt());
		System.out.println("You current balance is: "+b.getBalance());
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}


	
}
