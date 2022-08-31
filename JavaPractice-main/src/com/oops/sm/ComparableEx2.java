package com.oops.sm;


import java.util.*;
import java.io.*;


public class ComparableEx2 {
	
	public static void main(String []args) {
		
		Car[] cars= new Car[5];
		cars[0] = new Car(200,100,"A");
		cars[1] = new Car(2002,1010,"B");
		cars[2] = new Car(100,1200,"C");
		cars[3] = new Car(2100,100,"D");
		cars[4] = new Car(100,200,"E");
		
		//Arrays.sort(cars);

		
		//This will not work as As cars can not be compared
		// As we know that  ArrayList and PriorityQueue can implement the Sorting , we can use Pq for comparing here
		ArrayList<Car> pq = new ArrayList<>();
		for(Car car: cars) {	
			pq.add(car);
		}
		
		Collection.sort(pq);
		
		System.out.println(pq); // Runtime Error Occurs	
	}
	
	
	
	static class Car implements Comparable<Car>{
		int speed;
		int price;
		String name;
		
		Car(int speed , int price , String name){
			this.speed = speed;
			this.price= price;
			this.name= name;
		}

		@Override
		public String toString() {
			return "Car [speed=" + speed + ", price=" + price + ", name=" + name + "]";
		}
		
		public int compareTo(Car other) {
			return this.speed - other.speed;
		}
	}
	
}
