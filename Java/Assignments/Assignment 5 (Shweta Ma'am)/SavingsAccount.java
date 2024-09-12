
package org.example.bank;

public class SavingsAccount extends BankAccount {
	private double limit;
	
	public SavingsAccount(String accountNo, double balance, double limit) {
		super(accountNo, balance);
		this.limit = limit;
	}
	
	public void withdraw(double amount) { 
		if(amount > 0) {
			if(limit > amount) {
				if(amount < balance) {
					balance -= amount;
					System.out.println("Withdrow         : " + limit);
					System.out.println("New balance      : " + balance);
			}else {
				System.out.println("Amount should be smaller than balance.");
			}
		} else {
			System.out.println("Limit Excceded.....");
		}
	 }else {
		 System.out.println("Amount should be positive not negative.");
	 }
  }
	
	public String toString() {
		return super.toString() + "\n";
	}
			 
}
