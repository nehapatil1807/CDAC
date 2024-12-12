/*
Create a program that demonstrates how type-casting a const pointer can lead to
unexpected behaviour
 */

#include<iostream>
int main(){
	const int a = 10;
	const int *ptr = &a;
	printf("Value before type-casting : %d\n", *ptr);

	int *ptr2 = (int*) ptr;
	*ptr2 = 20;
	printf("Value after type-casting  : %d\n", *ptr2);

	return 0;
}


