/*
 Write code to show the behaviour of pointers with const qualifier in various scenarios:
i. Pointer to a const value.
ii. const pointer to a value.
iii. const pointer to a const value.
 */
#include<iostream>
int main(){
	 const int *ptr;
	 int n = 10;
	 ptr = &n;
	 printf("Num 1 : %d\n", n);
	 printf("Num 1 : %d\n", *ptr);

	 int a = 20;
	 int *const ptr1 = &a;
	 printf("Value of a   : %d\n", a);
	 printf("Value of ptr : %d\n", *ptr1);

	 int c = 30;
	 const int *const ptr2 = &c;
	 printf("C    : %d\n", c);
	 printf("ptr2 : %d\n", *ptr2);
}


