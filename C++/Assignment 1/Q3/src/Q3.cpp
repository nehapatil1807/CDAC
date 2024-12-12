/*
 * Create a program to demonstrate the use of NULL and its importance in pointer
   initialisation. Write code to check for NULL before dereferencing a pointer
 */
#include<iostream>
int main(){
	int *ptrNum = NULL;
	printf("Value of null pointer : %p\n", ptrNum);
	int num = 10;
	ptrNum = &num;
	printf("Value of ptrNum : %d\n", *ptrNum);
	*ptrNum = 50; // dereferencing
	printf("Value of ptrNum : %d\n", *ptrNum);
}


