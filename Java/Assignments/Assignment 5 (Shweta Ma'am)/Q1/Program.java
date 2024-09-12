package org.example.bank;

public class Program {
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount("12345", 25000.32, 30000);
		s.deposit(10000);
		System.out.println(s.toString());
		
		System.out.println();
		
		s.withdraw(40000);
		System.out.println(s.toString());
		
		System.out.println();
		
		s.deposit(-40000);
		System.out.println(s.toString());
		
		System.out.println();
		
		s.withdraw(30000);
		System.out.println(s.toString());
	}
}
