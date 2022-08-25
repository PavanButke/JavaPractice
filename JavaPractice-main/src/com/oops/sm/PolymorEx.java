package com.oops.sm;


public class PolymorEx {

	static class Parent{
		int daughter=10;
		int daughter1=100;
		
		
		void fun() {
			System.out.println("Parent Function");
		}
		
		void fun1() {
			System.out.println("Parent Function 1");
		}
		
	}
	
	
	static class Child extends Parent{
		
		int daughter=50;
		int daughter2=500;
		
		void fun() {
			System.out.println("Child's Function");
		}
		
		void fun2() {
			System.out.println("Child's Function 2");
		}
	}
	
	public static void main(String []args) {
		Parent obj = new Child();
		
		System.out.println(obj.daughter); //Parent has daughter
		
		System.out.println(obj.daughter1); // Parent has daughter1		
		System.out.println(obj.daughter2); // Parent do not have daughter2
		
		

		
		obj.fun(); // Parent has fun
		obj.fun1(); //Parent has fun1
		obj.fun2(); // Parent do not have fun2

	}	
}
