/*
9. Write a program to declare an array of structures to store information about 5 students
(e.g., Name, Age, Marks). Allow the user to input details and print the list.
 */


#include<iostream>
using namespace std;
struct Student{
	char name[30];
	int age;
	int marks;
};
int main(){
	struct Student s[5];
	for(int i = 0; i < 5; i++){
		cout << "Enter detail of student : "<< i+1 << "\n";
		cout << "Name : ";
		cin.ignore();
		cin.getline(s[i].name, 30);
		cout << "Age : ";
		cin >> s[i].age;
		cout << "Marks : ";
		cin >> s[i].marks;
		cout << endl;
	}
	cout << "Student Details : \n";
	for(int i = 0; i < 5; i++){
		cout << "Student : " << i+1 << "\n";
		cout << "Name : "<< s[i].name << "\n";
		cout << "Age : "<< s[i].age << "\n";
		cout << "Marks : "<< s[i].marks << "\n";
	}
	return 0;
}






