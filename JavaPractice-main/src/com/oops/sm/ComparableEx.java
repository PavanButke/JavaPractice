package com.oops.sm;

import java.util.*;

public class ComparableEx {

	
	public static void main(String []args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(19);
		list.add(20);
		list.add(21);
		list.add(22);
		
		Collections.sort(list);
		System.out.println(list);
		
		ArrayList<String> list1 = new ArrayList<>();
			list1.add("Asaram");
			list1.add("Bapu");
			list1.add("is a Corrupt");
			list1.add("dick");

			Collections.sort(list);
			System.out.println(list);
			
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		pq1.add(11);
		pq1.add(21);
		pq1.add(22);
		pq1.add(31);
		while(pq1.size()>0) {
			System.out.println(pq1.remove());
		}
		
		PriorityQueue<String> pq2 = new PriorityQueue<>();
		pq2.add("Hi");
		pq2.add("John");
		pq2.add("Kallow");
		pq2.add("meets");
		while(pq1.size()>0) {
			System.out.println(pq2.remove());
		}
	}
}
