package com.oops.sm;

public class Inheritance {

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
		Child obj = new Child();
		
		System.out.println(obj.daughter);
		
		System.out.println(obj.daughter1);
		
		System.out.println(obj.daughter2);
		
		System.out.println(((Parent)obj).daughter);
		
		obj.fun();
		obj.fun1();
		obj.fun2();
	}
}
