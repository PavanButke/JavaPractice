 package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	
	public static void main(String args[]) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>(5);
		
		lhs.add("a");
		lhs.add("b");
		lhs.add("e");
		lhs.add("d");
		lhs.add("c");
		
		
		lhs.forEach(System.out::println);
	}
}
