package assignment;
enum BankName{
	ICICI(6.3),
	HDFC(5.8),
	SBI(6.0);
	double intrestRate;
	BankName(double interestRate){
		this.intrestRate=interestRate;
	}
	
	
}
public class BankAccount {
	double accountBalance;
	String accountHolderName;
	BankName bankName;
	
	public BankAccount(double accountBalance, String accountHolderName, BankName bankName) {
		
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public BankName getBankName() {
		return bankName;
	}
	public void deposit(double amount) {
		accountBalance+=amount;
	}
	public void withdraw(double amount) {
		accountBalance-=amount;
	}
	public void calculateInterest(int numberOfYears) {
		double totalInterest=bankName.intrestRate*numberOfYears*accountBalance;
		System.out.println(totalInterest);
	}

	public static void main(String[] args) {
		BankAccount acc=new BankAccount(12000,"Jack",BankName.HDFC);
	}
}
