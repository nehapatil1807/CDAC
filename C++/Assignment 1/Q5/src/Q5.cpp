/*
Write a program demonstrating the difference between
const int *ptr,
int *const ptr, and
const int *const ptr
 */

#include<iostream>
int main(){
	// const int *ptr
	int num1 = 10;
	const int *ptr = &num1;
	num1 = 50; // ok
//	*ptr = 60; // no dereferrencing
	printf("Num 1 : %d\n", num1);
	printf("ptr   : %d\n", *ptr);

	// int *const ptr
	int a = 20;
	int *const ptr1 = &a;
	a = 70;
	*ptr1 = 50;
	printf("Value of a   : %d\n", a);
	printf("Value of ptr : %d\n", *ptr1);

	// const int *const ptr
	int b = 20;
	const int *const ptr2 = &b;
	b = 70;
//	*ptr2 = 50; // no derefferencing
	printf("Value of b   : %d\n", b);
	printf("Value of ptr2 : %d\n", *ptr2);

	return 0;
}


