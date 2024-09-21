package org.example.collection;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Program1 {
	public static void display(Collection<?> c) {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(80);
		l.add(30);
		l.add(1);
		l.add(56);
		l.add(80);
		l.add(30);
		l.add(10);
		 
		Set<Integer> s = new HashSet<>();
		
		System.out.println("Duplicate Integers are : ");
		for(Integer n : l) {
			if(s.add(n) == false) {
				System.out.println(n);
			}
		}
	}
}
