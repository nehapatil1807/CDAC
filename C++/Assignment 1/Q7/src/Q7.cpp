/*
Write a short program in both C and C++ that declares a structure, initializes it, and
prints its members
 */

//#include<stdio.h>
//struct Student{
//	char name[30];
//	int age;
//};
//int main(){
//	Student s = {"Neha", 22};
//	printf("Name : %s\n", s.name);
//	printf("Age  : %d\n", s.age);
//	return 0;
//}

#include<iostream>
using namespace std;
struct Student{
	char name[30];
	int age;
};
int main(){
		Student s = {"Lisa", 22};
		cout<< "Name : " << s.name << "\n";
		cout<< "Age  : " << s.age;
}


