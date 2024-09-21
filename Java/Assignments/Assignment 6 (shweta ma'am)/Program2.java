package org.example.collection;

import java.util.*;

class Person implements Comparable<Person>{
	int age;
	String name;
	
	public Person() {
		
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(Person p) {
		return this.age - p.age;
	}
	
	public String toString() {
		return "Name : " + this.name + "   " +
			   "Age  : " + this.age;
	}
}

class ComparedByAge implements Comparator<Person>{
	public int compare(Person p1, Person p2) {
		return p1.age - p2.age;
	}
}

class ComparedByName implements Comparator<Person>{
	public int compare(Person p1, Person p2) {
		if(p1.age != p2.age) {
			return p1.age - p2.age;
		}
		else {
			return p1.name.compareTo(p2.name);
		} 
	}
}

public class Program2 {
	public static void display(Collection<?> c) {
		if(c == null) return;
		for(Object o : c) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		List<Person> l = new LinkedList<>();
		Person p1 = new Person(18, "Saeee");
		Person p2 = new Person(18, "Nehaa");
		Person p3 = new Person(30, "Jisoo");
		Person p4 = new Person(2, "Rosee");
		
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		
		Collections.sort(l, new ComparedByAge());
		System.out.println("Person sorted by age :");
		display(l);
		
		System.out.println();
		
		Collections.sort(l, new ComparedByName());
		System.out.println("Person sorted by name : ");
		display(l);
		
	}
}
