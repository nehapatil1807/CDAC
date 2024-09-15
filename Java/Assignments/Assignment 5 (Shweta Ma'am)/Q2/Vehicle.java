//2)Create a base class Vehicle with attributes like make and year. 
//Provide a constructor in Vehicle to initialize these attributes. 
//Derive a class Car that has an additional attribute model and 
//write a constructor that initializes make, year, and model. 
//Write a program to create a Car object and display its details.


package org.example.vehicle;

public class Vehicle {
	private int year;
	private String make;
	
	public Vehicle(String make, int year) {
		this.make = make;
		this.year = year;
	}
	
	public String getMake() {
		return this.make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public int getYear() {
		return this.year;
	}
	public void setMake(int year) {
		this.year = year;
	}
	
	public String toString() {
		return "Make  : " + this.make + "\n" +
				"Year  : " + this.year;
	}
	
}
