/*
Create a struct in C++ and add member functions to initialize data members and
display their values
 */

#include<iostream>
#include<cstring>
using namespace std;
struct Persone{
	char name[30];
	int age;

	void initialize(const char n[30], int a){
		strcpy(name,n);
		age = a;
	}

	void display(){
		cout<< "Name : " << name << "\n";
		cout << "Age : " << age;
	}

};
int main(){
	Persone p;
	p.initialize("Sheetal", 50);
	p.display();
	return 0;
}


