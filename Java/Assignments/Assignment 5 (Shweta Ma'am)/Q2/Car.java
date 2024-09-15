//2)Create a base class Vehicle with attributes like make and year. 
//Provide a constructor in Vehicle to initialize these attributes. 
//Derive a class Car that has an additional attribute model and 
//write a constructor that initializes make, year, and model. 
//Write a program to create a Car object and display its details.


package org.example.vehicle;

public class Car extends Vehicle {
	private String model;
	
	public Car(String make, int year, String model) {
		super(make, year);
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String toString() {
		return super.toString() + "\n" +
			   "Model : " + this.model;
	}
}
