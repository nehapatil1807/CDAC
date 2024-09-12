
package org.example.bank;

public class BankAccount {
	private String accountNo;
	protected double balance; 
	
	public BankAccount(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			System.out.println("Balance          : " + balance);
			balance += amount;
			System.out.println("You have diposit : " + amount);
			System.out.println("New balance      : " + balance);
		}else
		{
			System.out.println("Amount should not be negative.");
		}
	}
	
	public void withdraw(double amount) { 
		if(amount > 0) {
			balance -= amount;
			System.out.println("You have wirhdraw " + amount);
			System.out.println("New balance      : " + balance);
		}else
		{
			System.out.println("Amount should not be negative.");
		}
	}
	
	public String toString() {
		return "Account No.      : " + accountNo + "\n" +
				"Balance          : " + balance;
	}
	
}
