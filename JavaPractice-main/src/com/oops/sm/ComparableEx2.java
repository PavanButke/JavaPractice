package com.oops.sm;


import java.util.*;



public class ComparableEx2 {
	
	public static void main(String []args) {
		
		Car[] cars= new Car[5];
		cars[0] = new Car(200,100,"A");
		cars[1] = new Car(2002,1010,"B");
		cars[2] = new Car(100,1200,"C");
		cars[3] = new Car(2100,100,"D");
		
		//Arrays.sort(cars);

		
		//This will not work as As cars can not be compared
		// As we know that  ArrayList and PriorityQueue can implement the Sorting , we can use Pq for comparing here
		PriorityQueue<Car> pq = new PriorityQueue<>();
		for(Car car: cars) {	
			pq.add(car);
		}
	}
	
	static class Car{
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
	}
	
}
