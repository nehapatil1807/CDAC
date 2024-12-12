/*
   Write a program that explains the concept of a wild pointer and how it can lead to
   undefined behaviour. Show how initialising a pointer can resolve this issue.
 */
#include<iostream>
int main(){
	int *ptr; // Wild pointer
	printf("Value of pointer : %d\n", ptr);
	int *ptr1 = nullptr;
	printf("Value of pointer : %d\n", ptr1);
	return 0;
}



