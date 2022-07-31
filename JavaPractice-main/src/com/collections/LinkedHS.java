package com.collections;

import java.util.Iterator;
import java.util.*;

public class LinkedHS {
	
	public static void main(String args[]) {
		
		
		HashSet<String> lhs= new HashSet<>(5);
		
		lhs.add("aggd");
		lhs.add("bkkd");
		lhs.add("bumbae");
		lhs.add("bo");
		
		Iterator<String> itr = lhs.iterator();
		
		while(itr.hasNext()) { 
			System.out.println(itr.hasNext());
		}
	}

}
