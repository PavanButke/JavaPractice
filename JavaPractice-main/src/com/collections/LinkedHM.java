package com.collections;

import java.util.*;

public class LinkedHM {

	
	public static void main(String args[]) {
		
		LinkedHashMap<Integer, String> linkedhm = new LinkedHashMap<>(5, .75f , true);

		linkedhm.put(1, "Alpha");
		linkedhm.put(2, "beta");
		linkedhm.put(3, "Tera");
		linkedhm.put(4, "quad");
		linkedhm.put(5, "penta");
		String s= linkedhm.get(2);
		s=linkedhm.get(1);
		s= linkedhm.get(5);
		
		
		linkedhm.forEach((k,v)->System.out.println(k+"--"+v));
	}
}
