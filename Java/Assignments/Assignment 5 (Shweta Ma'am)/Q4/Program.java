package org.example.student;

class Student{
	private String name;
	private double marks;
	
	public Student(String name, double marks){
		this.name = name;
		this.marks = marks;
	}
	
	public String getName() {
		return this.name;
	}
	public double getMarks() {
		return this.marks;
	}
	
	public void displayDetail() {
		System.out.println("Name  : " + this.name);
		System.out.println("Marks : " + this.marks);
	}
	
}

public class Program {
	public static void main(String[] args) {
		Student s = new Student("Neha", 88.20);
		s.displayDetail();
	}
}

