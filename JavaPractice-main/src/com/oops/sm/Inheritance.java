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
		Parent obj = new Child();
		
		System.out.println(obj.daughter);
		
		System.out.println(obj.daughter1);
		
		//System.out.println(obj.daughter2);
		
		System.out.println(((Child)obj).daughter2);
		
		obj.fun();
		obj.fun1();
		((Child)obj).fun2(); // Compiler Error Will Occurs , because compiler Parent(on LHS) is not having fun2 in it's class
		//To avoid this error we can TYPECAST Child
	}	
}
