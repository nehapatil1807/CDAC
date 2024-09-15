//Create a base class Animal with attributes like name, 
//and methods like eat() and sleep(). Create a subclass Dog 
//that inherits from Animal and has an additional method bark(). 
//Write a program to demonstrate the use of inheritance by creating 
//objects of Animal and Dog and calling their methods.


package org.example.animal;

public class Program {
	 public static void main(String[] args) {
		 Animal a = new Animal("Lion");
		 a.eat();
		 a.sleep();
		 
		 System.out.println();
		 
		 Dog d = new Dog("Tom");
		 d.eat();
	     d.sleep();
		 d.bark();
	 }
}
