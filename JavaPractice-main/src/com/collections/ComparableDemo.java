package com.collections;

import java.util.*;

class Point implements Comparable{
	
	
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	
	

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}



	@Override
	public int compareTo(Object o) {
		Point p = (Point)o;
		if(this.x<p.x)
			return -1;
		
		else if(this.x>p.x)
			return 1;
		else 
			return 0;
	}
	
}



public class ComparableDemo {

	
	public static void main(String[] args) {
		TreeSet<Point> treeSet = new TreeSet<>();
		treeSet.add(new Point(1,2));
		treeSet.add(new Point(4,2));
		treeSet.add(new Point(3,2));
		
		
		System.out.println(treeSet);
	}
}
