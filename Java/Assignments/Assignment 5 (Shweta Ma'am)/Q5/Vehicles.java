
package com.vehicle;

class Vehicle{
	protected String name;
	
	public Vehicle(String name) {
		this.name = name;
	}
	
	public void startEngine() {
		System.out.println(name + "'s engine is started.");
	}
	public void stopEngine() {
		System.out.println(name + "'s engine is stoped.");
	}
}
class Car extends Vehicle{
	
	public Car(String name) {
		super(name);
	}
	public void startEngine() {
		System.out.println(name + "'s engine is started.");
	}
	public void stopEngine() {
		System.out.println(name + "'s engine is stoped.");
	}
}
class Motorcycle extends Vehicle{
	public Motorcycle(String name) {
		super(name);
	}
	public void startEngine() {
		System.out.println(name + "'s engine is started.");
	}
	public void stopEngine() {
		System.out.println(name + "'s engine is stoped.");
	}
}

public class Vehicles {
	public static void main(String[] args) {
		Car c = new Car("Toyota");
		c.startEngine();
		c.stopEngine();
		
		System.out.println();
		
		Motorcycle m = new Motorcycle("Pulser");
		m.startEngine();
		m.stopEngine();
	}
}
