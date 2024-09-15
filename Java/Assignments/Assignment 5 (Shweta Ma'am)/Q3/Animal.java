//Create a base class Animal with attributes like name, 
//and methods like eat() and sleep(). Create a subclass Dog 
//that inherits from Animal and has an additional method bark(). 
//Write a program to demonstrate the use of inheritance by creating 
//objects of Animal and Dog and calling their methods.


package org.example.animal;

public class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void eat() {
		System.out.println(this.name + " eats a meat.");
	}
	
	public void sleep() {
		System.out.println(this.name + " sleeps for 10 hours.");
	}
	
}
