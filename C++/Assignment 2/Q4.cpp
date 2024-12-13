
#include<iostream>
using namespace std;

class Employee{

private:
	int empID;
	char empName[30];
	double empSalary;

public:
	int getEmpId() const {
		return empID;
	}

	void setEmpId(int empId) {
		empID = empId;
	}

	const char* getEmpName() const {
		return empName;
	}

	double getEmpSalary() const {
		return empSalary;
	}

	void setEmpSalary(double empSalary) {
		this->empSalary = empSalary;
	}

	void acceptRecord(){
		cout << "Employee ID : ";
		cin >> empID;
		cout << "Employee Name : ";
		cin >> empName;
		cout << "Employee Salary : ";
		cin >> empSalary;
	}

	void printRecord(){
		cout << "Employee ID : " << empID << endl;
		cout << "Employee Name : " << empName << endl;
		cout << "Employee Salary : " << empSalary << endl;
	}

	void calculateGrossSalary(){
		double grossSalary;
		if(empSalary <= 5000){
			grossSalary = empSalary + (empSalary*0.10);
		} else if(empSalary > 5000 && empSalary <= 10000){
			grossSalary = empSalary + (empSalary*0.15);
		} else if(empSalary > 10000){
			grossSalary = empSalary + (empSalary*0.20);
		}
		cout << "Your Gross Salary is : " << grossSalary << endl;
	}

	int menu_list( ){
			int choice;
			cout << "Enter " << endl ;
			cout << "1. Accept Information "  << endl ;
			cout << "2. Display Information "  << endl ;
			cout << "3. Calculate Gross Salary"  << endl ;
			cout << "0. Exit the program"  << endl ;
			cout << "Enter your choice : ";
			cin >> choice;
			return choice;
		}
};

int main(){
	int choice;
	Employee e;
	while((choice = e.menu_list()) != 0){
		switch(choice){
		case 1:
			e.acceptRecord();
			break;

		case 2:
			e.printRecord();
			break;

		case 3:
			e.calculateGrossSalary();
			break;
		}
	}
	return 0;
}

