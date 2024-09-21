package org.example.collection;

import java.util.Map;
import java.util.LinkedHashMap;

public class Program4 {
	public static void main(String[] args) {
		String input = "aabbccddeffg";
		System.out.print("First non reapeat character in a String is : ");
		Map<Character, Integer> m = new LinkedHashMap<>();
		
		for(Character c : input.toCharArray()) {
			m.put(c, m.get(c) == null ? 1 : m.get(c) + 1);
		}
		
		for(Character c : m.keySet()) {
			if(m.get(c) == 1) {
				System.out.println(c);
				break;
			}
		}
	}
}
