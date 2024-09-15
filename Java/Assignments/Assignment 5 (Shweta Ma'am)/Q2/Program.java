//2)Create a base class Vehicle with attributes like make and year. 
//Provide a constructor in Vehicle to initialize these attributes. 
//Derive a class Car that has an additional attribute model and 
//write a constructor that initializes make, year, and model. 
//Write a program to create a Car object and display its details.

package org.example.vehicle;

public class Program {
	public static void main(String[] arg) {
		Car c = new Car("Honda", 1986, "Acura");
		System.out.println(c.toString());
	}
}
