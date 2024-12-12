/*
 * Write a program to declare a pointer, initialise it with the address of a variable, &
   print the value using both the pointer and the variable. Demonstrate pointer
   assignment using two integer variables
 */
#include<iostream>
int main(){
	int a = 10;
	int b = 20;
	int *ptr;
	ptr = &a;
	printf("Value of a using variable : %d\n", a);
	printf("Value of a using pointer  : %d\n", *ptr);
	ptr = &b;
	printf("Value of b using variable : %d\n", b);
	printf("Value of b using pointer  : %d\n", *ptr);
	return 0;
}



