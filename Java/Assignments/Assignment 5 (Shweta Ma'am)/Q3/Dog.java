//Create a base class Animal with attributes like name, 
//and methods like eat() and sleep(). Create a subclass Dog 
//that inherits from Animal and has an additional method bark(). 
//Write a program to demonstrate the use of inheritance by creating 
//objects of Animal and Dog and calling their methods.



package org.example.animal;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(super.name + " is barking.");
	}
	
}
