

#include<iostream>
using namespace std;

class BankAccount{
private:
	int accountNumber;
	char accountHolderName[30];
	double balance;
	double total;

public:
	const char* getAccountHolderName() const {
		return accountHolderName;
	}

	int getAccountNumber() const {
		return accountNumber;
	}

	void setAccountNumber(int accountNumber) {
		this->accountNumber = accountNumber;
	}

	double getBalance() const {
		return balance;
	}

	void setBalance(double balance) {
		this->balance = balance;
	}

	void acceptRecord(){
		cout << "Account Number : ";
		cin >> accountNumber;
		cout << "Account Holder Name : ";
		cin >> accountHolderName;
		cout << "Balance : ";
		cin >> balance;
	}

	void printRecord(){
			cout << "Account Number : " << accountNumber << endl;
			cout << "Account Holder Name : " << accountHolderName << endl;
			cout << "Balance : " << balance << endl;
		}

	void depositAmount(){
		double amount;
		cout << "Enter amount that u want to deposit : ";
		cin >> amount;
		total = amount+balance;
		cout << "Your total balance : " << total << endl;;
	}
	void withdrawAmount(){
		double a;
		if (total > 1000){
			cout << "Enter amount that u want to withdraw : ";
			cin >> a;
			double t = total - a;
			cout << "Amount Withdraw" << endl;
			cout << "Your total balance : " << t << endl;
		} else {
			cout << "Your balance is not sufficient to withdraw an amount";
		}
	}

	int menuList(){
		int choice;
		cout << "Enter " << endl ;
		cout << "0. Exit the Program"  << endl ;
		cout << "1. Accept the account details"  << endl ;
		cout << "2. Display the account details"  << endl ;
		cout << "3. Deposit money into an existing account"  << endl ;
		cout << "4. Withdraw money from an existing account"  << endl ;
		cout << "Enter your choice : ";
		cin >> choice;
		return choice;
	}

};

int main(){
	int choice;
	BankAccount b;

	while((choice = b.menuList()) != 0){
		switch(choice){
		case 1:
			b.acceptRecord();
			break;

		case 2:
			b.printRecord();
			break;

		case 3:
			b.depositAmount();
			break;
		case 4:
			b.withdrawAmount();
			break;
		}
	}
	return 0;
}
