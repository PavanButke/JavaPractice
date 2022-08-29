package com.oops.sm;

import java.util.*;

public class AbstractEx {

	public static void main(String args[]) {
		
		
//		CarCompany obj= new CarCompany("A",11); --> Not Allowed
//		obj.Millege();
		
		CarCompany obj= new Toyota(null , "A",112);
		obj.Millege();
		obj= new Ferrari("hi","B",113);
		obj.Millege();
		
	}

	static abstract class CarCompany {
		String carType;
		int price;

		 CarCompany(String carType, int type) {

			this.carType = carType;
			this.price = price;
		}

		void Millege() {
				System.out.println("Car is of Type "+carType);
		}

	}

	static class Toyota extends CarCompany {
		List<Integer> productionCap;

		Toyota(List<Integer> productionCap , String carType , int price) {
			super(carType , price);
			this.productionCap= productionCap;
		}

		void Millege() {
			System.out.println("Car is of Type "+carType);
		}

	}

	static  class Ferrari extends CarCompany {

		String highDemand;
		
		Ferrari(String highDemand, String carType , int price){
		
			super(carType , price);
			this.highDemand= highDemand;
		}
			
		void Millege() {
			System.out.println("Car's price is "+price);
		}

	}
	
	static  class Mercedes extends CarCompany {

		String royal;
		
		Mercedes(String royal, String carType , int price){
		
			super(carType , price);
			this.royal= royal;
		}
			
//		void Millege() {
//			System.out.println("Car's price is "+price);
//		}
//      if we don't write this Millege function then we must have to declare a class as Abstract

	}

}
