package org.example.collection;

import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Program3 {
	public static void display(Collection<?> c) {
		if(c == null) return;
		for(Object o : c) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> l1 = new LinkedList<>();
		List<Integer> l2 = new LinkedList<>();
		List<Integer> l3 = new LinkedList<>();
		
		l1.add(10);
		l1.add(50);
		l1.add(20);
		
		l2.add(30);
		l2.add(60);
		l2.add(40);
		l2.add(80);
		
		l3.add(70);
		l3.add(100);
		l3.add(90);
		
		Collections.sort(l1);
		System.out.println("Sorted List 1 : ");
		display(l1);
		
		Collections.sort(l2);
		System.out.println("Sorted List 2 : ");
		display(l2);
		
		Collections.sort(l3);
		System.out.println("Sorted List 3 : ");
		display(l3);
		
		l3.addAll(l1);
		l3.addAll(l2);
		System.out.println("List 1 & 2 added to List 3 :");
		display(l3);
		
		Collections.sort(l3);
		System.out.println("Sorted list 3 which is addition of list 1 & 2 :");
		display(l3);
		
	}
}
 