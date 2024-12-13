

#include<iostream>
#include<cstring>
using namespace std;

class Student{
private:
	char name[30];
	int rollNumber;
	float marks;
	char grade;

public:
	char getGrade()   {
		return grade;
	}

	void setGrade(char grade) {
		this->grade = grade;
	}

	float getMarks()   {
		return marks;
	}

	void setMarks(float marks) {
		this->marks = marks;
	}

	char* getName()   {
		return name;
	}
	void setName(const char* name){
		strcpy(this->name, name);
	}

	int getRollNumber()   {
		return rollNumber;
	}

	void setRollNumber(int rollNumber) {
		this->rollNumber = rollNumber;
	}

	void acceptRecord(){
		cout << "Name : ";
		cin >> name;
		cout << "Roll Number : ";
		cin >> rollNumber;
		cout << "Marks : ";
		cin >> marks;
		cout << "Grade : ";
		cin >> grade;
	}

	void printRecord(){
		cout << "Name : " << name << "\n";
		cout << "Roll Number : " << rollNumber << "\n";
		cout << "Marks : " << marks << "\n";
		cout << "Grade : " << grade << "\n";
	}

	void calculateGrade(){
		cout << "Enter marks : ";
		cin >> marks;
		if(marks >= 90 && marks <= 100){
			grade = 'A';
		} else if(marks >= 80 && marks <= 89){
			grade = 'B';
		} else if(marks >= 70 && marks <= 79){
			grade = 'C';
		} else if(marks >= 60 && marks <= 69){
			grade = 'D';
		} else {
			grade = 'F';
		}
		cout << "Calculated Grade: " << grade << endl;
	}

	int menu_list( ){
		int choice;
		cout << "Enter " << endl ;
		cout << "1. Accept Information "  << endl ;
		cout << "2. Display Information "  << endl ;
		cout << "3. Calculate Grade "  << endl ;
		cout << "0. Exit the program"  << endl ;
		cout << "Enter your choice : ";
		cin >> choice;
		return choice;
	}


};
int main(void){
	int choice;
	Student s;
	while( ( choice = s.menu_list( ) ) != 0 ){
		switch(choice){
		case 1:
			s.acceptRecord();
			break;

		case 2:
			s.printRecord();
			break;

		case 3:
			s.calculateGrade();
			break;
		}
	}
	return 0;
}
