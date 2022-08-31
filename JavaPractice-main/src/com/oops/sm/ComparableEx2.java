package com.oops.sm;

import java.util.Arrays;

public class ComparableEx2 {
	
	public static void main(String []args) {
		
		Car[] cars= new Car[5];
		cars[0] = new Car(200,100,"A");
		cars[1] = new Car(2002,1010,"B");
		cars[2] = new Car(100,1200,"C");
		cars[3] = new Car(2100,100,"D");
		
		Arrays.sort(cars);
		for(Car car: cars) {
			System.out.println(car); 
		}
		
		//This will not work as As cars can not be compared
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
